package tarea011;

import java.util.Scanner;

public class Programa61B {

	public static void main(String[] args)
	{
		int t[] = new int [10];
		int n;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("Posiciones a desplazar: ");
		n = Entrada.nextInt();
		int copia[]=t.clone();
		for (int i=0; i<10; i++)
		{
			t[i]=copia[(i+n)%10];
		}
		System.out.println ("\n\nLa tabla queda: ");
		for (int i=0; i<10; i++)
		{
			System.out.println (t[i]);
		}
	}

}
