package ecuacionlineall;
public class EcuacionLineall {
    private double a, b, c;

    /* Constructor */
    public EcuacionLineall(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /* Método que devuelve el discriminante */
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }
    /* Método que devuelve la primera raíz */
    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) return Double.NaN; // No tiene raíces reales
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
    /* Método que devuelve la segunda raíz */
    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) return Double.NaN; // No tiene raíces reales
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    
}