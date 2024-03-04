package tarea011;

import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args)
	{
		int n1, n2;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número: ");
		n1 = Entrada.nextInt();
		System.out.println ("Introduce otro número: ");
		n2 = Entrada.nextInt();
		
		if (n1 == n2)
		{
			System.out.println ("Son iguales");
		}
		else
		{
			if (n1 > n2)
			{
				System.out.println (n1 + " es mayor que " + n2);
			}
			else
			{
				System.out.println (n2 + " es mayor que " + n1);
			}
		}
	}

}
