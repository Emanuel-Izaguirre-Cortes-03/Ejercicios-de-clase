package tarea011;

import java.util.Scanner;

public class Programa65 {

	public static void main(String[] args)
	{
		int a[], b[], c[];
		int i, j, k;
		
		a = new int [10];
		b = new int [10];
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Datos para a: ");
		for (i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			a[i] = Entrada.nextInt();
		}
		System.out.println ("Datos para b: ");
		for (i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			b[i] = Entrada.nextInt();
		}
		System.out.println ();
		c=new int[20];
		i=0;
		j=0;
		k=0;
		while (i<10 && j<10)
		{
			if (a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		if (i==10)
		{
			while (j<10)
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		else
		{
			while (i<10)
			{
				c[k]=a[i];
				j++;
				k++;
			}
		}
		
		System.out.println ("Mostramos la tabla c: ");
		for (k=0; k<20; k++)
		{
			System.out.println (c[k]);
		}
		System.out.println ("");
	}

}
