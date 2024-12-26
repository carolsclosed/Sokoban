package PARTS;


/**
 *
 * @author Ângela Sebastião e Daniel Domingues com base do Professor António Manso
 */
public  class GameMapConst {

    /**
     * Retorna a matriz de strings 2D no nível especificado da matriz MATRIX.
 Lança uma IllegalArgumentException se o nível estiver fora do tamanho da MATRIX.
     * @param level
     * @return 
     */
    public static String[][] getLevel(Integer level) {
        if (level == null || level < 0 || level >= MATRIX.length) {
            System.exit(0);
        }
        return MATRIX[level];
        

    }
    /**
     * retorna o tamanho máximo da matriz
     * @return 
     */
    public static int getMaxLevel(){
    return MATRIX.length;
    }

   

    
    /**
     * é uma matriz 3D, é uma matriz que possui nos seus elementos 
os níveis, que por sua vez são 2D
     */
    private static String[][][] MATRIX = {
        {
            //nivel0
            {"#", "#", "#", "#", "#"},
            {"#", "O", ".", " ", "#"},
            {"#", " ", " ", " ", "#", "#"},
            {"#", "*", " ", " ", "@", "E"},
            {"#", " ", " ", "$", " ", "#"},
            {"#", " ", " ", " ", "#", "#"},
            {"#", "#", "#", "#", "#"},},
        {            //nivel1

            {"#","#", "#", "#", "#", "#",},
            {"#"," ", " ", " ", " ", "#"},
            {"#", " ", "$", " ", "#"},
            {"#", " ", "$", " ", "#"},
            {"#"," ", " ", " ", ".", "#"},
            {"#","O", " ", " ", "@", ".", "#"},
            {"#","#", "#", "#", "E", "#", "#"},},
        {
                       //nivel2

            {"#", "#", "#", "#", "E" , "#"},
            {"#", " ", " ", " ", "@", "#", "#", "#", "#"},
            {"#", " ", " ", " ", " ", " ", "$", " ", "#"},
            {"#", ".", "#", " ", " ", "#", "$", " ", "#"},
            {"#", " ", "#", "O", ".", "#", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel3

            {"#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", "O", "#", ".", " ", " ", "@", "E"},
            {"#", " ", "#", "#", "#", "$", " ", "#"},
            {"#", ".", " ", " ", "$", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel4
            
            {"#", "#", "#", "#", "#", "E", "#"},
            {"#", "O", " ", " ", " ", "@", "#"},
            {"#", " ", ".", "$", ".", " ", "#", "#"},
            {"#", "#", "#", "$", "@", "$", " ", "#"},
            {"#", " ", " ", ".", "$", ".", " ", "#"},
            {"#", "O", " ", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel5
            
            {"#", "E", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", "@", " ", " ", " ", "#", " ", "#", " ", " ", " ", "#"},
            {"#", " ", "$", "$", " ", " ", " ", " ", " ", "#", " ", "#"},
            {"#", " ", "$", " ", " ", ".", ".", ".", " ", " ", " ", "#"},
            {"#", "O", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#"},
            {"#", "#", "#", "#", "#"},},
        {
            //nivel6
            
            {"#", "E", "#", "#", "#", "#", "#"},
            {"#", "@", " ", "O", " ", " ", "#"},
            {"#", " ", ".", "$", ".", " ", "#"},
            {"#", " ", "$", ".", "$", " ", "#"},
            {"#", " ", ".", "$", ".", " ", "#"},
            {"#", " ", "$", ".", "$", " ", "#"},
            {"#", " ", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel7
            
            {"#", "#", "#", "#", "#"},
            {"#", ".", " ", " ", "#", "#"},
            {"#", " ", "$", " ", " ", "#"},
            {"#", " ", "$", " ", "#", "#"},
            {"E", "@", " ", "#", "#"},
            {"#", "O", ".",  "#"},
            {"#", "#", "#" , "#"},},
        {
            //nivel8
            
            {"#", "#", "#", "#", "#"},
            {"#", ".", " ", " ", "#"},
            {"#", ".", " ", " ", "#"},
            {"#", "#", " ", " ", "#", "#", "#", "#", "#", "#", "#"},
            {"#", ".", " ", " ", "$", " ", "$", " ", " ", "O", "#"},
            {"#", " ", "$", " ", "#", " ", "#", " ", "#", "#", "#"},
            {"E", "@", " ", " ", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel9
            
            {"#", "#", "#", "#", "#", "#"},
            {"#", ".", " ", " ", " ", "#"},
            {"#", " ", "#", " ", " ", "#", "#"},
            {"#", "#", "#", " ", " ", " ", "#", "#", "#"},
            {"#", " ", ".", " ", "$", " ", "$", ".", "#"},
            {"E", "@", " ", "$", " ", " ", " ", " ", "#"},
            {"#", "O", " ", "#", "#", "#", "#", "#", "#"},
            {"#", "#", "#", "#"},},
        {
            //nivel10
            
            {"#", "#", "#", "E", "#"},
            {"#", " ", " ", "@", "#", "#"},
            {"#", " ", "$", " ", " ", "#"},
            {"#", "#", " ", "$", " ", "#", "#", "#"},
            {"#", "#", "#", " ", ".", " ", "O", "#"},
            {"#", " ", " ", ".", "#", " ", "#"},
            {"#", " ", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel11            
            {"#", "#", "E", "#"},
            {"#", ".", "@", "#", "#"},
            {"#", ".", " ", " ", "#"},
            {"#", ".", "$", " ", "#"},
            {"#", "#", "$", " ", "#", "#"},
            {"#", " ", "$", " ", " ", "#"},
            {"#", " ", " ", " ", "O", "#"},
            {"#", " ", " ", "#", "#", "#"},
            {"#", "#", "#", "#"},},
        {
            //nivel12
            {"#", "#", "#", "#", "#", "#", "#"},
            {"#", "O", " ", " ", " ", " ", "#"},
            {"#", " ", " ", "$", "#", "@", "E"},
            {"#", ".", "#", " ", " ", " ", "#"},
            {"#", " ", "#", " ", "#", "#", "#"},
            {"#", "#", "#", "#", "#"},},
        {
            //nivel13
            {"#", "#", "E", "#"},
            {"#", "O", "@", "#", "#", "#", "#", "#", "#"},
            {"#", " ", " ", " ", " ", " ", "*", " ", "#"},
            {"#", " ", " ", " ", " ", "$", " ", " ", "#"},
            {"#", "#", " ", "#", "#", "#", "#", "#", "#"},
            {"#", " ", ".", " ", "#"},
            {"#", "#", "#", "#", "#"},},
        {
            //nivel14
            {"#", "#", "#", "E", "#"},
            {"#", "O", " ", "@", "#", "#", "#"},
            {"#", " ", " ", " ", " ", " ", "#", "#"},
            {"#", "#", " ", "#", " ", " ", " ", "#", "#"},
            {"#", " ", " ", " ", "#", " ", " ", " ", "#", "#"},
            {"#", " ", " ", " ", "#", "$", "$", "$", " ", "#"},
            {"#", ".", ".", ".", "#", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},},
        {
            //nivel15
            {"#", "#", "#", "E", "#"},
            {"#", " ", " ", "@", "#"},
            {"#", ".", " ", " ", "#"},
            {"#", "$", "$", "$", "#", "#"},
            {"#", " ", " ", " ", " ", "#"},
            {"#", ".", " ", ".", "O", "#"},
            {"#", "#", "#", "#", "#", "#"},},
        {
            //nivel16
            {"#", "#", "#", "#", "E", "#", "#"},
            {"#", " ", " ", " ", "@", "O", "#"},
            {"#", ".", " ", ".", " ", " ", "#"},
            {"#", " ", "#", "$", " ", "#", "#"},
            {"#", " ", " ", "$", " ", "#"},
            {"#", "#", " ", "#", "#", "#"},
            {"#", " ", " ", "#"},
            {"#", " ", " ", "#"},
            {"#", "#", "#", "#"},},
        {
            //nivel17
            {"#", "#", "#", "#", "#", "#", "E", "#"},
            {"#", "$", " ", " ", " ", " ", "@", "#"},
            {"#", " ", "$", " ", "$", "$", " ", "#"},
            {"#", " ", " ", "#", "#", "#", "#", "#"},
            {"#", " ", " ", "#"},
            {"#", ".", ".", "#"},
            {"#", ".", ".", "#"},
            {"#", "#", "#", "#"},},
        {
            //nivel18
            {"#", "#", "#", "#", "#", "#", "#"},
            {"E", "@", " ", " ", " ", " ", "#", "#", "#"},
            {"#", " ", " ", " ", "$", "$", ".", "O", "#"},
            {"#", "#", " ", " ", " ", " ", "#", "#", "#"},
            {"#", " ", " ", " ", " ", " ", "#"},
            {"#", ".", " ", "#", "#", "#", "#"},
            {"#", " ", " ", "#"},
            {"#", "#", "#", "#"},},
        {//nivel19
            {"#", "#", "#", "#"},
            {"#", "O", " ", "#", "#", "#", "#"},
            {"E", "@", ".", " ", ".", " ", "#"},
            {"#", " ", "$", "$", " ", " ", "#"},
            {"#", "#", " ", " ", " ", "#", "#"},
            {"#", "#", "#", "#", "#", "#"},},
        {//nivel20
            {"#", "#", "#", "#", "#"},
            {"#", ".", "$", ".", "#", "#", "#"},
            {"#", ".", " ", ".", " ", "O", "#"},
            {"#", " ", " ", "$", " ", " ", "#"},
            {"#", "#", " ", "#", " ", "#", "#"},
            {"#", " ", "$", "$", " ", "#"},
            {"#", " ", " ", " ", " ", "#"},
            {"E", "@", " ", "#", "#", "#"},
            {"#", "#", "#", "#"},},
        {//nivel21
            {"#", "#", "#", "#", "#", "#", "#"},
            {"#", "$", ".", "*", " ", " ", "#"},
            {"#", " ", " ", " ", "$", " ", "#"},
            {"#", "O", " ", " ", " ", "#", "#"},
            {"E", "@", "$", ".", "#"},
            {"#", " ", " ", ".", "#"},
            {"#", "#", "#", "#", "#"},},
        {//nivel22
            {"#", "#", "#", "#", "#"},
            {"E", "@", " ", " ", "#"},
            {"#", "#", " ", " ", "#", "#", "#"},
            {"#", " ", "$", " ", " ", "#", "#"},
            {"#", " ", "$", " ", " ", " ", "#"},
            {"#", " ", ".", " ", ".", "O", "#"},
            {"#", "#", "#", "#", "#", "#", "#"},},
        {//nivel23
            {"#", "#", "#", "#","#"},
            {"#", "O", " ", " ", "#", "#"},
            {"#", " ", " ", "$", " ", "#"},
            {"#", "#", ".", ".", "$", " ", "#"},
            {"#", " ", " ", " ", " ", " ", "#"},
            {"#", "@", " ", " ", "#", "#", "#"},
            {"#", "E", "#", "#", "#"},},
        {//nivel24
            {"#", "#", "#", "#", "#"},
            {"#", "O", " ", " ", "#"},
            {"#", " ", " ", "$", "#"},
            {"#", "#", " ", "$", " ", "#"},
            {"#", " ", ".", ".", " ", "#"},
            {"#", ".", " ", "$", " ", "#"},
            {"#", " ", "@", "#", "#", "#"},
            {"#", "#", "E", "#"},},
        {//nivel25
            {"#", "#", "#", "#", "#", "#"},
            {"#", "O", " ", " ", ".", "#"},
            {"#", " ", "#", "#", " ", "#", "#"},
            {"E", "@", " ", "$", "$", " ", "#"},
            {"#", " ", "#", " ", " ", " ", "#"},
            {"#", ".", " ", " ", "#", "#", "#"},
            {"#", "#", "#", "#", "#"},},
        { //nivel26
            {"#", "#", "#", "#", "#"},
            {"E", "@", " ", " ", "#"},
            {"#", " ", " ", " ", "#"},
            {"#", " ", "$", "$", "#", "#", "#"},
            {"#", "#", ".", " ", ".", "O", "#"},
            {"#", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#"},},
        { //nivel27
            {"#", "#", "#", "#", "#"},
            {"#", "O", " ", " ", "#", "#"},
            {"#", " ", " ", " ", " ", "#"},
            {"E", "@", " ", " ", " ", "#", "#", "#", "#", "#"},
            {"#", "#", " ", " ", " ", " ", " ", "#", ".", "#"},
            {"#", " ", "$", " ", "$", " ", " ", " ", " ", "#"},
            {"#", " ", "#", "#", "#", "#", "#", "#", ".", "#"},
            {"#", " ", " ", " ", " ", " ", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},},
        { //nivel28
            {"#", "E", "#", "#"},
            {"#", "@", " ", "#", "#", "#"},
            {"#", " ", "$", "$", " ", "#"},
            {"#", ".", ".", ".", " ", "#"},
            {"#", " ", " ", "$", " ", "#"},
            {"#", "O", " ", " ", "#", "#"},
            {"#", "#", "#", "#", "#"},},
        { //nivel29
            {"#", "#", "#", "#"},
            {"#", "#", " ", " ", "#"},
            {"#", "#", " ", "$", ".", "E", "#"},
            {"#", " ", "$", "$", " ", "@", "#"},
            {"#", " ", ".", " ", ".", "O", "#"},
            {"#", "#", "#", " ", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#"},},
        { //nivel30
            {"#", "#", "#", "#"},
            {"#", "O", " ", ".", "#", "E", "#"},
            {"#", " ", " ", " ", " ", "@", "#"},
            {"#", ".", "$", "*", "$", " ", "#"},
            {"#", " ", " ", " ", "#", "#", "#"},
            {"#", "#", " ", " ", "#"},
            {"#", "#", "#", "#"},},
        {
            //nivel31
            {"#", "#", "#", "#", "#", "E", "#"},
            {"#", "O", ".", "#", " ", "@", "#"},
            {"#", " ", " ", "$", " ", " ", "#"},
            {"#", ".", " ", "$", " ", " ", "#"},
            {"#", " ", " ", "$", " ", " ", "#"},
            {"#", " ", ".", "#", " ", " ", "#"},
            {"#", "#", "#", "#", "#", "#", "#"},}};

}

