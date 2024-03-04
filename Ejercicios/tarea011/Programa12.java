package tarea011;

import java.util.Scanner;

public class Programa12 {
	
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
		
		System.out.println(u + " " + d + " " + c + " " + um + " " + dm);
		
		num=10000*u+1000*d+100*c+10*um+dm;
		System.out.println(num);
	}
}
