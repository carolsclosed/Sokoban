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
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
*/
public class Block extends Element{
    private boolean inGoal;
    
    private int coordX;
    private int coordY;
    private BufferedImage img;
    
    public Block(){
        // construtor por defeito
    }
    /**
     * Constrói um objeto Block e define se está no objetivo.
    parametro inGoal é um valor booleano que indica se 
    o bloco está no Goal (true) ou não (false).
     * @param inGoal 
     */
    public Block(boolean inGoal) {
        this.inGoal = inGoal;
        
    }
  

    
    public boolean isInGoal(){
        return inGoal;
    }
    /*Verifica se o bloco está no objetivo.
 *
 * @return true se o bloco estiver no objetivo, false caso contrário.*/
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
    

    //encapsulamento da IMG
    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
   
    //encapsulamento do InGoal

    public boolean getInGoal() {
        return inGoal;
    }
    public void setInGoal(boolean inGoal){
        this.inGoal = inGoal;
  
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
    public void draw(Graphics gr, int px, int py, int width, int height){
          if(!inGoal){
            getImage("/ASSETS/NOTGOAL.jpg");
            gr.drawImage(this.img, px, py, width, height, null);
        }else{
            getImage("/ASSETS/boxONGOAL.jpg");
            gr.drawImage(this.img, px, py, width, height, null);
        }
     
        
    }
    //encapsulamento:
    public int getCoordX(){
        return coordX;
    }
    public void setCoordX(int coordX){
        this.coordX = coordX;
    }
    public int getCoordY(){
        return coordY;
    }
    public void setCoordY(int coordY){
        this.coordY = coordY;
    }
   
    /**
     * Este método recebe dois parâmetros, dx e dy, 
     que representam as mudanças na coordenadas x e y.
     Adiciona estas mudanças às coordenadas x e y atuais (coordX e coordY), 
     o que resulta num deslocamento da posição atual do objeto.
     * @param dx
     * @param dy 
     */
    @Override
    
    public void move(int dx, int dy){
        coordX += dx;
        coordY += dy;
        
    
    }
    
}
