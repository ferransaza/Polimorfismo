package edu.upc.eetac.dsa;

public class Circulo extends Figura
{
    double radio;

    public Circulo(double r) { this.radio = r; }

    @Override
    public double Area() { return Math.PI*this.radio*this.radio; }
}
