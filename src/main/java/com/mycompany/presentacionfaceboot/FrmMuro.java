/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import interfaces.IProxy;

/**
 *
 * @author Jarol
 */
public class FrmMuro extends javax.swing.JFrame {
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
    }
    
    public static FrmMuro obtenerFrmMuro(Long idUsuario, IProxy proxyClienteBroker){
        if(frmMuro==null){
            frmMuro= new FrmMuro(idUsuario, proxyClienteBroker);
        }
        return frmMuro;
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 710));

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seccionMenu.setBackground(new java.awt.Color(240, 115, 0));
        seccionMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHacerPublicacion.setBackground(new java.awt.Color(255, 217, 183));
        btnHacerPublicacion.setText("Hacer publicacion");
        btnHacerPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerPublicacionActionPerformed(evt);
            }
        });
        seccionMenu.add(btnHacerPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 30, -1, 43));

        jButton2.setBackground(new java.awt.Color(255, 217, 183));
        jButton2.setText("Editar  Perfil");
        seccionMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 30, 121, 43));

        jButton3.setBackground(new java.awt.Color(255, 217, 183));
        jButton3.setText("Enviar mensaje");
        seccionMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 30, -1, 43));
        seccionMenu.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, 30));

        fondo.add(seccionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHacerPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerPublicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHacerPublicacionActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHacerPublicacion;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel seccionMenu;
    // End of variables declaration//GEN-END:variables
}
