/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change thset license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTS;

import APPS.END;
import APPS.GAME1;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António
 * Manso
 */
public class Sokoban extends JComponent {

    /*
    Wall - #
    player - @
    block - $
    goal- .
    blockgoal - +
    playergoal - +
    empty - 
    void - O 
     */
    private Element[][] world;
    private Player player;
    private final Door door;

    private Integer lvlCount;

    private final Player selected;

    /**
     * Este construtor é usado para inicializar um novo objeto Sokoban,
     * configurando o número do nível, o jogador, uma porta fechada, e o mapa do
     * nível baseado no número do nível fornecido.
     *
     * @param lvlCount
     * @param player
     */
    public Sokoban(int lvlCount, Player player) {
        this.lvlCount = lvlCount;
        this.selected = player;
        this.player = player;
        this.door = new Door(false);
        /*Obtém o layout do nível atual ao chamar getLevel(lvlCount) 
        no objeto GameMapConst. O layout do nível é então processado pelo
        método joinMatrixRows. Finalmente, o método setPuzzle é chamado com o resultado,
        configurando o mapa atual do jogo.*/

        setPuzzle(joinMatrixRows(new GameMapConst().getLevel(lvlCount)));
    }
    
    public Sokoban(){
    this(0,new Player());
    }

    /**
     * Este método, joinMatrixRows, concatena todos os elementos em cada linha
     * de um array de strings 2d (matrix) em strings isoladas, depois junta
     * estas linhas de strings com \n a separar.
     *
     * @param matrix
     * @return
     */
    private static String joinMatrixRows(String[][] matrix) {
        StringBuilder result = new StringBuilder();//Cria um objeto StringBuilder vazio chamado result

        for (String[] row : matrix) {//Itera por cada linha da matriz matrix usando um loop for-each
            String joinedRow = String.join("", row);
            //usa o método String.join() para concatenar todos os elementos do array row em uma string única, sem separadores. O resultado é armazenado na variável joinedRow.
            result.append(joinedRow).append("\n");
            //Adiciona a string joinedRow ao final do objeto StringBuilder result, seguida de uma quebra de linha (\n) com o método append().
        }

        if (result.length() > 0) {//Depois de iterar sobre todas as linhas da matriz, verifica se o objeto StringBuilder result não está vazio
            result.setLength(result.length() - 1);
            //Se result não estiver vazio, remove o último caractere (que é a quebra de linha adicional) com o método setLength().
        }

        return result.toString();
        //Retorna a string resultante como uma string única, usando o método toString() do objeto StringBuilder.
    }

    /**
     * O método isComplete() verifica se todos os Goal's que existem no mapa têm
     * uma caixa em cima, se tiverem todos essa caixa, o nível está completo
     *
     * @return
     */
    public boolean isComplete() {
        for (Element[] world1 : world) {
            for (Element world11 : world1) {
                if (world11 instanceof Goal goal) {
                    if (!goal.GoalWithBox()) {
                        return false;
                    }
                }
            }
        }

        return true;

    }

    /**
     * o método setPuzzle(String p) converte a string do mapa em uma matriz
     * bidimensional de elementos, configurando o estado inicial do mapa e a
     * posição do jogador.
     *
     * @param p
     */
    public void setPuzzle(String p) {
        String lines[] = p.split("\n");
        //A string p é dividida em linhas usando o caractere de nova linha (\n) 
        //como delimitador.
        //O resultado é armazenado no array lines.
        world = new Element[lines.length][];
        //O array world é inicializado como um array bidimensional de elementos
        //(Element), onde o número de linhas é igual ao número de linhas da entrada p.
        for (int y = 0; y < lines.length; y++) {
            world[y] = new Element[lines[y].length()];
            //Itera sobre cada linha (y) e inicializa cada linha do world com um array
            //de elementos com o comprimento da linha correspondente em lines.
            for (int x = 0; x < world[y].length; x++) {
                //Para cada caractere na linha (x), verifica qual tipo de peça (Piece) ele representa.
                if (lines[y].charAt(x) == Piece.DOOR.getChar()) {
                    world[y][x] = this.door;
                    continue;
                }
                world[y][x] = Piece.getElement(lines[y].charAt(x));

                //Se o caractere representa o jogador (Piece.PLAYER) ou o
                //jogador está no objetivo (Piece.PLAYERGOAL), 
                //as coordenadas do jogador (player) são atualizadas para x e y.
                if (lines[y].charAt(x) == Piece.PLAYER.getChar()
                        || lines[y].charAt(x) == Piece.PLAYERGOAL.getChar()) {
                    player.setCoordY(y);
                    player.setCoordX(x);
                }

            }
        }
    }

