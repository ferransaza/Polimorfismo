package edu.upc.eetac.dsa;

public abstract class Figura implements Comparable<Figura>
{
    public abstract double Area();

    @Override
    public int compareTo(Figura a) { return (int)(this.area() - a.area()); }
}
