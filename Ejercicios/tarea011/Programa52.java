package tarea011;

import java.util.Scanner;

public class Programa52 {

	public static void main(String[] args)
	{
		int t[];
		
		t = new int[5];
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<5; i++)
		{
			System.out.println ("Introduce número: ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("Los números son: ");
		for (int i=0; i<5; i++)
		{
			System.out.println (t[i]);
		}
	}

}
