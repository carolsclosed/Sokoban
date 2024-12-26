
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

public class Player extends Element{
   
    protected String direcao = "";
    private int coordX;
    private int coordY;

    protected String ImgFrente = "";
    protected String ImgBack = "";
    protected String ImgRight = "";
    protected String ImgLeft = "";

    
    
    private BufferedImage img;
    

    public Player(){
        //super(Color.PINK);
        this.direcao = "frente";
        setEren();
    }
    /**
     * O método getImage é projetado para carregar uma imagem a partir de um caminho
    especificado e atribui-la à variável img da classe. 
     * @param img 
     */
 public void getImage(String img){
        try{
            //ImageIO.read lê a entrada e retorna um objeto BufferedImage, que é atribuído à variável img da classe.
            this.img = ImageIO.read(getClass().getResourceAsStream(img));
            //getClass().getResourceAsStream(img)recebe um caminho para o recurso especificado. 

        }catch(IOException ex){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
   //define as imagens da personagem desejada
   public void setMikasa(){
       this.ImgFrente = "/ASSETS/mikasaFRENTE.png";
       this.ImgBack = "/ASSETS/mikasaBACK.png";
       this.ImgRight = "/ASSETS/mikasaRIGHT.png";
       this.ImgLeft = "/ASSETS/mikasaLEFT.png";
   }
      //define as imagens da personagem desejada

   public void setArmin(){
       this.ImgFrente = "/ASSETS/arminFRENTE.png";
       this.ImgBack = "/ASSETS/arminBACK.png";
       this.ImgRight = "/ASSETS/arminDIREITA.png";
       this.ImgLeft = "/ASSETS/arminESQUERDA.png";
   }
      //define as imagens da personagem desejada

   public void setEren(){
       this.ImgFrente = "/ASSETS/erenFRENTE.png";
       this.ImgBack = "/ASSETS/erenBACK.png";
       this.ImgRight = "/ASSETS/erenDIREITA.png";
       this.ImgLeft = "/ASSETS/erenESQUERDA.png";
   }
      //define as imagens da personagem desejada

   public void setLevi(){
       this.ImgFrente = "/ASSETS/leviFRENTE.png";
       this.ImgBack = "/ASSETS/leviBACK.png";
       this.ImgRight = "/ASSETS/leviDIREITA.png";
       this.ImgLeft = "/ASSETS/leviESQUERDA.png";
   }
       //define as imagens da personagem desejada

    public void setSasha(){
       this.ImgFrente = "/ASSETS/sashaFRENTE.png";
       this.ImgBack = "/ASSETS/sashaBACK.png";
       this.ImgRight = "/ASSETS/sashaDIREITA.png";
       this.ImgLeft = "/ASSETS/sashaESQUERDA.png";
   }

    @Override
    /*
    */
    
    /**
     * código da classe sokoban, método move:
     * 
     * 
        usámos a string direcao para controlar a movimentação do jogador
        para que pudessemos associar a cada movimento uma imagem de perspetiva
        diferente da personagem
        if (dx == -1) {
            // se o player for para a esquerda
            player.direcao = "esquerda";
        } else if (dx == 1) {
            player.direcao = "direita";
        } else if (dy == 1) {
            player.direcao = "frente";
        } else if (dy == -1) {
            player.direcao = "back";

        }
     */
    public void draw(Graphics gr, int px, int py, int width, int height) { 
      
        
        if(direcao.equals("frente")){
            getImage(this.ImgFrente);
        }else if(direcao.equals("esquerda")){
            getImage(this.ImgLeft);
        }
        else if(direcao.equals("direita")){
            getImage(this.ImgRight);
        }
        else if(direcao.equals("back")){
            getImage(this.ImgBack);
        }
        gr.drawImage(this.img, px, py, width, height, null);
    }

    //encapsulamento
    public String getImgFrente() {
        return ImgFrente;
    }

    public void setImgFrente(String ImgFrente) {
        this.ImgFrente = ImgFrente;
    }

    public String getImgBack() {
        return ImgBack;
    }

    public void setImgBack(String ImgBack) {
        this.ImgBack = ImgBack;
    }

    public String getImgRight() {
        return ImgRight;
    }

    public void setImgRight(String ImgRight) {
        this.ImgRight = ImgRight;
    }

    public String getImgLeft() {
        return ImgLeft;
    }

    public void setImgLeft(String ImgLeft) {
        this.ImgLeft = ImgLeft;
    }

    
    
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
