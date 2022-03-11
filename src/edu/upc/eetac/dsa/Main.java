package edu.upc.eetac.dsa;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Figura[] f = new Figura[4];

        f[0] = new Circulo(5); //78,5375
        f[1] = new Cuadrado(10); //100
        f[2] = new Rectangulo(8,7); //56
        f[3] = new Triangulo(3,3); //4,5

        System.out.println("Primero tenemos: " + Arrays.toString(f));

        Arrays.sort(f);

        System.out.println("Ordenamos y nos queda: " + Arrays.toString(f));

        double sum = 0;
        for(int i = 0; i < 4; i++) { sum = f[i].Area() + sum; }

        System.out.println("El área es de " + sum);
    }
}
