/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

/**
 *
 * @author Gael
 */
public class Comentarios extends javax.swing.JPanel {

    /**
     * Creates new form Comentario
     */
    public Comentarios() {
        initComponents();
        cpnComentarios.setVerticalScrollBar(new Barra());

        this.actualizarContenido();
    }
    public void actualizarContenido(){

        Comentario a = new Comentario();
        Comentario b = new Comentario();
        Comentario c = new Comentario();
        
        

        pnlComentarios.add(a);

        pnlComentarios.add(b);
        pnlComentarios.add(c);

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
            .addComponent(cpnComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cpnComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane cpnComentarios;
    private javax.swing.JPanel pnlComentarios;
    // End of variables declaration//GEN-END:variables
}
