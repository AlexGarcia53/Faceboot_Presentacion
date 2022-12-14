/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacionfaceboot;

import com.mycompany.proxyclientebroker.ProxyClienteBroker;
import dominio.Sexo;
import dominio.Solicitud;
import dominio.Usuario;
import excepciones.ErrorBusquedaUsuarioException;
import excepciones.ErrorDatosErroneosException;
import excepciones.ErrorGuardarUsuarioException;
import interfaces.IProxy;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import logueo.ConstructorAdapterFacebook;

/**
 * Formulario para registrar un usuario.
 *
 * @author Equipo broker
 */
public class FrmRegistro extends javax.swing.JFrame {

    /**
     * Instancia de FrmRegistro.
     */
    private static FrmRegistro frmRegistro;
    /**
     * Instancia del proxy que utiliza el cliente.
     */
    private IProxy proxyClienteBroker;

    /**
     * Método constructor que inicializa los componentes y atributos del
     * formulario.
     */
    private FrmRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        this.proxyClienteBroker = new ProxyClienteBroker();
        frmRegistro = this;
        this.llenarComboBoxSexo();
    }

    /**
     * Método que verfica los campos que tiene el formulario.
     *
     * @throws ErrorDatosErroneosException Excepción utilizada para especificar
     * errores en inserción de datos.
     */
    private void verificarCampos() throws ErrorDatosErroneosException {

        if (this.txtUsuario.getText().equals("")) {
            throw new ErrorDatosErroneosException("El usuario está vacío");
        } else if (this.txtEmail.getText().equals("")) {
            throw new ErrorDatosErroneosException("El correo esta vacío");
        } else if (this.txtCelular.getText().equals("")) {
            throw new ErrorDatosErroneosException("El celular esta vacío");
        } else if (this.txtContrasena.getText().equals("")) {
            throw new ErrorDatosErroneosException("La contraseña esta vacía");
        } else if (this.dtpfechaNacimiento.getDate() == null) {
            throw new ErrorDatosErroneosException("La fecha de nacimiento esta vacía");
        }
        Pattern patronCorreo = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher comprobacionCorreo = patronCorreo.matcher(this.txtEmail.getText());
        if (!comprobacionCorreo.matches()) {
            throw new ErrorDatosErroneosException("El correo no cumple con el formato");
        }
        Pattern patronTelefono = Pattern.compile("^([0-9]+[ ]*){1,6}$");
        Matcher comprobacionTelefono = patronTelefono.matcher(this.txtCelular.getText());
        if (!comprobacionTelefono.matches()) {
            throw new ErrorDatosErroneosException("El celular contiene caracteres no válidos");
        }

    }

    /**
     * Método utilizado para llenar el combobox de sexos.
     */
    private void llenarComboBoxSexo() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.comboBoxSexo.getModel();
        modelo.addElement(Sexo.MASCULINO);
        modelo.addElement(Sexo.FEMENINO);
        this.comboBoxSexo.setSelectedIndex(0);
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        comboBoxSexo = new javax.swing.JComboBox<>();
        dtpfechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        logoFacebook = new javax.swing.JLabel();
        btnSesionFacebook = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faceboot - Registrarse");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 217, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setText("Alex Gael");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 250, 30));

        txtEmail.setText("alexgl@gmail.com");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 250, 30));

        jLabel1.setText("Registrarse");
        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 27)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setText("Usuario");
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 10));

        jLabel3.setText("Email");
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel4.setText("Celular");
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Sexo");
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel7.setText("Contraseña");
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel9.setText("Fecha de nacimiento");
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        txtCelular.setText("6444512231");
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 30));

        txtContrasena.setText("1234");
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 250, 30));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBackground(new java.awt.Color(240, 115, 0));
        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 110, 40));

        jLabel10.setText("¿Ya tienes cuenta?");
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jLabel11.setText("o");
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 476, 10, 10));

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBackground(new java.awt.Color(240, 115, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 140, 40));

        comboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 30));
        jPanel1.add(dtpfechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 250, 30));
        jPanel1.add(logoFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, 50));

        btnSesionFacebook.setText("Ingresar con Facebook");
        btnSesionFacebook.setBackground(new java.awt.Color(43, 121, 242));
        btnSesionFacebook.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnSesionFacebook.setForeground(new java.awt.Color(255, 255, 255));
        btnSesionFacebook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSesionFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionFacebookActionPerformed(evt);
            }
        });
        jPanel1.add(btnSesionFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 190, 50));
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 390, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón que abre el formulario de iniciar sesión.
     *
     * @param evt evento.
     */
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        FrmInicioSesion frmInicioSesion = new FrmInicioSesion(proxyClienteBroker);
        frmInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    /**
     * Evento utilizado para escribir solo números en el campo de celular.
     *
     * @param evt evento.
     */
    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtCelularKeyTyped
    /**
     * Botón utilizado para registrar al usuario.
     *
     * @param evt evento.
     */
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String usuario = this.txtUsuario.getText();
        String email = this.txtEmail.getText();
        String contrasenia = this.txtContrasena.getText();
        String celular = this.txtCelular.getText();
        Sexo sexo = (Sexo) this.comboBoxSexo.getSelectedItem();

        try {
            this.verificarCampos();
        } catch (ErrorDatosErroneosException ex) {
            this.mostrarError(ex.getMessage());
            return;
        }

        LocalDate fechaTemporal = this.dtpfechaNacimiento.getDate();
        GregorianCalendar fechaNacimiento = new GregorianCalendar(fechaTemporal.getYear(), (fechaTemporal.getMonthValue() - 1), fechaTemporal.getDayOfMonth(), 0, 0, 0);
        //String usuario, String email, String contraseña, String celular, Sexo sexo, int edad, GregorianCalendar fechaNacimiento
        Usuario objetoUsuario = new Usuario(usuario, email, contrasenia, celular, sexo, fechaNacimiento);

        try {
            Usuario respuesta = this.proxyClienteBroker.registrarUsuario(objetoUsuario);
            this.mostrarMensaje("Se registró correctamente al usuario");
        } catch (ErrorGuardarUsuarioException e) {
            this.mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed
    /**
     * Botón que cierra el formulario.
     *
     * @param evt evento.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void comboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSexoActionPerformed
    /**
     * Botón utilizado para iniciar sesión con facebook.
     *
     * @param evt evento.
     */
    private void btnSesionFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionFacebookActionPerformed
        Usuario usuario = ConstructorAdapterFacebook.getInstancia().obtenerAdaptador().iniciarSesion();

        try {
            Usuario respuesta = this.proxyClienteBroker.iniciarSesionFacebook(usuario);
            int opcionSeleccionada = JOptionPane.showConfirmDialog(this, "Bienvenido " + respuesta.getUsuario() + "!!!", "Confirmación", JOptionPane.YES_OPTION);
            if (opcionSeleccionada == JOptionPane.YES_OPTION) {
                FrmMuro muro = new FrmMuro(respuesta, this.proxyClienteBroker);
                muro.setVisible(true);
                this.dispose();
            }
        } catch (ErrorBusquedaUsuarioException e) {
            this.mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btnSesionFacebookActionPerformed
    /**
     * Método utilizado para mostrar las respuestas del servidor.
     *
     * @param mensaje mensaje a mostrar.
     */
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método para obtener una instancia de FrmRegistro.
     *
     * @return instancia de FrmRegistro.
     */
    public static FrmRegistro obtenerFrmRegistro() {
        if (frmRegistro == null) {
            frmRegistro = new FrmRegistro();
        }
        return frmRegistro;
    }

    /**
     * Método utilizado para recibir solo números.
     *
     * @param evt evento.
     */
    public void soloNumeros(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }

    /**
     * Método main que crea el formulario de FrmRegistro y lo hace visible.
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSesionFacebook;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private com.github.lgooddatepicker.components.DatePicker dtpfechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoFacebook;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
