package tarea011;

import java.util.Scanner;

public class Programa66 {

	public static void main(String[] args){
		int t[] = new int [10];
		int num, j;
		
		Scanner Entrada = new Scanner (System.in);
		
		for (int i=0; i<10; i++)
		{
			System.out.println ("Introduzca número (orden creciente): ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("Introduzca número a buscar: ");
		num = Entrada.nextInt();
		j=0;
		while (j<10 && t[j]<num)
		{
			j++;
		}
		if (j==10)
		{
			System.out.println ("No encontrado");
		}
		else
		{
			if (t[j]==num)
			{
				System.out.println ("Encontrado en la posicion " + j);
			}
			else
			{
				System.out.println ("No encontrado");
			}
		}
	}

}
