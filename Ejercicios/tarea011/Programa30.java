package tarea011;

import java.util.Scanner;

public class Programa30 {

	public static void main(String[] args)
	{
		int i, num;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número: ");
		num = Entrada.nextInt();
		i=1;
		while (i<=num)
		{
			System.out.println (i);
			i++;
		}
	}

}
