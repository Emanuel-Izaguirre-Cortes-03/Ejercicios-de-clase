package tarea011;

import java.util.Scanner;

public class Programa53 {

	public static void main(String[] args)
	{
		int t[] = new int [5];
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<5; i++)
		{
			System.out.println ("Introduce un número: ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("Los números (en orden inverso): ");
		for (int i=4; i>=0; i--)
		{
			System.out.println (t[i]);
		}
	}

}
