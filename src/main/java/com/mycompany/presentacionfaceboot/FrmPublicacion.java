/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import dominio.Contenido;
import dominio.Hashtag;
import dominio.Publicacion;
import dominio.Usuario;
import excepciones.ErrorGuardarPublicacionException;
import interfaces.IProxy;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jarol
 */
public class FrmPublicacion extends javax.swing.JFrame {
    IProxy proxyClienteBroker;
    Usuario usuario;
    /**
     * Creates new form FrmPublicacion
     */
    public FrmPublicacion(Usuario usuario, IProxy proxyClienteBroker) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.proxyClienteBroker=proxyClienteBroker;
        this.txtTextoPlano = initTextArea(this.txtTextoPlano);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTextoPlano = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPublicar = new javax.swing.JButton();
        btnAñadirImagen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtHashtags = new javax.swing.JTextField();
        txtEtiquetados = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("HACER PUBLICACIÓN");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel4.setText("Formato: @Persona @Persona");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Mensaje:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(240, 115, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        fondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 140, 40));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 150, 40));

        txtTextoPlano.setColumns(20);
        txtTextoPlano.setRows(5);
        txtTextoPlano.setMaximumSize(new java.awt.Dimension(13, 20));
        jScrollPane5.setViewportView(txtTextoPlano);

        fondo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 190));

        lblImagen.setBackground(new java.awt.Color(0, 0, 0));
        lblImagen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 340, 220));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Personas a etiquetar:");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        btnPublicar.setBackground(new java.awt.Color(240, 115, 0));
        btnPublicar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPublicar.setForeground(new java.awt.Color(255, 255, 255));
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });
        fondo.add(btnPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 140, 40));

        btnAñadirImagen.setBackground(new java.awt.Color(240, 115, 0));
        btnAñadirImagen.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnAñadirImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirImagen.setText("Añadir");
        btnAñadirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirImagenActionPerformed(evt);
            }
        });
        fondo.add(btnAñadirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 140, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Imagen:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        txtHashtags.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHashtagsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHashtagsFocusLost(evt);
            }
        });
        txtHashtags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHashtagsActionPerformed(evt);
            }
        });
        fondo.add(txtHashtags, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 310, 30));

        txtEtiquetados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEtiquetadosActionPerformed(evt);
            }
        });
        fondo.add(txtEtiquetados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Hashtags:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel9.setText("Formato: #Hashtag #Hashtag");
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed

        
//        Date fechaActual= new Date();
        GregorianCalendar fechaPublicacion= new GregorianCalendar();
//        fechaPublicacion.setTimeInMillis(fechaActual.getTime());



        String textoPlano = this.txtTextoPlano.getText();
        String imagen = this.lblImagen.getText();
        Contenido contenido = new Contenido(textoPlano,imagen);
        String campoHashtags= this.txtHashtags.getText().replace(" ", "");
        if(!campoHashtags.equals("")){
            System.out.println(campoHashtags);
            String[] hashtags= campoHashtags.split("#");
            for (int i = 0; i < hashtags.length; i++) {
                if (!hashtags[i].equals("")) {
                    contenido.agregarHashtag(new Hashtag(hashtags[i]));
                }
            }
        }
        Publicacion publicacion = new Publicacion(fechaPublicacion,this.usuario,contenido);

 
        try{
            Publicacion respuesta = this.proxyClienteBroker.registrarPublicacion(publicacion);
            this.mostrarMensaje("Se registró correctamente la publicación");
        }catch(ErrorGuardarPublicacionException e){
            this.mostrarMensaje(e.getMessage());
        }
    }//GEN-LAST:event_btnPublicarActionPerformed
    private JTextArea initTextArea(JTextArea texto){
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        return texto;
    }
    
    private void btnAñadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirImagenActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG & PNG", "jpg", "png","gif");
        jfileChooser.setFileFilter(filtrado);
        
        int respuesta = jfileChooser.showOpenDialog(this);
        
        if(respuesta == JFileChooser.APPROVE_OPTION){
           String path = jfileChooser.getSelectedFile().getPath();
           Image imagen = new ImageIcon(path).getImage();
           ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(),Image.SCALE_SMOOTH));
           lblImagen.setIcon(icono);
           lblImagen.setFont(new java.awt.Font("Lucida Grande", 1, 0));
           lblImagen.setText(path);
           
        }
    }//GEN-LAST:event_btnAñadirImagenActionPerformed

    private void txtHashtagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHashtagsActionPerformed

        
    }//GEN-LAST:event_txtHashtagsActionPerformed

    private void txtEtiquetadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEtiquetadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEtiquetadosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FrmMuro muro = new FrmMuro(this.usuario, this.proxyClienteBroker);
        muro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtHashtagsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHashtagsFocusGained
//        this.txtHashtags.setText("");
    }//GEN-LAST:event_txtHashtagsFocusGained

    private void txtHashtagsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHashtagsFocusLost
//        this.txtHashtags.setText("Formato: #Hashtag #Hashtag");
    }//GEN-LAST:event_txtHashtagsFocusLost

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtEtiquetados;
    private javax.swing.JTextField txtHashtags;
    private javax.swing.JTextArea txtTextoPlano;
    // End of variables declaration//GEN-END:variables
}
