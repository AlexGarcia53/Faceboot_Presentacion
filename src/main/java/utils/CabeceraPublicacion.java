/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

import com.mycompany.presentacionfaceboot.FrmEditarPublicacion;
import com.mycompany.presentacionfaceboot.FrmEliminarPublicacion;
import dominio.*;
import interfaces.IProxy;
import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class CabeceraPublicacion extends javax.swing.JPanel {
    private Usuario usuario;
    private Publicacion publicacion;
    private IProxy proxy;
    /**
     * Creates new form CabeceraPublicacion
     */
    public CabeceraPublicacion(Usuario usuario, Publicacion publicacion, IProxy proxy) {
        initComponents();
        this.usuario= usuario;
        this.publicacion= publicacion;
        this.proxy= proxy;
        this.actualizarContenido();
    }
    
    public void actualizarContenido(){
        this.lblUsuario.setText(publicacion.getUsuario().getUsuario());
        this.lblFecha.setText(publicacion.getFechaCreacion().get(Calendar.DAY_OF_MONTH)+"/"+(publicacion.getFechaCreacion().get(Calendar.MONTH)+1)+"/"+publicacion.getFechaCreacion().get(Calendar.YEAR));
        
        if(usuario.getId()!=publicacion.getUsuario().getId()){
            this.pnlOpciones.setVisible(false);
        }
        
        this.repaint();
        this.revalidate();
    }
    
//    public void init(String usuario, String fecha){
//        this.usuario= usuario;
//        this.fecha= fecha ;
//        
//        this.actualizarContenido();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 217, 183));

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 88, 3));
        lblUsuario.setText("Nombre Usuario");

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(204, 88, 3));
        lblFecha.setText("fecha");

        pnlOpciones.setBackground(new java.awt.Color(255, 217, 183));

        btnEditar.setBackground(new java.awt.Color(240, 115, 0));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(345, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        FrmEditarPublicacion editar= new FrmEditarPublicacion(this.usuario, this.proxy, this.publicacion);
        editar.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        FrmEliminarPublicacion eliminar= new FrmEliminarPublicacion(this.usuario, this.proxy, this.publicacion);
        eliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlOpciones;
    // End of variables declaration//GEN-END:variables
}
