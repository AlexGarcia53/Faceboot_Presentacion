/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

import dominio.Hashtag;
import java.awt.Dimension;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.text.Document;

/**
 * Clase utilizada para construir el contenido de la publicación.
 *
 * @author Equipo broker
 */
public class ContenidoPublicacion extends javax.swing.JPanel {

    /**
     * Lista de hashtags de la publicación.
     */
    private List<Hashtag> hashtags;
    /**
     * Texto plano de la publicación.
     */
    private String textoPlano;
    /**
     * Imagen de la publicación.
     */
    private String imagen;

    /**
     * Constructor que inicializa los componentes del panel.
     *
     */
    public ContenidoPublicacion() {
        initComponents();
    }

    /**
     * Método utilizado para actualizar el contenido del componente.
     */
    public void actualizarContenido() {
        if (hashtags != null) {
            for (int i = 0; i < hashtags.size(); i++) {
                txtTexto.setText(txtTexto.getText() + "#" + hashtags.get(i).getNombre() + " ");
            }
            txtTexto.setText(txtTexto.getText() + "\n" + textoPlano);

            JLabel labelImagen = new JLabel();

            ImageIcon imagenRedimensionada = redimensionarImagen(imagen);
            labelImagen.setIcon(imagenRedimensionada);
            pnlContenido.add(labelImagen);
            lblImagen.setIcon(imagenRedimensionada);
        } else {
            txtTexto.setText(textoPlano);
            JLabel labelImagen = new JLabel();

            ImageIcon imagenRedimensionada = redimensionarImagen(imagen);
            labelImagen.setIcon(imagenRedimensionada);
            pnlContenido.add(labelImagen);
            lblImagen.setIcon(imagenRedimensionada);
        }
//        txtTexto.setText(textoPlano);
//        JLabel labelImagen = new JLabel();
//        
//        ImageIcon imagenRedimensionada = redimensionarImagen(imagen);
//        labelImagen.setIcon(imagenRedimensionada);
//        pnlContenido.add(labelImagen);
//        lblImagen.setIcon(imagenRedimensionada);

        pnlContenido.repaint();
        pnlContenido.revalidate();
        this.repaint();
        this.revalidate();

    }

    /**
     * Método que inicializa los elementos del componente.
     *
     * @param textoPlano texto del publicación.
     * @param imagen imagen de la publicación.
     * @param hashtags hashtags de la publicación.
     */
    public void init(String textoPlano, String imagen, List<Hashtag> hashtags) {
        this.txtTexto.setEditable(false);
        this.txtTexto.setLineWrap(true);
        this.txtTexto.setWrapStyleWord(true);
        this.textoPlano = textoPlano;
        this.imagen = imagen;
        this.hashtags = hashtags;

        this.actualizarContenido();
    }

    /**
     * Método utilizado para redimensionar el tamaño de la imagen.
     *
     * @param imagen url de la imagen a redimensionar.
     * @return imagen redimensionada.
     */
    public ImageIcon redimensionarImagen(String imagen) {
        ImageIcon imageIcon = new ImageIcon(imagen);
        Image image = imageIcon.getImage();
        Image nuevaImagen = image.getScaledInstance(160, 160, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(nuevaImagen);
        return imageIcon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenido = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 217, 183));
        setForeground(new java.awt.Color(255, 217, 183));

        pnlContenido.setBackground(new java.awt.Color(255, 233, 214));
        pnlContenido.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlContenido.setMinimumSize(new java.awt.Dimension(411, 78));
        pnlContenido.setPreferredSize(new java.awt.Dimension(406, 78));

        jScrollPane1.setBorder(null);

        txtTexto.setBackground(new java.awt.Color(255, 233, 214));
        txtTexto.setColumns(20);
        txtTexto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTexto.setForeground(new java.awt.Color(204, 88, 3));
        txtTexto.setRows(5);
        txtTexto.setBorder(null);
        jScrollPane1.setViewportView(txtTexto);

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblImagen)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
