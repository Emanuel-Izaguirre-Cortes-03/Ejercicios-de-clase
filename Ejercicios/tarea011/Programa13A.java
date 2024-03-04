package tarea011;

import java.util.Scanner;

public class Programa13A {

	public static void main(String[] args)
	{
		int num;
		int dm, um, c, d, u;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce un número: ");
		num = Entrada.nextInt();
		
		// unidad
		u = num%10;
		num = num/10;
		
		// decenas
		d = num%10;
		num = num/10;
		
		// centenas
		c = num%10;
		num = num/10;
		
		// unidades de millar
		um = num%10;
		num = num/10;
				
		// decenas de millar
		dm = num;
		
		if (dm==u && um == d)
		{
			System.out.println("El número es Capicua");
		}
		else 
		{
			System.out.println("El número No es Capicua");
		}
	}

}
