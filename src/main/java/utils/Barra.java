/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Gael
 */

import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Barra extends JScrollBar {

    public Barra() {
        this.setUI(new MyScrollBarUI());
      
        this.setBackground(new Color(196,95,6));
      
        this.setPreferredSize(new Dimension(7,3));
  
    }
} 
