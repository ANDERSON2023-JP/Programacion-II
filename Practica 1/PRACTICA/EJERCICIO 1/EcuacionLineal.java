package ecuacionlineal;
public class EcuacionLineal {
     private double a, b, c, d, e, f;

    // Constructor
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    // Verifica si el sistema tiene solución 
    public boolean tieneSolucion() { 
        return (a * d - b * c) != 0; 
    }
    // Retorna la solución para X 
    public double getX() { 
        return (e * d - b * f) / (a * d - b * c); 
    }
    // Retorna la solución para Y 
    public double getY() {
        return (a * f - e * c) / (a * d - b * c); 
    }
    
}