import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego{
     private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // número entre 0 y 10
        Scanner sc = new Scanner(System.in);
        System.out.println(" Adivina un numero entre 0 y 10");
        while (true) {
            System.out.print(" Ingresa tu numero: ");
            int intento = sc.nextInt();
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) {
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero es mayor. Intenta de nuevo.");
                    } else {
                        System.out.println("El numero es menor. Intenta de nuevo.");
                    }
                }
            }
        }
    }
}
