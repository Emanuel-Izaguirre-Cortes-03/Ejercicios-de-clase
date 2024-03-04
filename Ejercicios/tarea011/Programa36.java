package tarea011;

import java.util.Scanner;

public class Programa36 {

	public static void main(String[] args)
	{
		int sueldo, suma, mayor_1000;
		
		Scanner Entrada = new Scanner (System.in);
		
		suma=0;
		mayor_1000=0;
		for (int i=1; i<10; i++)
		{
			System.out.println ("Escribir un sueldo: ");
			sueldo = Entrada.nextInt();
			if (sueldo>1000)
			{
				mayor_1000++;
				suma=suma+sueldo;
			}
		}
		System.out.println ("Mayores de 1000 hay: " + mayor_1000);
		System.out.println ("la suma es de: " + suma);
	}

}
