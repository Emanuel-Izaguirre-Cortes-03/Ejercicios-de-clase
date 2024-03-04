package tarea011;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args)
	{
		int num;
		
		Scanner Entrada = new Scanner (System.in);
		do {
			System.out.println ("Introduce un número: ");
			num = Entrada.nextInt();
		} while (!(0<=num && num<=10));
		System.out.println ("\n\nTabla del " + num);
		for (int i=1; i<=10; i++)
		{
			System.out.println (num + " x " + i + " = " + num*i);
		}
		
	}

}
