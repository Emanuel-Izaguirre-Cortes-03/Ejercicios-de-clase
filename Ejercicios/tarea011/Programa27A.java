package tarea011;

import java.util.Scanner;

public class Programa27A {

	public static void main(String[] args)
	{
		int n, num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce N: ");
		n = Entrada.nextInt();
		System.out.println ("Introduce un número: ");
		num = Entrada.nextInt();
		
		while (num!=n)
		{
			if (num>n)
			{
				System.out.println ("menor");
			}
			else
			{
				System.out.println ("mayor");
			}
			System.out.println ("Introduce número: ");
			num = Entrada.nextInt();
		}
		
		System.out.println ("acertaste...");
	}

}
