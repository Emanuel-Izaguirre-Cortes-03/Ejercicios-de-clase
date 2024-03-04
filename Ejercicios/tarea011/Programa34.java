package tarea011;

import java.util.Scanner;

public class Programa34 {

	public static void main(String[] args)
	{
		double factorial;
		int num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número: ");
		num = Entrada.nextInt();
		
		factorial=1;
		for (int i=num; i>0; i--)
		{
			factorial=factorial*i;
		}
		System.out.println ("El factorial de " + num + " es: " + factorial);
	}

}
