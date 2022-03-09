package edu.upc.eetac.dsa;

public abstract class Figura implements Comparable<Figura>
{
    public abstract double Area();

    @Override
    public int compareTo(Figura f) { return (int)(f.Area() - this.Area()); }
}
