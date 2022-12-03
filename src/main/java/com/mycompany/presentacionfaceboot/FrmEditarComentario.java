/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import dominio.Contenido;
import dominio.Comentario;
import dominio.Usuario;
import excepciones.ErrorGuardarPublicacionException;
import interfaces.IProxy;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Formulario para editar un comentario.
 *
 * @author Equipo broker
 */
public class FrmEditarComentario extends javax.swing.JFrame {

    /**
     * Instancia del proxy que utiliza el cliente.
     */
    private IProxy proxyClienteBroker;
    /**
     * Usuario que abre el formulario.
     */
    private Usuario usuario;
    /**
     * Comentario a editar.
     */
    private Comentario comentario;

    /**
     * Constructor que inicializa los componentes y atributos del formulario.
     *
     * @param usuario Usuario que abre el formulario.
     * @param proxyClienteBroker Instancia del proxy que utiliza el cliente.
     * @param comentario Comentario a editar.
     */
    public FrmEditarComentario(Usuario usuario, IProxy proxyClienteBroker, Comentario comentario) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.proxyClienteBroker = proxyClienteBroker;
        this.comentario = comentario;
        this.llenarCampos();
    }

    /**
     * Método para llenar los campos del formulario.
     */
    public void llenarCampos() {
        this.txtTextoPlano.setText(comentario.getContenido().getTextoPlano());
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
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTextoPlano = new javax.swing.JTextArea();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faceboot - Editar Comentario");
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("EDITAR COMENTARIO");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Mensaje:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 150, 40));

        txtTextoPlano.setColumns(20);
        txtTextoPlano.setRows(5);
        jScrollPane5.setViewportView(txtTextoPlano);

        fondo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 190));

        btnEditar.setBackground(new java.awt.Color(240, 115, 0));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        fondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón utilizado para editar el comentario.
     *
     * @param evt evento.
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String textoPlano = this.txtTextoPlano.getText();

        comentario.getContenido().setTextoPlano(textoPlano);

        try {
            Comentario respuesta = this.proxyClienteBroker.editarComentario(comentario);
            this.mostrarMensaje("Se editó correctamente el comentario");
        } catch (ErrorGuardarPublicacionException e) {
            this.mostrarMensaje(e.getMessage());
        }

        this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed
    /**
     * Botón utilizado para cerrar el formulario actual.
     *
     * @param evt evento.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     * Método utilizado para mostrar un mensaje.
     *
     * @param mensaje mensaje a mostrar.
     */
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtTextoPlano;
    // End of variables declaration//GEN-END:variables
}
