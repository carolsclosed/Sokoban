package Music;

import java.io.BufferedInputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
 */
public final class MusicPlay {

    // unico objeto criado da classe para que seja um singleton 
    private static MusicPlay UNIQUE;
    // variavel para utilizar da biblioteca de musica
    private Clip clip;
    // nome do ficheiro de musica tocando atualmente
    private String fileName;

    // variavel para indicar que a musica tem que parar
    // a mesma tem que ser volatile para todas as threads receberem os valores atualizados
    // no caso esta sendo utilizada na funcao de loop
    private volatile boolean stopRequested;

    // construtor privado
    private MusicPlay() {
    }

    
    /**
     * subistituto do construtor para retornar a unica instancia, por isso é estatico
     * @return 
     */
    public static MusicPlay getInstance() {
        if (UNIQUE == null) { // se ainda nao foi criado vamos criar apenas uma vez
            UNIQUE = new MusicPlay();
        } // retornamos entao a unica referencia existente
        return UNIQUE;
    }

    
    
    /**
     * logica utilizada em thread para fazer loop da musica
     * @param tempo 
     */
    public void loopMusica(int tempo) {
        new Thread(() -> { 
            
            // esperamos um segundo antes de limpar o stop requested
            // pois temos que dar tempo para a thread da musica anterior 
            // acabar o seu sleep, caso nos mudemos o stopRequested logo para true
            // a thread da musica anterior nao vai ter tempo de ler a variavel
            try {
                Thread.sleep(1000); // espera um segundo
                // limpamos qualquer stopRequested anterior com o novo loop
                stopRequested = false; 
            } catch (InterruptedException ex) {
                // maneira correta de terminar a thread atual caso tenha erro no sleep
                Thread.currentThread().interrupt();
                return;
            }
            

            
            // iniciamos uma nova thread para que a musica toque novamente
            // apos o tempo indicado tenha acabado
            int x = 0;  // o x conta os segundos passados
            while (x < tempo && !stopRequested) {

                try {
                    Thread.sleep(1000); // espera um segundo
                } catch (InterruptedException ex) {
                    // maneira correta de terminar a thread atual caso tenha erro no sleep
                    Thread.currentThread().interrupt(); 
                    return;
                }
                x++;
            }
            // se sairmos do loop pois o tempo ja passou, tocamos musica
            // porem apenas se nao requesitado um stop
            if (!stopRequested) {
                // iniciamos o play musica para repetir todo o processo
                playMusica(fileName, tempo);
            }

            // thread acaba
        }).start();
    }
    /**
     *paramos a musica e a thread
     */
    public void pararMusica() { 
        if (clip != null) {
            clip.stop();
        }
        // para parar a thread
        stopRequested = true;
    }
    /**
     * método para iniciar música, recebe o path da música e recebe quantos segundos deve tocar
     * @param fileName
     * @param tempo 
     */
    public void playMusica(String fileName, int tempo) {
        pararMusica(); // Ao tocar nova musica, vamos parar a anterior
        this.fileName = fileName;  // salvar musica tocando atualmente
        try {
            // local da musica
            InputStream audioSrc = getClass().getResourceAsStream("/Music/" + fileName);
            if (audioSrc == null) { // se nao existir retornar erro
                throw new IOException("Audio file not found: " + fileName);
            }

            // transforma a musica em um InputStream
            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            // cria um AudioInputStream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            // comeca a musica
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            
            
            // inica um loop que vai verificar a cada 1 segundo se deve parar 
            // ou tocar a musica novamente
            loopMusica(tempo);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(MusicPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
