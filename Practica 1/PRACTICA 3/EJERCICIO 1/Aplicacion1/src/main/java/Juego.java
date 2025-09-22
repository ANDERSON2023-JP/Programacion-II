public class Juego {
    protected int numeroDeVidas;
    protected int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println(" Reiniciando partida...");
    }
    public void actualizaRecord() {
        if (numeroDeVidas > record) {
                        record = numeroDeVidas;
            System.out.println("Nuevo record: " + record);
        }
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println(" Te equivocaste. Te quedan " + numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("Te quedaste sin vidas.");
            return false;
        }
    }    
}
