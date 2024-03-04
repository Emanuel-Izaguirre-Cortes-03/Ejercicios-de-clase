package tarea011;

import java.util.Scanner;

public class Programa13B {
	
	public static void main(String[] args)
	{
		int num;
		int dm, um, c, d, u;
		
		Scanner Entrada = new Scanner (System.in);
		boolean capicua = false;
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
		
		if (dm==0 && um==d)
		{
			capicua=true;
		}
		if (dm==0 && um==u && c==u)
		{
			capicua=true;
		}
		if (dm==0 && um==0 && c==u)
		{
			capicua=true;
		}
		if (dm==0 && um==0 && c==0 && d==u)
		{
			capicua=true;
		}
		if (capicua)
		{
			System.out.println("El número es Capicua");
		}
		else 
		{
			System.out.println("El número No es Capicua");
		}
		
	}
}
