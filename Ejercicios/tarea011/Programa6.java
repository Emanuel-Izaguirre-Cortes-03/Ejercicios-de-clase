package tarea011;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args)
	{
		int n1, n2;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número: ");
		n1 = Entrada.nextInt();
		System.out.println ("Introduce otro número: ");
		n2 = Entrada.nextInt();
		
		if (n1 % n2 == 0)
		{
			System.out.println ("Son multiplos");
		}
		else
		{
			System.out.println ("No son multiplos");
		}
	}

}
