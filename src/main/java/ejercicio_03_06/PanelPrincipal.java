/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03_06;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComboBox;

/**
 *
 * @author ASUS
 */
public class PanelPrincipal extends Ventana0306 {
    private int ancho;
    private int alto;
    private int jComboBox1;
    private int jComboBox2;
    

    public PanelPrincipal() {
        this.ancho = 0;
        this.alto = 0;
    }

    public int getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(int jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public int getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(int jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }
    
    
    

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    public void dibujar(Graphics r){
        
        if(this.getjComboBox1()==0)
        {
                      
            /*int[] X1={300,250,150,230,200,300,400,370,450,350};
            int[] Y1={100,200,200,280,400,340,400,280,200,200};*/
            
            int[] X1={this.getX(),(this.getX()-this.getAlto())+25,(this.getX()
                    -this.getAlto())-100,this.getX()-this.getAlto(),
                    (this.getX()-this.getAlto())-100,this.getX(),
                    (this.getX()-this.getAlto())+300,this.getX()+this.getAlto(),
                    (this.getX()-this.getAlto())+300,(this.getX()+this.getAlto())-25};
            int[] Y1={this.getY(),this.getY()+this.getAncho(),this.getY()
                    +this.getAncho(),(this.getY()+this.getAncho())+100,
                    (this.getY()+this.getAncho())+200,this.getY()+250,
                    (this.getY()+this.getAncho())+200,(this.getY()+
                    this.getAncho())+100,this.getY()+this.getAncho(),
                    this.getY()+this.getAncho()};
            
            if(this.getjComboBox2()==0){
               r.setColor(Color.YELLOW);
            }
            if(this.getjComboBox2()==1){
               r.setColor(Color.BLUE);
            }
            if(this.getjComboBox2()==2){
               r.setColor(Color.RED);
            }
            if(this.getjComboBox2()==3){
               r.setColor(Color.GREEN);
            }
            r.fillPolygon(X1, Y1, 10);
                       
        }
        if(this.getjComboBox1()==1)
        {
            if(this.getjComboBox2()==0){
               r.setColor(Color.YELLOW);
            }
            if(this.getjComboBox2()==1){
               r.setColor(Color.BLUE);
            }
            if(this.getjComboBox2()==2){
               r.setColor(Color.RED);
            }
            if(this.getjComboBox2()==3){
               r.setColor(Color.GREEN);
            }
            r.fillOval(this.getX()-(this.getAncho()/2), this.getY()
                    -(this.getAlto()/2), this.getAlto(), this.getAncho());
                      
        }
        if(this.getjComboBox1()==2)
        {
            if(this.getjComboBox2()==0){
               r.setColor(Color.YELLOW);
            }
            if(this.getjComboBox2()==1){
               r.setColor(Color.BLUE);
            }
            if(this.getjComboBox2()==2){
               r.setColor(Color.RED);
            }
            if(this.getjComboBox2()==3){
               r.setColor(Color.GREEN);
            }
            r.fillRect(this.getX()-(this.getAncho()/2), this.getY()
                    -(this.getAlto()/2), this.getAlto(), this.getAncho());            
        }
        
        if(this.getjComboBox1()==3)
        {
            if(this.getjComboBox2()==0){
               r.setColor(Color.YELLOW);
            }
            if(this.getjComboBox2()==1){
               r.setColor(Color.BLUE);
            }
            if(this.getjComboBox2()==2){
               r.setColor(Color.RED);
            }
            if(this.getjComboBox2()==3){
               r.setColor(Color.GREEN);
            }
            r.fillRect(this.getX()-(this.getAncho()/2), this.getY()
                    -(this.getAlto()/2), this.getAlto(), this.getAncho());            
        }
        
        if(this.getjComboBox1()==4)
        {
            if(this.getjComboBox2()==0){
               r.setColor(Color.YELLOW);
            }
            if(this.getjComboBox2()==1){
               r.setColor(Color.BLUE);
            }
            if(this.getjComboBox2()==2){
               r.setColor(Color.RED);
            }
            if(this.getjComboBox2()==3){
               r.setColor(Color.GREEN);
            }
            
            int[] X={this.getX(),this.getX()-this.getAlto(),this.getX()+this.getAlto()}; 
            int[] Y={this.getY(),this.getY()+this.getAncho(),this.getY()+this.getAncho()};
            
            r.fillPolygon(X, Y, 3);
        }
    
    }
    
}
