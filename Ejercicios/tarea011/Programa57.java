package tarea011;

import java.util.Scanner;

public class Programa57 {

	public static void main(String[] args)
	{
		int a[], b[], c[];
		int i, j;
		
		Scanner Entrada = new Scanner (System.in);
		a = new int [12];
		b = new int [12];
		c = new int [24];
		
		System.out.println ("Leyendo la tabla a");
		for (i=0; i<12; i++)
		{
			System.out.println ("número: ");
			a[i] = Entrada.nextInt();
		}
		System.out.println ("Leyendo la tabla b");
		for (i=0; i<12; i++)
		{
			System.out.println ("número: ");
			b[i] = Entrada.nextInt();
		}
		j=0;
		i=0;
		while (i<12)
		{
			for (int k=0; k<3; k++)
			{
				c[j]=a[i+k];
				j++;
			}
			for (int k=0; k<3; k++)
			{
				c[j]=b[i+k];
				j++;
			}
			i+=3;
		}
		
		System.out.println ("La tabla c queda");
		for (j=0; j<=24; j++)
		{
			System.out.println(c[j] + " ");
		}
		System.out.println ("");
	}

}
