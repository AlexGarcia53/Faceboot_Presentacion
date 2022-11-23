package com.mycompany.presentacionfaceboot;

import com.mycompany.proxyclientebroker.ProxyClienteBroker;
import com.restfb.types.User;
import dominio.Usuario;
import interfaces.IProxy;
import javax.swing.JOptionPane;
import loginFacebook.LoginFacebook;
import loginFacebook.UsuarioFacebook;
import notificacion.CanalizadorEventos;
import notificacion.ObservableRegistrarPublicacion;
import notificacion.OyenteNotificacionesBroker;


//import com.sun.prism.paint.Paint;
//import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarol
 */
public class FrmInicioSesion extends javax.swing.JFrame {
    private static FrmInicioSesion frmInicioSesion;
    IProxy proxyClienteBroker;
    LoginFacebook loginFacebook = new LoginFacebook();
    
    /**
     * Creates new form FrmInicioSesion
     */
    private FrmInicioSesion(IProxy proxyClienteBroker) {
        initComponents();
        setLocationRelativeTo(null);
        this.proxyClienteBroker= proxyClienteBroker;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMostrarRegistrarse = new javax.swing.JButton();
        btnSesionFacebook = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(525, 650));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 217, 183));
        Fondo.setPreferredSize(new java.awt.Dimension(500, 600));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel1.setText("Iniciar Sesión");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 250, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setText("Email");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));
        Fondo.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 280, 30));
        Fondo.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 280, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 20));

        btnIniciarSesion.setBackground(new java.awt.Color(240, 115, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        Fondo.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, 40));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        Fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 140, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jLabel4.setText("¿No tienes cuenta?");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        btnMostrarRegistrarse.setBackground(new java.awt.Color(240, 115, 0));
        btnMostrarRegistrarse.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnMostrarRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarRegistrarse.setText("Registrarse");
        btnMostrarRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistrarseActionPerformed(evt);
            }
        });
        Fondo.add(btnMostrarRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 150, 40));

        btnSesionFacebook.setBackground(new java.awt.Color(0, 68, 157));
        btnSesionFacebook.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnSesionFacebook.setForeground(new java.awt.Color(255, 255, 255));
        btnSesionFacebook.setText("Iniciar sesión con Facebook");
        btnSesionFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionFacebookActionPerformed(evt);
            }
        });
        Fondo.add(btnSesionFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String email= this.txtEmail.getText();
        String contrasenia= this.txtContrasena.getText();
        
        Usuario usuario= new Usuario(email, contrasenia);
        
        String respuesta= this.proxyClienteBroker.iniciarSesion(usuario);
        System.out.println(respuesta);
        if(respuesta.startsWith("Excepción: ")){
            this.mostrarMensaje(respuesta);
        }else{
            int nombreUsuario=1, idUsuario=0;
            String datosUsuario[]= respuesta.split(", ");
            
            int opcionSeleccionada= JOptionPane.showConfirmDialog(this,"Bienvenido "+datosUsuario[nombreUsuario]+"!!!", "Confirmación", JOptionPane.YES_OPTION);
            if(opcionSeleccionada == JOptionPane.YES_OPTION){
                FrmMuro muro= FrmMuro.obtenerFrmMuro(Long.parseLong(datosUsuario[idUsuario]),this.proxyClienteBroker);
                muro.suscribirseEventoRegistrarPublicacion();
                muro.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnMostrarRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistrarseActionPerformed
       FrmRegistro registrarse = FrmRegistro.obtenerFrmRegistro();
       registrarse.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMostrarRegistrarseActionPerformed

    private void btnSesionFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionFacebookActionPerformed
      UsuarioFacebook userFacebook = loginFacebook.IniciarSesionFacebook();
      
      Usuario usuario = new Usuario(userFacebook.getUser().getName(),userFacebook.getUser().getEmail(),userFacebook.getAtoken());
      String respuesta = this.proxyClienteBroker.iniciarSesionFacebook(usuario);
      System.out.println(respuesta);
        if(respuesta.startsWith("Excepción: ")){
            this.mostrarMensaje(respuesta);
        }else{
            int nombreUsuario=1, idUsuario=0;
            String datosUsuario[]= respuesta.split(", ");
            
            int opcionSeleccionada= JOptionPane.showConfirmDialog(this,"Bienvenido "+datosUsuario[nombreUsuario]+"!!!", "Confirmación", JOptionPane.YES_OPTION);
            if(opcionSeleccionada == JOptionPane.YES_OPTION){
                FrmMuro muro= FrmMuro.obtenerFrmMuro(Long.parseLong(datosUsuario[idUsuario]),this.proxyClienteBroker);
                muro.suscribirseEventoRegistrarPublicacion();
                muro.setVisible(true);
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_btnSesionFacebookActionPerformed

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Respuesta del servidor", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static FrmInicioSesion obtenerFrmInicioSesion(IProxy proxyClienteBroker){
        if(frmInicioSesion==null){
            frmInicioSesion= new FrmInicioSesion(proxyClienteBroker);
        }
        return frmInicioSesion;
    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//              
//               
//            
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmInicioSesion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMostrarRegistrarse;
    private javax.swing.JButton btnSesionFacebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
