/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ejercicio_03_06;

import java.awt.Graphics;

/**
 *
 * @author ASUS
 */
public class AreaDibujo extends javax.swing.JPanel {

    /**
     * Creates new form AreaDibujo
     */
    
    PanelPrincipal P;
    public AreaDibujo() {
        initComponents();
        P = new PanelPrincipal();
    }

    public void EnviarCordenadasXY(int x, int y){
        P.setX(x);
        P.setY(y);
    }
    
    public void EnviarAnchoAlto(int ancho, int alto){
        P.setAncho(ancho);
        P.setAlto(alto);
    }
    
    public void ElegirFigura(int f){
        P.setjComboBox1(f);
    }
    public void ElegirColor(int c){
        P.setjComboBox2(c);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        P.dibujar(g);
    }
    
    public void Actualizar(){
        repaint();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
