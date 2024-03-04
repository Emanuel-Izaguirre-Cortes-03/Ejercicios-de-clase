package tarea011;

import java.util.Scanner;

public class Programa32 {

	public static void main(String[] args)
	{
		int num, suma_total;
		
		suma_total=0;
		Scanner Entrada = new Scanner (System.in);
		for (int i=1; i<=15; i++)
		{
			System.out.println ("Introduzca número: ");
			num = Entrada.nextInt();
			suma_total=suma_total+num;
		}
		System.out.println ("La suma total es de " + suma_total);
		
	}

}
