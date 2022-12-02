/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;


import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;

/**
 * Clase utilizada para obtener una ScrollBar personalizada.
 *
 * @author Equipo broker
 */
public class Barra extends JScrollBar {
    /**
     * Constructor que inicializa la barra.
     */
    public Barra() {
        this.setUI(new MyScrollBarUI());
      
        this.setBackground(new Color(196,95,6));
      
        this.setPreferredSize(new Dimension(7,3));
  
    }
} 
