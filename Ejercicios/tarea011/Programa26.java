package tarea011;

import java.util.Scanner;

public class Programa26 {

	public static void main(String[] args)
	{
		int num, contador;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca un número: ");
		num = Entrada.nextInt();
		contador=0;
		
		while (num>0)
		{
			contador = contador+1;
			System.out.println ("Introduzca otro número: ");
			num = Entrada.nextInt();
		}
		System.out.println ("Se ha introducido: " + contador + " números");
	}

}
