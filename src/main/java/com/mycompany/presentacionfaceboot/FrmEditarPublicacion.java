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
import excepciones.ErrorDatosErroneosException;
import excepciones.ErrorGuardarPublicacionException;
import interfaces.IProxy;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Formulario para editar una publicación.
 *
 * @author Equipo broker
 */
public class FrmEditarPublicacion extends javax.swing.JFrame {

    /**
     * Instancia del proxy que utiliza el cliente.
     */
    private IProxy proxyClienteBroker;
    /**
     * Usuario que abre el formulario.
     */
    private Usuario usuario;
    /**
     * Publicación a editar.
     */
    private Publicacion publicacion;

    /**
     * Constructor que inicializa los componentes y atributos del formulario.
     *
     * @param usuario Usuario que abre el formulario.
     * @param proxyClienteBroker Instancia del proxy que utiliza el cliente.
     * @param publicacion Publicación a editar.
     */
    public FrmEditarPublicacion(Usuario usuario, IProxy proxyClienteBroker, Publicacion publicacion) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.proxyClienteBroker = proxyClienteBroker;
        this.publicacion = publicacion;
        this.llenarCampos();
        this.txtHashtags.setEditable(false);
    }

    /**
     * Método para llenar los campos del formulario.
     */
    private void llenarCampos() {
        if (this.publicacion.getHashtags() != null) {
            List<Hashtag> hashtags = publicacion.getHashtags();
            for (int i = 0; i < hashtags.size(); i++) {
                txtHashtags.setText(txtHashtags.getText() + "#" + hashtags.get(i).getNombre() + " ");
            }
        }
        this.txtTextoPlano.setText(publicacion.getContenido().getTextoPlano());
        if (this.publicacion.getContenido().getImagen() != null) {
            Image imagen = new ImageIcon(this.publicacion.getContenido().getImagen()).getImage();
            ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(icono);
            lblImagen.setFont(new java.awt.Font("Lucida Grande", 1, 0));
            lblImagen.setText(this.publicacion.getContenido().getImagen());
        }
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
        btnEliminarImagen = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTextoPlano = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnAniadirImagen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtHashtags = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faceboot - Editar Publicacion");
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("EDITAR PUBLICACIÓN");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Hashtags:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Mensaje:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        btnEliminarImagen.setBackground(new java.awt.Color(240, 115, 0));
        btnEliminarImagen.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEliminarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarImagen.setText("Eliminar");
        btnEliminarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarImagenActionPerformed(evt);
            }
        });
        fondo.add(btnEliminarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 140, 40));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 150, 40));

        txtTextoPlano.setColumns(20);
        txtTextoPlano.setRows(5);
        jScrollPane5.setViewportView(txtTextoPlano);

        fondo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 190));

        lblImagen.setBackground(new java.awt.Color(0, 0, 0));
        lblImagen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 340, 220));

        btnEditar.setBackground(new java.awt.Color(240, 115, 0));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        fondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, 40));

        btnAniadirImagen.setBackground(new java.awt.Color(240, 115, 0));
        btnAniadirImagen.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnAniadirImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnAniadirImagen.setText("Añadir");
        btnAniadirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirImagenActionPerformed(evt);
            }
        });
        fondo.add(btnAniadirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 140, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Imagen:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        txtHashtags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHashtagsActionPerformed(evt);
            }
        });
        fondo.add(txtHashtags, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón para eliminar la imagen que contiene la publicación.
     * @param evt evento.
     */
    private void btnEliminarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarImagenActionPerformed
        this.lblImagen.setText("");
        this.lblImagen.setIcon(null);
    }//GEN-LAST:event_btnEliminarImagenActionPerformed
    /**
     * Botón utilizado para editar la publicación.
     *
     * @param evt evento.
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            this.verificarCampos();
        } catch (ErrorDatosErroneosException ex) {
            this.mostrarError(ex.getMessage());
            return;
        }

        String textoPlano = this.txtTextoPlano.getText();
        String imagen = this.lblImagen.getText();

        publicacion.getContenido().setTextoPlano(textoPlano);
        publicacion.getContenido().setImagen(imagen);

        try {
            Publicacion respuesta = this.proxyClienteBroker.editarPublicacion(publicacion);
            this.mostrarMensaje("Se editó correctamente la publicación");
        } catch (ErrorGuardarPublicacionException e) {
            this.mostrarMensaje(e.getMessage());
        }

        this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed
    /**
     * Método que verfica los campos que tiene el formulario.
     *
     * @throws ErrorDatosErroneosException Excepción utilizada para especificar
     * errores en inserción de datos.
     */
    private void verificarCampos() throws ErrorDatosErroneosException {
        if (this.txtHashtags.getText().isEmpty() && this.txtTextoPlano.getText().isEmpty() && this.lblImagen.getText().isEmpty()) {
            throw new ErrorDatosErroneosException("La publicación esta vacía");
        }

    }

    /**
     * Método utilizado para mostrar mensajes de error.
     *
     * @param error error específico.
     */
    private void mostrarError(String error) {
        JOptionPane.showMessageDialog(this, error, "Error!...", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Botón utilizado para añadir una imagen a la publicación.
     *
     * @param evt evento.
     */
    private void btnAniadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirImagenActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG & PNG", "jpg", "png", "gif");
        jfileChooser.setFileFilter(filtrado);

        int respuesta = jfileChooser.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            String path = jfileChooser.getSelectedFile().getPath();
            Image imagen = new ImageIcon(path).getImage();
            ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(icono);
            lblImagen.setFont(new java.awt.Font("Lucida Grande", 1, 0));
            lblImagen.setText(path);

        }
    }//GEN-LAST:event_btnAniadirImagenActionPerformed

    private void txtHashtagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHashtagsActionPerformed


    }//GEN-LAST:event_txtHashtagsActionPerformed
    /**
     * Botón que cierra el formulario actual.
     *
     * @param evt evento.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     * Método que muestra un mensaje.
     *
     * @param mensaje mensaje a mostrar.
     */
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadirImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarImagen;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtHashtags;
    private javax.swing.JTextArea txtTextoPlano;
    // End of variables declaration//GEN-END:variables
}
