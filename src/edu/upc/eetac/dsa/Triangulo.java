package edu.upc.eetac.dsa;

public class Triangulo extends Figura
{
    private double x, y;

    public Triangulo(double base, double altura) { this.x = base; this.y = altura; }

    @Override
    public double Area() { return (x*y)/2; }
}