package tarea011;

import java.util.Scanner;

public class Programa44 {

	public static void main(String[] args)
	{
		int notas;
		boolean suspensos;
		
		Scanner Entrada = new Scanner (System.in);
		suspensos=false;
		for (int i=0; i<5; i++)
		{
			System.out.println ("Introduce nota (de 0 a 10): ");
			notas = Entrada.nextInt();
			
			if (notas<5)
			{
				suspensos=true;
			}
		}
		if (suspensos)
		{
			System.out.println ("Hay alumnos suspensos");
		}
		else
		{
			System.out.println ("No hay suspensos");
		}
	}

}
