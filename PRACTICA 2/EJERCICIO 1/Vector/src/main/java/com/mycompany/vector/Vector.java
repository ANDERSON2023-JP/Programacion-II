package com.mycompany.vector;

public class Vector {
    private double x, y, z;

    // Constructor
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Métodos básicos
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double dot(Vector b) {
        return this.x*b.x + this.y*b.y + this.z*b.z;
    }

    public Vector cross(Vector b) {
        return new Vector(
            this.y*b.z - this.z*b.y,
            this.z*b.x - this.x*b.z,
            this.x*b.y - this.y*b.x
        );
    }

    public Vector add(Vector b) {
        return new Vector(this.x+b.x, this.y+b.y, this.z+b.z);
    }

    public Vector subtract(Vector b) {
        return new Vector(this.x-b.x, this.y-b.y, this.z-b.z);
    }

    public Vector escalar(double k) {
        return new Vector(k*this.x, k*this.y, k*this.z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
         Vector a = new Vector(2, 3, 0);
        Vector b = new Vector(-3, 2, 0);

        AlgebraVectorial algebra = new AlgebraVectorial();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a*b=0 (perpendicular)? " + algebra.esPerpendicular(a, b, 0.0));
        System.out.println("axb=0 (paralelo)? " + algebra.esParalelo(a, b, true));
        System.out.println("Proyeccion de a sobre b = " + algebra.proyeccion(a, b));
        System.out.println("Componente de a en direccion de b = " + algebra.componente(a, b));
    }
}