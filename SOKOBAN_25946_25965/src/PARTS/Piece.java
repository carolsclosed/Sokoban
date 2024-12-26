
package PARTS;



/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
 */
public enum Piece {
            WALL('#'),
            PLAYER('@'),
            VOID('O'),
            DOOR('E'),
            BLOCK('$'),
            GOAL('.'),
            BLOCKGOAL('*'),
            PLAYERGOAL('+'),
            EMPTY(' ');         
            //enumeração para dizer o que representa cada caracter no mapa

    private final char ch;
    
    /**
     * construtor com parametro ch (char) que indica qual caracter está a ser 
        representado pela instância da enumeração.
        O construtor então atribui esse valor ao campo ch da instância.
     * @param ch 
     */
    private Piece(char ch){
        this.ch = ch;
      
    }
    
    
    public char getChar(){
        return ch;
    }
    /**
     * Verifica se o caractere ch é igual ao caractere associado à enumeração WALL por exemplo. 
        Se for verdadeiro, retorna uma instância da classe Wall. Isto acontece
        para os restantes if's.
     * @param ch
     * @return 
     */
    public static Element getElement(char ch){
        
        if(ch == WALL.ch)
            return new Wall();
        if(ch == PLAYER.ch)
            return new Empty();
        if(ch == BLOCK.ch)
            return new Block();
        if(ch == GOAL.ch)
            return new Goal();
        if(ch == VOID.ch)
            return new Void();
        if(ch == EMPTY.ch)
            return new Empty();
        if(ch == BLOCKGOAL.ch)
            return new Block(true);
        if(ch == DOOR.ch)
            return new Door(false);
        
   return new Empty(); 
   
   
   
   
    }
}

