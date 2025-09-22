package com.mycompany.vector3d;
public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public Vector3D suma(Vector3D b) {
        return new Vector3D(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    public Vector3D escalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector3D normalizar() {
        double mag = magnitud();
        if (mag == 0) return new Vector3D(0,0,0);
        return new Vector3D(x/mag, y/mag, z/mag);
    }

    public double dot(Vector3D b) {
        return this.x*b.x + this.y*b.y + this.z*b.z;
    }

    public Vector3D cross(Vector3D b) {
        return new Vector3D(
            this.y*b.z - this.z*b.y,
            this.z*b.x - this.x*b.z,
            this.x*b.y - this.y*b.x
        );
    }

    public Vector3D proyeccion(Vector3D b) {
        double factor = this.dot(b) / (b.magnitud() * b.magnitud());
        return b.escalar(factor);
    }

    public double componente(Vector3D b) {
        return this.dot(b) / b.magnitud();
    }

    public boolean esPerpendicular(Vector3D b) {
        return this.dot(b) == 0;
    }

    public boolean esParalelo(Vector3D b) {
        return this.cross(b).magnitud() == 0;
    }
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 0);
        Vector3D b = new Vector3D(2, 0, 0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Suma: " + a.suma(b));
        System.out.println("Escalar (3*a): " + a.escalar(3));
        System.out.println("Longitud de a: " + a.magnitud());
        System.out.println("Normal de a: " + a.normalizar());
        System.out.println("Producto escalar (a*b): " + a.dot(b));
        System.out.println("Producto vectorial (axb): " + a.cross(b));
        System.out.println("a _|_ b? " + a.esPerpendicular(b));
        System.out.println("a || b? " + a.esParalelo(b));
        System.out.println("Proyeccion de a sobre b: " + a.proyeccion(b));
        System.out.println("Componente de a en direccion de b: " + a.componente(b));
    }
}
