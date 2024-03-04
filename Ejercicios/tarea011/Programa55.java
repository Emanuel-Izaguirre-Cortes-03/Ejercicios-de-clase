package tarea011;

import java.util.Scanner;

public class Programa55 {

	public static void main(String[] args)
	{
		int i, t[];
		
		t = new int [10];
		Scanner Entrada = new Scanner (System.in);
		for (i=0; i<10; i++)
		{
			System.out.println ("Introduzca número: ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("El resultado es: ");
		for (i=0; i<=4; i++)
		{
			System.out.println (t[i]);
			System.out.println (t[9-i]);
		}
	}

}
