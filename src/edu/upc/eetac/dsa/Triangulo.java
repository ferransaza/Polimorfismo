package edu.upc.eetac.dsa;

public class Triangulo extends Figura
{
    double x, y;

    public Rectangulo(double base, double altura) { this.x = base; this.y = altura; }

    @Override
    public double Area() { return (x*y)/2; }
}