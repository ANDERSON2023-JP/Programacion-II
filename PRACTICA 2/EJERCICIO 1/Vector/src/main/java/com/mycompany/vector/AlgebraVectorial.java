package com.mycompany.vector;
public class AlgebraVectorial {

    // a) Perpendicularidad: |a+b| = |a-b|
    public boolean esPerpendicular(Vector a, Vector b) {
        return Math.abs(a.add(b).magnitud() - a.subtract(b).magnitud()) < 1e-6;
    }

    // b) Perpendicularidad mutua: |a-b| = |b-a|
    public boolean esPerpendicular(Vector a, Vector b, int tipo) {
        return Math.abs(a.subtract(b).magnitud() - b.subtract(a).magnitud()) < 1e-6;
    }

    // c) Perpendicularidad: a·b = 0
    public boolean esPerpendicular(Vector a, Vector b, double usarDot) {
        return Math.abs(a.dot(b)) < 1e-6;
    }

    // d) Perpendicularidad: |a+b|² = |a|² + |b|²
    public boolean esPerpendicular(Vector a, Vector b, boolean usarNorma) {
        double izq = Math.pow(a.add(b).magnitud(), 2);
        double der = Math.pow(a.magnitud(), 2) + Math.pow(b.magnitud(), 2);
        return Math.abs(izq - der) < 1e-6;
    }

    // e) Paralelismo: a = r·b
    public boolean esParalelo(Vector a, Vector b) {
        Vector cross = a.cross(b);
        return cross.magnitud() < 1e-6;
    }

    // f) Paralelismo: a×b = 0
    public boolean esParalelo(Vector a, Vector b, boolean usarCruz) {
        return a.cross(b).magnitud() < 1e-6;
    }

    // g) Proyección de a sobre b
    public static Vector proyeccion(Vector a, Vector b) {
        double dot = a.dot(b);
        double magB2 = b.magnitud() * b.magnitud();
        return b.escalar(dot / magB2); // b multiplicado por el escalar
}

    // h) Componente de a en dirección de b
    public static double componente(Vector a, Vector b) {
        return a.dot(b) / b.magnitud();
    }
}
