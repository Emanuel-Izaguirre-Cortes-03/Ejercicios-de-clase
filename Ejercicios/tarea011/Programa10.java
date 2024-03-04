package tarea011;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) 
	{
		int a, b, c;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce primer número: ");
		a = Entrada.nextInt();
		System.out.println ("Introduce segundo número: ");
		b = Entrada.nextInt();
		System.out.println ("Introduce tercero número: ");
		c = Entrada.nextInt();
		
		if (a>b  && b>c)
		{
			System.out.println (a + " , " + b + " , " + c);
		}
		else
		{
			if (a>c && c>b)
			{
				System.out.println (a + " , " + c + " , " + b);
			}
			else
			{
				if (b>a && a>c)
				{
					System.out.println (b + " , " + a + " , " + c);
				}
				else
				{
					if (b>c && c>a)
					{
						System.out.println (b + " , " + c + " , " + a);
					}
					else
					{
						if (c>a && a>b)
						{
							System.out.println (c + " , " + a + " , " + b);
						}
						else
						{
							if (c>b && b>a)
							{
								System.out.println (c + " , " + b + " , " + a);
							}
						}
					}
				}
			}
		}
	}

}
