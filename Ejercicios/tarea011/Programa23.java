package tarea011;

import java.util.Scanner;

public class Programa23 {

	public static void main(String[] args)
	{
		int num, cuadrado;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca un número: ");
		num = Entrada.nextInt();
		
		while (num>=0)
		{
			cuadrado=num*num;
			System.out.println (num + " cuadrado 2 igual a "+ cuadrado);
			System.out.println ("Introduzca otro número: ");
			num = Entrada.nextInt();
		}
		
	}

}
