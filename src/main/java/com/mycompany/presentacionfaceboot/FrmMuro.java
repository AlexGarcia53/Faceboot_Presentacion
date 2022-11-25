/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import com.mycompany.proxyclientebroker.ProxyClienteBroker;
import dominio.Publicacion;
import dominio.Usuario;
import interfaces.IProxy;
import interfaces.IObservadorRegistrarPublicacion;
import javax.swing.JOptionPane;
import notificacion.CanalizadorEventos;
import notificacion.ObservableRegistrarPublicacion;
import notificacion.OyenteNotificacionesBroker;

/**
 *
 * @author Jarol
 */
public class FrmMuro extends javax.swing.JFrame implements IObservadorRegistrarPublicacion {
    private static FrmMuro frmMuro;
    private Long idUsuario;
    private IProxy proxyClienteBroker;
    /**
     * Creates new form FrmMuro
     */
    private FrmMuro(Long idUsuario, IProxy proxyClienteBroker) {
        initComponents();
        this.proxyClienteBroker= proxyClienteBroker;
        this.idUsuario= idUsuario;
        this.lblUsuario.setText(""+this.idUsuario);
//        this.suscribirseEventoRegistrarPublicacion();
    }
    
    public static FrmMuro obtenerFrmMuro(Long idUsuario, IProxy proxyClienteBroker){
        if(frmMuro==null){
            frmMuro= new FrmMuro(idUsuario,proxyClienteBroker);
        }
        return frmMuro;
    }
  
    public void suscribirseEventoRegistrarPublicacion(){
        this.proxyClienteBroker.suscribirseEventoRegistrarPublicacion(frmMuro);
    }
    
    public void desuscribirseEventoRegistrarPublicacion(){
        this.proxyClienteBroker.desuscribirseEventoRegistrarPublicacion(frmMuro);
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
        lblUsuario = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        seccionMenu.add(btnHacerPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 290, 30));

        btnEditarPerfil.setBackground(new java.awt.Color(255, 217, 183));
        btnEditarPerfil.setActionCommand("");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        seccionMenu.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 110, 30));

        btnSalir.setBackground(new java.awt.Color(255, 217, 183));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setActionCommand("");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        seccionMenu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 70, 30));

        btnEnviarMensaje.setBackground(new java.awt.Color(255, 217, 183));
        btnEnviarMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviarMensaje.setText("Mensajes");
        btnEnviarMensaje.setActionCommand("");
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });
        seccionMenu.add(btnEnviarMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 90, 30));
        seccionMenu.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, 30));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gael\\Documents\\GITHUB\\Faceboot_Presentacion\\src\\images\\logo3.png")); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seccionMenu.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 50));

        fondo.add(seccionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHacerPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerPublicacionActionPerformed
        FrmPublicacion frmPublicacion= FrmPublicacion.obtenerFrmPublicacion(proxyClienteBroker);
        frmPublicacion.setVisible(true);
    }//GEN-LAST:event_btnHacerPublicacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.desuscribirseEventoRegistrarPublicacion();
        FrmInicioSesion frmInicioSesion= FrmInicioSesion.obtenerFrmInicioSesion(this.proxyClienteBroker);
        frmInicioSesion.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnHacerPublicacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel seccionMenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificarRegistroPublicacion(String actualizacion) {
        JOptionPane.showMessageDialog(this, actualizacion, "Mensaje del servidor", JOptionPane.INFORMATION_MESSAGE);
    }
}
