/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import com.mycompany.proxyclientebroker.ProxyClienteBroker;
import dominio.Comentario;
import dominio.Publicacion;
import dominio.Usuario;
import excepciones.ErrorBusquedaPublicacionesException;
import interfaces.IObservadorEditarComentario;
import interfaces.IObservadorEditarPublicacion;
import interfaces.IObservadorEliminarComentario;
import interfaces.IObservadorEliminarPublicacion;
import interfaces.IObservadorRegistrarComentario;
import interfaces.IProxy;
import interfaces.IObservadorRegistrarPublicacion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import utils.Barra;
import utils.PublicacionCompleta;

/**
 *
 * @author Jarol
 */
public class FrmMuro extends javax.swing.JFrame implements IObservadorRegistrarPublicacion, IObservadorEditarPublicacion, IObservadorEliminarPublicacion,
        IObservadorRegistrarComentario, IObservadorEditarComentario, IObservadorEliminarComentario{
    private static FrmMuro frmMuro;
//    private Long idUsuario;
    private Usuario usuario;
    private IProxy proxyClienteBroker;
    public List<PublicacionCompleta> publicaciones= new ArrayList<>();
    /**
     * Creates new form FrmMuro
     */
    public FrmMuro(Usuario usuario, IProxy proxyClienteBroker) {
        initComponents();
        this.proxyClienteBroker= proxyClienteBroker;
        this.usuario= usuario;
        this.btnEditarPerfil.setText(usuario.getUsuario());
        cpnMuro.setVerticalScrollBar(new Barra());
//        cpnMuro.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        this.consultarPublicaciones();
        this.suscribirseEventoRegistrarPublicacion();
        this.suscribirseEventoEditarPublicacion();
        this.suscribirseEventoEliminarPublicacion();
        this.suscribirseEventoEditarComentario();
        this.suscribirseEventoRegistrarComentario();
        this.suscribirseEventoEliminarComentario();
    }
    
    public void consultarPublicaciones(){
        try{
            List<Publicacion> publicaciones = this.proxyClienteBroker.consultarPublicaciones();
            this.pintarPublicaciones(publicaciones);
        }catch(ErrorBusquedaPublicacionesException e){
            this.mostrarError(e.getMessage());
        }
    }
    
    public void pintarPublicaciones(List<Publicacion> publicaciones){
        for(Publicacion publicacion: publicaciones){
            System.out.println(publicacion);
            PublicacionCompleta pnlPublicacion= new PublicacionCompleta(this.usuario, publicacion, this.proxyClienteBroker);
            this.publicaciones.add(pnlPublicacion);
            this.pnlPublicaciones.add(pnlPublicacion,0);
        }
        this.pnlPublicaciones.repaint();
        this.pnlPublicaciones.revalidate();
    }
    
    private void mostrarError(String error) {
        JOptionPane.showMessageDialog(this, error, "Error!...", JOptionPane.ERROR_MESSAGE);
    }
    
//    public static FrmMuro obtenerFrmMuro(Long idUsuario, IProxy proxyClienteBroker){
//        if(frmMuro==null){
//            frmMuro= new FrmMuro(idUsuario,proxyClienteBroker);
//        }
//        return frmMuro;
//    }
    
    public void suscribirseEventoRegistrarComentario(){
        this.proxyClienteBroker.suscribirseEventoRegistrarComentario(this);
    }
    
    public void desuscribirEventoRegistrarComentario(){
        this.proxyClienteBroker.desuscribirseEventoRegistrarComentario(this);
    }
    
    public void suscribirseEventoEditarComentario(){
        this.proxyClienteBroker.suscribirseEventoEditarComentario(this);
    }
    
    public void desuscribirEventoEditarComentario(){
        this.proxyClienteBroker.desuscribirseEventoEditarComentario(this);
    }
    
    public void suscribirseEventoEliminarComentario(){
        this.proxyClienteBroker.suscribirseEventoEliminarComentario(this);
    }
    
    public void desuscribirEventoEliminarComentario(){
        this.proxyClienteBroker.desuscribirseEventoEliminarComentario(this);
    }
    
    public void suscribirseEventoEliminarPublicacion(){
        this.proxyClienteBroker.suscribirseEventoEliminarPublicacion(this);
    }
    
    public void desuscribirEventoEliminarPublicacion(){
        this.proxyClienteBroker.desuscribirseEventoEliminarPublicacion(this);
    }
    
    public void suscribirseEventoEditarPublicacion(){
        this.proxyClienteBroker.suscribirseEventoEditarPublicacion(this);
    }
    
    public void desuscribirEventoEditarPublicacion(){
        this.proxyClienteBroker.desuscribirseEventoEditarPublicacion(this);
    }
    
    public void suscribirseEventoRegistrarPublicacion(){
        this.proxyClienteBroker.suscribirseEventoRegistrarPublicacion(this);
    }
    
    public void desuscribirseEventoRegistrarPublicacion(){
        this.proxyClienteBroker.desuscribirseEventoRegistrarPublicacion(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        seccionMenu = new javax.swing.JPanel();
        btnHacerPublicacion = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEnviarMensaje = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        pnlMuro = new javax.swing.JPanel();
        cpnMuro = new javax.swing.JScrollPane();
        pnlPublicaciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seccionMenu.setBackground(new java.awt.Color(240, 115, 0));
        seccionMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHacerPublicacion.setBackground(new java.awt.Color(255, 217, 183));
        btnHacerPublicacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHacerPublicacion.setText("Publica aquí lo que estás pensando");
        btnHacerPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerPublicacionActionPerformed(evt);
            }
        });
        seccionMenu.add(btnHacerPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 290, 30));

        btnEditarPerfil.setBackground(new java.awt.Color(255, 217, 183));
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        seccionMenu.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 110, 30));

        btnSalir.setBackground(new java.awt.Color(255, 217, 183));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setActionCommand("");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        seccionMenu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 70, 30));

        btnEnviarMensaje.setBackground(new java.awt.Color(255, 217, 183));
        btnEnviarMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviarMensaje.setText("Mensajes");
        btnEnviarMensaje.setActionCommand("");
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });
        seccionMenu.add(btnEnviarMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 90, 30));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seccionMenu.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 50));

        fondo.add(seccionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 80));

        cpnMuro.setBorder(null);

        pnlPublicaciones.setBackground(new java.awt.Color(255, 217, 183));
        pnlPublicaciones.setLayout(new javax.swing.BoxLayout(pnlPublicaciones, javax.swing.BoxLayout.Y_AXIS));
        cpnMuro.setViewportView(pnlPublicaciones);

        javax.swing.GroupLayout pnlMuroLayout = new javax.swing.GroupLayout(pnlMuro);
        pnlMuro.setLayout(pnlMuroLayout);
        pnlMuroLayout.setHorizontalGroup(
            pnlMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpnMuro, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        pnlMuroLayout.setVerticalGroup(
            pnlMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpnMuro)
        );

        fondo.add(pnlMuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 580, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHacerPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerPublicacionActionPerformed
        this.desuscribirseEventoRegistrarPublicacion();
        this.desuscribirEventoEditarPublicacion();
        this.desuscribirEventoEliminarPublicacion();
        this.desuscribirEventoEditarComentario();
        this.desuscribirEventoRegistrarComentario();
        this.desuscribirEventoEliminarComentario();
        FrmPublicacion frmPublicacion= new FrmPublicacion(usuario, this.proxyClienteBroker);
        frmPublicacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHacerPublicacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.desuscribirseEventoRegistrarPublicacion();
        this.desuscribirEventoEditarPublicacion();
        this.desuscribirEventoEliminarPublicacion();
        this.desuscribirEventoEditarComentario();
        this.desuscribirEventoRegistrarComentario();
        this.desuscribirEventoEliminarComentario();
        FrmInicioSesion frmInicioSesion= new FrmInicioSesion(this.proxyClienteBroker);
        frmInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        this.desuscribirseEventoRegistrarPublicacion();
        this.desuscribirEventoEditarPublicacion();
        this.desuscribirEventoEliminarPublicacion();
        this.desuscribirEventoEditarComentario();
        this.desuscribirEventoRegistrarComentario();
        this.desuscribirEventoEliminarComentario();
        frmEditarPerfil perfil= new frmEditarPerfil(this.usuario, this.proxyClienteBroker);
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        this.desuscribirseEventoRegistrarPublicacion();
        this.desuscribirEventoEditarPublicacion();
        this.desuscribirEventoEliminarPublicacion();
        this.desuscribirEventoEditarComentario();
        this.desuscribirEventoRegistrarComentario();
        this.desuscribirEventoEliminarComentario();
        FrmNotificar notificacion= new FrmNotificar(usuario, proxyClienteBroker);
        notificacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.desuscribirseEventoRegistrarPublicacion();
        this.desuscribirEventoEditarPublicacion();
        this.desuscribirEventoEliminarPublicacion();
        this.desuscribirEventoEditarComentario();
        this.desuscribirEventoRegistrarComentario();
        this.desuscribirEventoEliminarComentario();
    }//GEN-LAST:event_formWindowClosing

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHacerPublicacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane cpnMuro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnlMuro;
    private javax.swing.JPanel pnlPublicaciones;
    private javax.swing.JPanel seccionMenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificarRegistroPublicacion(Publicacion actualizacion) {
//        JOptionPane.showMessageDialog(this, "Se añadió una nueva publicación", "Mensaje del servidor", JOptionPane.INFORMATION_MESSAGE);
        PublicacionCompleta pnlPublicacion= new PublicacionCompleta(this.usuario, actualizacion, this.proxyClienteBroker);
        this.publicaciones.add(pnlPublicacion);
        this.pnlPublicaciones.add(pnlPublicacion, 0);
        this.pnlPublicaciones.repaint();
        this.pnlPublicaciones.revalidate();
    }

    @Override
    public void notificarEdicionPublicacion(Publicacion publicacion) {
        System.out.println("Llego");
        for (int i = 0; i < publicaciones.size(); i++) {
            if(publicaciones.get(i).getPublicacion().getId()==publicacion.getId()){
                publicaciones.get(i).setPublicacion(publicacion);
                publicaciones.get(i).actualizarEdicionContenido();
            }
        }
//        for(PublicacionCompleta panelPublicacion: publicaciones){
//            if(panelPublicacion.getPublicacion().getId()==publicacion.getId()){
//                panelPublicacion.setPublicacion(publicacion);
//                panelPublicacion.actualizarContenido();
//                publicaciones., panelPublicacion)
//            }
//        }
//        this.pnlPublicaciones.repaint();
//        this.pnlPublicaciones.revalidate();
    }

    @Override
    public void notificarEliminacionPublicacion(Publicacion publicacion) {
        for (int i = 0; i < publicaciones.size(); i++) {
            if(publicaciones.get(i).getPublicacion().getId()==publicacion.getId()){
                this.pnlPublicaciones.remove(publicaciones.get(i));
                this.pnlPublicaciones.repaint();
                this.pnlPublicaciones.revalidate();
                publicaciones.remove(i);
            }
        }
    }

    @Override
    public void notificarRegistroComentario(Comentario comentario) {
        for (int i = 0; i < publicaciones.size(); i++) {
            if(publicaciones.get(i).getPublicacion().getId()==comentario.getPublicacion().getId()){
                publicaciones.get(i).getPublicacion().agregarComentario(comentario);
                publicaciones.get(i).actualizarEdicionContenido();
            }
        }
    }

    @Override
    public void notificarEdicionComentario(Comentario comentario) {
        for (int i = 0; i < publicaciones.size(); i++) {
            if(publicaciones.get(i).getPublicacion().getId()==comentario.getPublicacion().getId()){
                publicaciones.get(i).getPublicacion().editarComentario(comentario);
                publicaciones.get(i).actualizarEdicionContenido();
            }
        }
    }

    @Override
    public void notificarEliminacionComentario(Comentario comentario) {
        System.out.println("Entró a notificar eliminación");
        System.out.println(comentario);
        for (int i = 0; i < publicaciones.size(); i++) {
            if(publicaciones.get(i).getPublicacion().getId()==comentario.getPublicacion().getId()){
                publicaciones.get(i).getPublicacion().eliminarComentario(comentario);
                publicaciones.get(i).actualizarEdicionContenido();
//                this.pnlPublicaciones.remove(publicaciones.get(i));
//                this.pnlPublicaciones.repaint();
//                this.pnlPublicaciones.revalidate();
//                publicaciones.get(i).getPublicacion().eliminarComentario(comentario);
            }
        }
    }
}
