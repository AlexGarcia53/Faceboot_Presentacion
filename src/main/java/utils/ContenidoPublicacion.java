/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

/**
 *
 * @author Admin
 */
public class ContenidoPublicacion extends javax.swing.JPanel {
    private String textoPlano;
    /**
     * Creates new form ContenidoPublicacion
     */
    public ContenidoPublicacion() {
        initComponents();
    }
    
    public void actualizarContenido(){
        this.txtpnContenido.setText(textoPlano);
        this.repaint();
        this.revalidate();
    }
    
    public void init(String textoPlano){
        this.textoPlano = textoPlano;
        this.actualizarContenido();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtpnContenido = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 217, 183));
        setForeground(new java.awt.Color(255, 217, 183));

        txtpnContenido.setEditable(false);
        txtpnContenido.setBackground(new java.awt.Color(255, 233, 214));
        txtpnContenido.setBorder(null);
        txtpnContenido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtpnContenido.setForeground(new java.awt.Color(204, 88, 3));
        txtpnContenido.setCaretColor(new java.awt.Color(255, 233, 214));
        txtpnContenido.setDisabledTextColor(new java.awt.Color(255, 233, 214));
        txtpnContenido.setFocusCycleRoot(false);
        txtpnContenido.setFocusable(false);
        txtpnContenido.setSelectedTextColor(new java.awt.Color(255, 233, 214));
        txtpnContenido.setSelectionColor(new java.awt.Color(255, 233, 214));
        txtpnContenido.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(txtpnContenido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane txtpnContenido;
    // End of variables declaration//GEN-END:variables
}