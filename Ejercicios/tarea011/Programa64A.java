package tarea011;

import java.util.Scanner;

public class Programa64A {

	public static void main(String[] args)
	{
		int t[];
		int cont_par, par[];
		int cont_impar, impar[];
		
		t = new int [10];
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			t[i] = Entrada.nextInt();
		}
		cont_par=0;
		cont_impar=0;
		for (int i=0; i<10; i++)
		{
			if (t[i]%2==0)
			{
				cont_par++;
			}
			else
			{
				cont_impar++;
			}
		}
		par = new int [cont_par];
		impar = new int [cont_impar];
		cont_par=0;
		cont_impar=0;
		for (int i=0; i<10; i++)
		{
			if (t[i]%2==0)
			{
				par[cont_par]=t[i];
				cont_par++;
			}
			else
			{
				impar[cont_impar]=t[i];
				cont_impar++;
			}
		}
		System.out.println ("\n\nTabla par: ");
		for (int i=0; i<cont_par; i++)
		{
			System.out.println (par[i]);
		}
		System.out.println ("Tabla impar: ");
		for (int i=0; i<cont_impar; i++)
		{
			System.out.println (impar[i]);
		}
	}

}
