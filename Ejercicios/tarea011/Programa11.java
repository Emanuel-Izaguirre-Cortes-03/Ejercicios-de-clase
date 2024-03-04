package tarea011;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args)
	{
		int num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número entre 0 y 9.999: ");
		num = Entrada.nextInt();
		
		if (num < 10)
		{
			System.out.println ("tiene 1 cifra");
		}
		else
		{
			if (num < 100)
			{
				System.out.println ("tiene 2 cifras");
			}
			else
			{
				if (num < 1000)
				{
					System.out.println ("tiene 3 cifras");
				}
				else
				{
					if (num < 10000)
					{
						System.out.println ("tiene 4 cifras");
					}
					else
					{
						if (num < 100000)
						{
							System.out.println ("tiene 5 cifras");
						}
					}
				}
			}
		}
		
	}

}
