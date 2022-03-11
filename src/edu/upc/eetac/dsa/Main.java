package edu.upc.eetac.dsa;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Figura[] f = new Figura[4];

        f[0] = new Circulo(5);
        f[1] = new Cuadrado(10);
        f[2] = new Rectangulo(7,7);
        f[3] = new Triangulo(3,3);

        printArray(f);
        
        Arrays.sort(f);
        
        printArray(f);
        
        double sum = 0;
        for(i = 0; i < 4; i++) 
        {
	        sum = f[i].Area() + sum;
            i++;
        }
        System.out.println("El área es de " + sumaAreas(v));
    }
}
