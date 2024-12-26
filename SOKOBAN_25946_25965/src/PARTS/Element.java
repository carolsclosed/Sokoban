/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTS;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
*/
public abstract class Element extends JComponent {
    protected Color color;
    
    public Element(){//construtor padrao
        color = Color.GRAY;
        //define a cor padrão dos objetos Element 
        //como cinzento, caso nenhuma outra cor seja especificada.
    }
    /**
     *  construtor que permite a escolha da cor ao criar objeto
     * @param c 
     */
    public Element(Color c){
        this.color = c;
       
    }
    
    /**
     * método para desenhar o elemento
     * @param gr
     * @param px
     * @param py
     * @param width
     * @param height 
     */
   
    public abstract void draw(Graphics gr, int px, int py , int width , int height);
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    
    public void paintComponent(Graphics gr){
        draw(gr, 0,0,getWidth(),getHeight());
        
    }

}
