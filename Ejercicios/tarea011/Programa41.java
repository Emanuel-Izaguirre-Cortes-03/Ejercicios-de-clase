package tarea011;

import java.util.Scanner;

public class Programa41 {

	public static void main(String[] args)
	{
		int nota, aprobados, suspensos, condicionados;
		
		aprobados=0;
		suspensos=0;
		condicionados=0;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=1; i<=5; i++)
		{
			System.out.println ("Introduzca nota entre 0 y 10: ");
			nota = Entrada.nextInt();
			
			if (nota==4)
			{
				condicionados++;
			}
			else
			{
				if (nota>=5)
				{
					aprobados++;
				}
				else
				{
					if (nota<4)
					{
						suspensos++;
					}
				}
			}
		}
		System.out.println ("Aprobados: " + aprobados);
		System.out.println ("Suspensos: "+ suspensos);
		System.out.println ("Condicionados: " + condicionados);
	}

}
