package edu.upc.eetac.dsa;

public class Cuadrado extends Comparador
{
    private double lado;

    public Cuadrado(double l) { this.lado = l; }

    @Override
    public double Area() { return lado*lado; }
}