    /**
     * retorna o número máximo de colunas (ou elementos) presente em qualquer
     * linha da matriz world.
     *
     * @return
     */
    public int getColumns() {
        int max = 0;
        for (Element[] line : world) {
            max = max > line.length ? max : line.length;
        }
        return max;
    }

    /**
     * desenha o estado atual do mapa e do jogador no componente gráfico. Este
     * método é preciso para atualizar a representação gráfica do mapa e do
     * jogador.
     *
     * @param gr
     */
    @Override

    public void paintComponent(Graphics gr) {
        int dimY = getHeight() / world.length;
        int dimX = getWidth() / getColumns();//por isto existe o método getColumns()

        for (int y = 0; y < world.length; y++) {
            for (int x = 0; x < world[y].length; x++) {
                world[y][x].draw(gr, x * dimX, y * dimY, dimX, dimY);

                // iterar sobre cada sitio do mundo.
                //A cada iteração, o método draw é chamado,
                //passando as coordenadas do sitio e as dimensões
                //do sitio para desenhar cada elemento.
            }
        }
        player.draw(gr, dimX * player.getCoordX(), dimY * player.getCoordY(), dimX, dimY);
        //o jogador é desenhado na posição atual, multiplicando as dimensões
        //do sitio pelas coordenadas do jogador para encontrar a posição
        //onde ele deve ser desenhado.

    }

    public Element[][] getWorld() {
        return world;
    }

