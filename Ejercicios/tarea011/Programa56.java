package tarea011;

import java.util.Scanner;

public class Programa56 {

	public static void main(String[] args)
	{
		int a[], b[], c[];
		int i, j;
		
		Scanner Entrada = new Scanner (System.in);
		a = new int [10];
		b = new int [10];
		c = new int [20];
		
		System.out.println ("Leyendo la tabla a");
		for (i=0; i<10; i++)
		{
			System.out.println ("número: ");
			a[i] = Entrada.nextInt();
		}
		System.out.println ("Leyendo la tabla b");
		for (i=0; i<10; i++)
		{
			System.out.println ("número: ");
			b[i] = Entrada.nextInt();
		}
		j=0;
		for (i=0; i<10; i++)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		System.out.println ("La tabla c queda");
		for (j=0; j<=20; j++)
		{
			System.out.println (c[j] + " ");
		}
		System.out.println ("");
	}

}
