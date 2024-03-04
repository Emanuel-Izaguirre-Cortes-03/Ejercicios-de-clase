package tarea011;

import java.util.Scanner;

public class Programa49 {

	public static void main(String[] args)
	{
		int n;
		int fila, col;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Lado del cuadrado: ");
		n= Entrada.nextInt();
		for (fila=1; fila<=n; fila++)
		{
			for(col=1; col<=n; col++)
			{
				System.out.println(" x ");
			}
			System.out.println("");
		}
	}

}