    public void setWorld(Element[][] world) {
        this.world = world;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getLvlCount() {
        return lvlCount;
    }

    public void setLvlCount(Integer lvlCount) {
        this.lvlCount = lvlCount;
    }

    /**
     * controlar o movimento do jogador no world. Ele recebe parâmetros para
     * indicar a direção do movimento (dx e dy) e se o jogador está a segurar
     * uma caixa (isHolding).
     *
     * @param dx
     * @param dy
     * @param isHolding
     */
    public void move(int dx, int dy, boolean isHolding) {
        // Calcula as novas coordenadas do jogador - para mover
        int newX = player.getCoordX() + dx;
        int newY = player.getCoordY() + dy;
        // Mantém as coordenadas atuais do jogador - para o isHolding
        int blockX = player.getCoordX();
        int blockY = player.getCoordY();
        // Se o jogador estiver a segurar um bloco
        if (isHolding) {

            // Move as coordenadas do bloco com base na direção do jogador
            //se o jogador estiver virado para a esquerda e tiver
            //uma caixa na esquerda ele pode segurar a caixa e mover
            if ("esquerda".equals(player.direcao)) {
                blockX--;
            }
            if ("direita".equals(player.direcao)) {
                blockX++;
            }
            if ("frente".equals(player.direcao)) {
                blockY++;
            }
            if ("back".equals(player.direcao)) {
                blockY--;
            }
        }
        // Se o jogador não estiver segurando nada, atualiza a direção do jogador
        // para a skin atualizar na classe Player.java
        if (!isHolding) {
            if (dx == -1) {
                player.direcao = "esquerda";
            } else if (dx == 1) {
                player.direcao = "direita";
            } else if (dy == 1) {
                player.direcao = "frente";
            } else if (dy == -1) {
                player.direcao = "back";
            }
        }
        // Verifica se a nova posição do jogador está no Void (buraco criado por nós)

        if (world[newY][newX] instanceof Void) {
            // Se sim, exibe mensagem de GAME OVER
            JOptionPane.showMessageDialog(this, "GAME OVER!");
            // Fecha a janela do jogo
            java.awt.Window window = SwingUtilities.getWindowAncestor(this);
            if (window instanceof JFrame) {
                ((JFrame) window).setVisible(false);
                // Reinicia o jogo
                new GAME1(this.lvlCount, this.selected);

            }
            return;
        }
// Verifica se o jogador alcançou uma porta
        if (world[newY][newX] instanceof Door) {
            // Se o nível estiver completo
            if (isComplete()) {
                // Fecha a janela do jogo atual
                java.awt.Window window = SwingUtilities.getWindowAncestor(this);
                if (window instanceof JFrame) {
                    ((JFrame) window).setVisible(false);
                    // Move o jogador para a nova posição
                    player.move(dx, dy);
                    // incrementa o número do nível
                    this.lvlCount = this.lvlCount + 1;
                    // Se atingiu o último nível+1(porque começa no zero),
                    //exibe a tela do fim de jogo
                    if (this.lvlCount == 32) {
                        new END().setVisible(true);
                        return;
                    }
                    // Inicia o próximo nível
                    new GAME1(this.lvlCount, this.selected).setVisible(true);

                }
                return;
            }

        }

        // Verifica se o jogador chegou a uma parede
        if (world[newY][newX] instanceof Wall) {
            return;// ignora a movimentação na direção da parede
        }
        // Verifica se o jogador está em um espaço sem nada
        if (world[newY][newX] instanceof Clear) {
            player.move(dx, dy);//ja que nao tem nada pode andar
        }
        // Verifica se o jogador chegou a um bloco e se há espaço sem nada
        //para mover o bloco
        if (world[newY][newX] instanceof Block block
                && world[newY + dy][newX + dx] instanceof Clear) {
            // Calcula as novas coordenadas do bloco
            int newBlockX = newX + dx;
            int newBlockY = newY + dy;
            // Move o bloco para a nova posição
            moveBlock(newX, newY, newBlockX, newBlockY, block);
            // Move o jogador para a nova posição
            player.move(dx, dy);
        }
        // Se o jogador estiver a segurar um bloco e houver espaço vazio para mover o bloco
        if (isHolding
                && world[blockY][blockX] instanceof Block block
                && world[blockY + dy][blockX + dx] instanceof Clear) {
            // Move o bloco para a nova posição
            moveBlock(blockX, blockY, blockX + dx, blockY + dy, block);
        }
        // Verifica se o nível foi completado e atualiza o estado da porta
        if (isComplete()) {
            door.setIsOpen(true);
        } else {
            door.setIsOpen(false);
        }
// Atualiza a interface do utilizador
        repaint();

    }

    /**
     * move um bloco de uma posição para outra no world. Ele recebe as
     * coordenadas de origem (fromX, fromY) e destino (toX, toY) do bloco,
     * juntamente com o bloco que vai ser movido.
     *
     * @param fromX
     * @param fromY
     * @param toX
     * @param toY
     * @param block
     */
    private void moveBlock(int fromX, int fromY, int toX, int toY, Block block) {
        world[fromY][fromX] = new Empty(); // // Define a posição anterior como vazia, independentemente do que estava lá antes.
        if (block.isInGoal()) {
            world[fromY][fromX] = new Goal();
            // Se o bloco estava em um goal antes de se mover,
            //marca a posição anterior como um goal.
        }

        if (world[toY][toX] instanceof Empty) {// Se a posição de destino estiver vazia, move o bloco para lá.
            world[toY][toX] = new Block();
            return;
        }

        if (world[toY][toX] instanceof Goal) {// Se o destino for um goal, move o bloco para lá e marca-o como em cima do goal.
            world[toY][toX] = new Block(true);
            return;
        }

        if (world[toY][toX] instanceof Void) {// Se a posição de destino for um buraco(void), move o bloco para lá.
            world[toY][toX] = new Block();
        }
    }

}
