package tarea011;

import java.util.Scanner;

public class Programa58 {

	public static void main(String[] args)
	{
		int numeros[];
		int i;
		boolean creciente, decreciente;
		
		numeros = new int [10];
		creciente=false;
		decreciente=false;
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Leyendo números: ");
		for (i=0; i<10; i++)
		{
			System.out.println ("número: ");
			numeros[i] = Entrada.nextInt();
		}
		for (i=0; i<9; i++)
		{
			if (numeros[i] > numeros [i+1])
			{
				decreciente=true;
			}
			if (numeros[i] < numeros [i+1])
			{
				creciente=true;
			}
		}
		
		if (creciente==true && decreciente==false)
		{
			System.out.println ("Serie creciente");
		}
		if (creciente==false && decreciente==true)
		{
			System.out.println ("Serie decreciente");
		}
		if (creciente==true && decreciente==true)
		{
			System.out.println ("Serie desordenadas");
		}
		if (creciente==false && decreciente==false)
		{
			System.out.println ("Todos los números iguales");
		}
	}

}
