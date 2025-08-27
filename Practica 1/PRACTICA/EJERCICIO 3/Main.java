package estadistica;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        // Lectura de los 10 números
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        // Crear un objeto de EstadisticasPOO
        Estadistica estadisticas = new Estadistica(numeros);
        // Calcular el promedio y la desviación estándar
        double prom = estadisticas.promedio();
        double desv = estadisticas.desviacion();
        // Mostrar los resultados
        System.out.printf("El promedio es: %.2f\n", prom);
        System.out.printf("La desviacion estandar es: %.5f\n", desv);

    }   
}