/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTS;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António
 * Manso
 */
public class Door extends Element {

    private BufferedImage img;
    private boolean isOpen;

    public Door() {
        //super(Color.YELLOW);// QUER DIZER QUE AS PAREDES SAO amarelas
            }
    /**
     * Constrói um objeto Door e define se está aberta.
     *parametro iaOpen é um valor booleano que indica se 
     * a porta está no aberta (true) ou não (false).
     * @param isOpen 
     */
    public Door(boolean isOpen) {
        this.isOpen = isOpen;
       
    }


    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
   
   
    
    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    /**
     * O método getImage é projetado para carregar uma imagem a partir de um caminho
    especificado e atribui-la à variável img da classe. 
     * @param path 
     */
    public void getImage(String path){
        try{
            //ImageIO.read lê a entrada e retorna um objeto BufferedImage, que é atribuído à variável img da classe.
            this.img = ImageIO.read(getClass().getResourceAsStream(path));
            //getClass().getResourceAsStream(path)recebe um caminho para o recurso especificado. 
        }catch(IOException ex){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 

    /**
     * Este método draw desenha uma imagem 
     (Graphics gr) numa posição px, py e com dimensões especificadas width, height. 
     A imagem a ser desenhada depende da condição (inGoal), se for true desenha 
     boxONGOAL.jpg, se for false desenha NOTGOAL.jpg
     * @param gr
     * @param px
     * @param py
     * @param width
     * @param height 
     */
    @Override
    public void draw(Graphics gr, int px, int py, int width, int height){
          if(isOpen==true){
            getImage("/ASSETS/doorOPEN.png");
            gr.drawImage(this.img, px, py, width, height, null);
        }else{
            getImage("/ASSETS/door.png");
            gr.drawImage(this.img, px, py, width, height, null);
        }
    }
     
        
    }

