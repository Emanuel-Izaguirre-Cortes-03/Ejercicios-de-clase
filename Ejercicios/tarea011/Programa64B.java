package tarea011;

import java.util.Scanner;

public class Programa64B {

	public static void main(String[] args)
	{
		int t[];
		int par[];
		int impar[];
		
		t = new int [10];
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			t[i] = Entrada.nextInt();
		}
		par = new int [5];
		impar = new int [5];
		for (int i=0; i<10; i+=2)
		{
			par[i/2]=t[i];
		}
		for (int i=1; i<10; i+=2)
		{
			impar[i/2]=t[i];
		}
		System.out.println ("\n\nTabla par: ");
		for (int i=0; i<5; i++)
		{
			System.out.println (par[i]);
		}
		System.out.println ("Tabla impar: ");
		for (int i=0; i<5; i++)
		{
			System.out.println (impar[i]);
		}
	}

}
