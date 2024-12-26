/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTS;


import java.awt.Color;


/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
*/
public abstract class Clear extends Element {
    public Clear(){
        //construtor por defeito
    }
    /**
     * Construtor com um Parâmetro Color: 
        Recebe um objeto Color e passa para 
        o construtor da superclasse Element, permitindo que a instância de Element
        seja inicializada com uma cor específica.
     * @param c 
     */
    public Clear(Color c){
        super(c);
        
    }
    
    
}
