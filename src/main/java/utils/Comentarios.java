/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

import dominio.*;
import interfaces.IProxy;
import java.util.List;

/**
 *
 * @author Gael
 */
public class Comentarios extends javax.swing.JPanel {
    private Usuario usuario;
    private Publicacion publicacion;
    private IProxy proxy;
    /**
     * Creates new form Comentario
     */
    public Comentarios(Usuario usuario, Publicacion publicacion, IProxy proxy) {
        initComponents();
        cpnComentarios.setVerticalScrollBar(new Barra());
        this.usuario= usuario;
        this.publicacion= publicacion;
        this.proxy=proxy;
        this.actualizarContenido();
    }
    public void actualizarContenido(){
        List<Comentario> comentarios= publicacion.getComentarios();
        
        for (Comentario comentario: comentarios){
            ComentarioPublicacion comEspecifico= new ComentarioPublicacion(this.usuario, comentario, this.proxy);
            pnlComentarios.add(comEspecifico, 0);
        }
        
//        ComentarioPublicacion a = new ComentarioPublicacion();
//        ComentarioPublicacion b = new ComentarioPublicacion();
//        ComentarioPublicacion c = new ComentarioPublicacion();
//        
//        
//
//        pnlComentarios.add(a);
//
//        pnlComentarios.add(b);
//        pnlComentarios.add(c);

        this.repaint();
        this.revalidate();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpnComentarios = new javax.swing.JScrollPane();
        pnlComentarios = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 217, 183));
        setForeground(new java.awt.Color(255, 217, 183));

        cpnComentarios.setBorder(null);

        pnlComentarios.setLayout(new javax.swing.BoxLayout(pnlComentarios, javax.swing.BoxLayout.Y_AXIS));
        cpnComentarios.setViewportView(pnlComentarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpnComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpnComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane cpnComentarios;
    private javax.swing.JPanel pnlComentarios;
    // End of variables declaration//GEN-END:variables
}
