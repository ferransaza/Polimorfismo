package edu.upc.eetac.dsa;

public abstract class Comparador implements Comparable<Comparador>
{
    public abstract double Area();

    @Override
    public int compareTo(Comparador f) { return (int)(f.Area() - this.Area()); }
}
