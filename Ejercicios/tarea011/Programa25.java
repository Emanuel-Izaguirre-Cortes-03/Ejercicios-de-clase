package tarea011;

import java.util.Scanner;

public class Programa25 {

	public static void main(String[] args)
	{
		int num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca un número: ");
		num = Entrada.nextInt();
		
		while (num!=0)
		{
			if (num%2==0)
			{
				System.out.println ("Par");
			}
			else
			{
				System.out.println ("Impar");
			}
			System.out.println ("Introduzca otro número: ");
			num = Entrada.nextInt();
		}
	}

}
