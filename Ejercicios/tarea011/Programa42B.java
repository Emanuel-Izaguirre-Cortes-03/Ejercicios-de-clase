package tarea011;

import java.util.Scanner;

public class Programa42B {

	public static void main(String[] args)
	{
		int sueldo, sueldo_max=0;
		int n;
		boolean primer_sueldo_asignado=false;
		
		sueldo_max=0;
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Número de sueldos: ");
		n = Entrada.nextInt();
		System.out.println ("--------");
		for (int i=1; i<=n; i++)
		{
			System.out.println ("Introduce sueldo: ");
			sueldo = Entrada.nextInt();
			
			if (primer_sueldo_asignado==false)
			{
				sueldo_max=sueldo;
				primer_sueldo_asignado=true;
			}
			if (sueldo>sueldo_max)
			{
				sueldo_max=sueldo;
			}
		}
		System.out.println ("\nEl sueldo máximo es: " + sueldo_max);
	}

}
