public class Aplicacion {
    public static void main(String[] args) {
        // Juego normal
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        juego1.juega();

        // Juego par
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        juego2.juega();

        // Juego impar
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        juego3.juega();
    }
}
