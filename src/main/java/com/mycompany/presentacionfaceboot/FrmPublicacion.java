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
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Formulario para registrar una publicación.
 *
 * @author Equipo broker
 */
public class FrmPublicacion extends javax.swing.JFrame {

    /**
     * Instancia del proxy que utiliza el cliente.
     */
    IProxy proxyClienteBroker;
    /**
     * Usuario que abre el formulario.
     */
    Usuario usuario;

    /**
     * Método constructor que inicializa los componentes y atributos del
     * formulario.
     *
     * @param usuario Usuario que abre el formulario.
     * @param proxyClienteBroker Instancia del proxy que utiliza el cliente.
     */
    public FrmPublicacion(Usuario usuario, IProxy proxyClienteBroker) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario = usuario;
        this.proxyClienteBroker = proxyClienteBroker;
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
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTextoPlano = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        btnPublicar = new javax.swing.JButton();
        btnAñadirImagen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtHashtags = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faceboot -  Crear Publicacion");
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 217, 183));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("HACER PUBLICACIÓN");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Mensaje:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

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
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 40));

        txtTextoPlano.setColumns(20);
        txtTextoPlano.setRows(5);
        txtTextoPlano.setMaximumSize(new java.awt.Dimension(13, 20));
        jScrollPane5.setViewportView(txtTextoPlano);

        fondo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 310, 190));

        lblImagen.setBackground(new java.awt.Color(0, 0, 0));
        lblImagen.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 340, 220));

        btnPublicar.setBackground(new java.awt.Color(240, 115, 0));
        btnPublicar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnPublicar.setForeground(new java.awt.Color(255, 255, 255));
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });
        fondo.add(btnPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, 40));

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
        fondo.add(txtHashtags, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Hashtags:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel9.setText("Formato: #Hashtag #Hashtag");
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

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
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Botón utilizado para registrar la publicación.
     *
     * @param evt evento.
     */
    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed

//        Date fechaActual= new Date();
        GregorianCalendar fechaPublicacion = new GregorianCalendar();
//        fechaPublicacion.setTimeInMillis(fechaActual.getTime());

        try {
            this.verificarCampos();
        } catch (ErrorDatosErroneosException ex) {
            this.mostrarError(ex.getMessage());
            return;
        }

        String textoPlano = this.txtTextoPlano.getText();
        String imagen = this.lblImagen.getText();
        Contenido contenido = new Contenido(textoPlano, imagen);
        Publicacion publicacion = new Publicacion(fechaPublicacion, this.usuario, contenido);
        String campoHashtags = this.txtHashtags.getText().replace(" ", "");
        if (!campoHashtags.equals("")) {
            String[] hashtags = campoHashtags.split("#");
            for (int i = 1; i < hashtags.length; i++) {
                Hashtag hashtag = new Hashtag(hashtags[i]);
                hashtag.setPublicacion(publicacion);
                hashtag.getPublicacion().agregarHashtag(hashtag);
//                contenido.agregarHashtag(new Hashtag(hashtags[i]));
            }
        }
//        Publicacion publicacion = new Publicacion(fechaPublicacion,this.usuario,contenido);

        try {
            Publicacion respuesta = this.proxyClienteBroker.registrarPublicacion(publicacion);
            this.mostrarMensaje("Se registró correctamente la publicación");
            this.dispose();
        } catch (ErrorGuardarPublicacionException e) {
            this.mostrarMensaje(e.getMessage());
        }
    }//GEN-LAST:event_btnPublicarActionPerformed
    private JTextArea initTextArea(JTextArea texto) {
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        return texto;
    }

    /**
     * Botón utilizado para añadir una imagen a la publicación.
     *
     * @param evt evento.
     */
    private void btnAñadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirImagenActionPerformed
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
    }//GEN-LAST:event_btnAñadirImagenActionPerformed
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtHashtags;
    private javax.swing.JTextArea txtTextoPlano;
    // End of variables declaration//GEN-END:variables
}
