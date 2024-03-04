package tarea011;

import java.util.Scanner;

public class Programa61A {

	public static void main(String[] args)
	{
		int t[] = new int [10];
		int ultimo;
		int n;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("Posiciones a desplazar: ");
		n = Entrada.nextInt();
		for (int vueltas=1; vueltas<=n; vueltas++)
		{
			ultimo=t[9];
			for (int i=8; i>=0; i--)
			{
				t[i+1]=t[i];
			}
			t[0]=ultimo;
		}
		System.out.println ("La tabla queda: ");
		for (int i=0; i<10; i++)
		{
			System.out.println (t[i]);
		}
	}

}
