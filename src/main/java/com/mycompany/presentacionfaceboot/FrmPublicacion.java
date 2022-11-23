/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import dominio.Contenido;
import dominio.Publicacion;
import interfaces.IProxy;
import javax.swing.JOptionPane;

/**
 *
 * @author Jarol
 */
public class FrmPublicacion extends javax.swing.JFrame {
    private static FrmPublicacion frmPublicacion;
    IProxy proxyClienteBroker;
    /**
     * Creates new form FrmPublicacion
     */
    public FrmPublicacion(IProxy proxyClienteBroker) {
        initComponents();
        setLocationRelativeTo(null);
        this.proxyClienteBroker=proxyClienteBroker;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("HACER PUBLICACIÓN");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Hashtags:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

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
        fondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 140, 40));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 150, 40));

        txtTextoPlano.setColumns(20);
        txtTextoPlano.setRows(5);
        jScrollPane5.setViewportView(txtTextoPlano);

        fondo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 190));

        lblImagen.setBackground(new java.awt.Color(0, 0, 0));
        lblImagen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 340, 220));

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
        fondo.add(btnAñadirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 140, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Imagen:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        txtHashtags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHashtagsActionPerformed(evt);
            }
        });
        fondo.add(txtHashtags, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 30));

        txtEtiquetados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEtiquetadosActionPerformed(evt);
            }
        });
        fondo.add(txtEtiquetados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 30));

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
        String textoPlano = this.txtTextoPlano.getText();

        Contenido contenido = new Contenido(textoPlano);
        Publicacion publicacion = new Publicacion(contenido);

        String respuesta = this.proxyClienteBroker.registrarPublicacion(publicacion);
        if (respuesta.startsWith("Excepción: ")) {
            this.mostrarMensaje(respuesta);
        } else {
            this.mostrarMensaje(respuesta);
        }
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void btnAñadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirImagenActionPerformed

    private void txtHashtagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHashtagsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHashtagsActionPerformed

    private void txtEtiquetadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEtiquetadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEtiquetadosActionPerformed

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static FrmPublicacion obtenerFrmPublicacion(IProxy proxyClienteBroker){
        if(frmPublicacion==null){
            frmPublicacion = new FrmPublicacion(proxyClienteBroker);
        }
        return frmPublicacion;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtEtiquetados;
    private javax.swing.JTextField txtHashtags;
    private javax.swing.JTextArea txtTextoPlano;
    // End of variables declaration//GEN-END:variables
}
