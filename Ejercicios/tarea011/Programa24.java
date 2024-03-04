package tarea011;

import java.util.Scanner;

public class Programa24 {

	public static void main(String[] args)
	{
		int num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca un número: ");
		num = Entrada.nextInt();
		
		while (num!=0)
		{
			if (num>0)
			{
				System.out.println ("Positivo");
			}
			else
			{
				System.out.println ("Negativo");
			}
			System.out.println ("Introduzca otro número: ");
			num = Entrada.nextInt();
		}
	}

}
