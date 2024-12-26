/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTS;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
*/
public class Goal extends Clear {
    private boolean GoalWith;
    private BufferedImage img;
    
    public Goal(){
        
    }
    
    
    //O GoalWith é um boolean que indica se o goal tem uma caixa associada.
    public boolean GoalWithBox(){
        return GoalWith;
    }
    
    /**
     * O método setGoalWith(boolean GoalWith) permite alterar o valor de GoalWith
        após criar o objeto. 
     * @param GoalWith 
     */
    public void setGoalWith(boolean GoalWith) {
        this.GoalWith = GoalWith;
    }
    /**
     * O método getImage é projetado para carregar uma imagem a partir de um caminho
    especificado e atribui-la à variável img da classe. 
     */
public void getImage(){
        try{
//ImageIO.read lê a entrada e retorna um objeto BufferedImage, que é atribuído à variável img da classe.

            this.img = ImageIO.read(getClass().getResourceAsStream("/ASSETS/floorONGOAL.jpg"));
            //getClass().getResourceAsStream("...")recebe um caminho para o recurso especificado. 
       
        }catch(IOException ex){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * Este método draw desenha uma imagem 
     (Graphics gr) numa posição px, py e com dimensões especificadas width, height.
     * @param gr
     * @param px
     * @param py
     * @param width
     * @param height 
     */
    public void draw(Graphics gr, int px, int py, int width, int height) {
       getImage();
        gr.drawImage(this.img, px, py, width, height, null);
    }
    
  
    
}