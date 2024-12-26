/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTS;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
*/
class Resources {
    public static byte[] readBytes(String resourceName)
        throws IOException {
        //input stream para o recurso
        InputStream in = ClassLoader.getSystemClassLoader()
        .getResourceAsStream(resourceName);
        //alocar um array de bytes
        byte[] respourceData = new byte[in.available()];
        //ler os dados
        in.read(respourceData);
        //devolver os bytes do recurso
        return respourceData;
    }
    
}
