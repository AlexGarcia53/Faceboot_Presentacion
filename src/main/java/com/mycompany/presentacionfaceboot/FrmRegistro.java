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
import interfaces.IProxy;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jarol
 */
public class FrmRegistro extends javax.swing.JFrame {
    private static FrmRegistro frmRegistro;
    String identificador;
    IProxy proxyClienteBroker;
    /**
     * Creates new form FrmRegistro
     */
    private FrmRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        this.identificador= Math.random()+"";
        this.proxyClienteBroker= new ProxyClienteBroker(identificador);
        frmRegistro= this;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        txtEdad = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSesionGithub = new javax.swing.JButton();
        btnSesionTwitter = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        comboBoxSexo = new javax.swing.JComboBox<>();
        fechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 250, 30));

        txtEmail.setText("alexgl@gmail.com");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 30));

        jLabel1.setText("Registrarse");
        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 27)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel2.setText("Usuario");
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setText("Celular");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel8.setText("Edad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel9.setText("Fecha de nacimiento");
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        txtCelular.setText("6444512231");
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 30));

        txtNombre.setText("Alex Gael");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 250, 30));

        txtContrasena.setText("1234");
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 250, 30));

        txtEdad.setText("12");
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 250, 30));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBackground(new java.awt.Color(240, 115, 0));
        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 110, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel10.setText("¿Ya tienes cuenta?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jLabel11.setText("o");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 20, -1));

        btnSesionGithub.setText("Ingresar con Github");
        btnSesionGithub.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnSesionGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionGithubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSesionGithub, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 260, 50));

        btnSesionTwitter.setText("Ingresar con Twitter");
        btnSesionTwitter.setBackground(new java.awt.Color(0, 68, 157));
        btnSesionTwitter.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnSesionTwitter.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(btnSesionTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 260, 50));

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBackground(new java.awt.Color(240, 115, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 140, 40));

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        comboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 250, 30));
        jPanel1.add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSesionGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionGithubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSesionGithubActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        FrmInicioSesion frmInicioSesion = FrmInicioSesion.obtenerFrmInicioSesion(this.proxyClienteBroker);
        frmInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String usuario= this.txtUsuario.getText();
        String nombre= this.txtNombre.getText();
        String email= this.txtEmail.getText();
        String contrasenia= this.txtContrasena.getText();
        String celular= this.txtCelular.getText();
        int edad= Integer.parseInt(this.txtEdad.getText());
        LocalDate fechaTemporal= this.fechaNacimiento.getDate();
        GregorianCalendar fechaNacimiento= new GregorianCalendar(fechaTemporal.getYear(), (fechaTemporal.getMonthValue()-1), fechaTemporal.getDayOfMonth(),0,0,0);
        Sexo sexo;
        if(this.comboBoxSexo.getSelectedItem().equals("Masculino")){
            sexo= Sexo.MASCULINO;
        }else{
            sexo= Sexo.FEMENINO;
        }
        //String usuario, String email, String contraseña, String celular, Sexo sexo, int edad, GregorianCalendar fechaNacimiento
        Usuario objetoUsuario= new Usuario(usuario, email, contrasenia, celular, sexo, edad, fechaNacimiento);
        
        String respuesta= this.proxyClienteBroker.registrarUsuario(objetoUsuario);
        if(respuesta.startsWith("Excepción: ")){
            this.mostrarMensaje(respuesta);
        }else{
            this.mostrarMensaje(respuesta);
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void comboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSexoActionPerformed

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }

    public static FrmRegistro obtenerFrmRegistro(){
        if(frmRegistro == null){
            frmRegistro= new FrmRegistro();
        }
        return frmRegistro;
    }   

    public void soloNumeros(java.awt.event.KeyEvent evt) {
         char car = evt.getKeyChar();
        if (Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }
    
    /**
     * @param args the command line arguments
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
    private javax.swing.JButton btnSesionGithub;
    private javax.swing.JButton btnSesionTwitter;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private com.github.lgooddatepicker.components.DatePicker fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}