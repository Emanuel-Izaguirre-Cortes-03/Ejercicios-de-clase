package tarea011;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args)
	{
		Scanner Entrada = new Scanner (System.in);
		double l, r; // longitud y radio
		System.out.println ("Introduce el radio de una circunferencia: ");
		r = Entrada.nextDouble();
		l = 2*Math.PI*r;
		System.out.println ("La longitud de una circuferencia de radio "+ r + " es: " + l);
	}

}
