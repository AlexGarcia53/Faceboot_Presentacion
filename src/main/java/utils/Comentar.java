/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

import dominio.*;
import dominio.Comentario;
import interfaces.IProxy;
import java.awt.Label;
import java.util.GregorianCalendar;

/**
 *
 * @author Gael
 */
public class Comentar extends javax.swing.JPanel {
    private Usuario usuario;
    private Publicacion publicacion;
    private IProxy proxy;
    /**
     * Creates new form Comentario
     */
    public Comentar(Usuario usuario, Publicacion publicacion, IProxy proxy) {
        initComponents();
        this.init();
        this.usuario= usuario;
        this.publicacion= publicacion;
        this.proxy=proxy;
    }
    
    public void init(){
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnComentar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpnComentario = new javax.swing.JTextPane();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 217, 183));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 189, 130)));
        setForeground(new java.awt.Color(255, 217, 183));
        setInheritsPopupMenu(true);

        btnComentar.setBackground(new java.awt.Color(240, 115, 0));
        btnComentar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnComentar.setForeground(new java.awt.Color(255, 255, 255));
        btnComentar.setText("Comentar");
        btnComentar.setToolTipText("");
        btnComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarActionPerformed(evt);
            }
        });

        txtpnComentario.setBackground(new java.awt.Color(255, 233, 214));
        txtpnComentario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 233, 214)));
        txtpnComentario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtpnComentario.setForeground(new java.awt.Color(204, 88, 3));
        jScrollPane1.setViewportView(txtpnComentario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComentar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComentar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarActionPerformed
        String contenidoComentario= this.txtpnComentario.getText();
        Contenido contenido= new Contenido(contenidoComentario);
        GregorianCalendar fechaActual=new GregorianCalendar();
        Comentario comentario= new Comentario(fechaActual, this.publicacion, this.usuario, contenido);
        
    }//GEN-LAST:event_btnComentarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComentar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane txtpnComentario;
    // End of variables declaration//GEN-END:variables
}
