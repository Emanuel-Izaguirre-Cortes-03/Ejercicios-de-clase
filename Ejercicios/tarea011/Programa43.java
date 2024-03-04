package tarea011;

import java.util.Scanner;

public class Programa43 {

	public static void main(String[] args)
	{
		int num;
		boolean hay_negativo;
		
		Scanner Entrada = new Scanner (System.in);
		hay_negativo=false;
		for (int i=1; i<=10; i++)
		{
			System.out.println ("Introduce número: ");
			num = Entrada.nextInt();
			
			if (num<=0)
			{
				hay_negativo=true;
			}
		}
		if (hay_negativo==true)
		{
			System.out.println ("Se ha introducido algún número negativo");
		}
		else
		{
			System.out.println ("No hay ningún número negativo");
		}
	}

}
