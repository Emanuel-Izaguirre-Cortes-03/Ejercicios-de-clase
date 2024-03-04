package tarea011;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args)
	{
		int num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número: ");
		num = Entrada.nextInt();
		
		if (num < 0)
		{
			System.out.println ("Negativo");
		}
		else
		{
			System.out.println ("Positivo");
		}
	}

}
