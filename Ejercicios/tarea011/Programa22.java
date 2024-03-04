package tarea011;

import java.util.Scanner;

public class Programa22 {

	public static void main(String[] args)
	{
		int num;
		int unidades, decenas;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca un número (0 a 99): ");
		num = Entrada.nextInt();
		
		unidades = num % 10;
		decenas = num / 10;
		
		switch (decenas)
		{
			case 0: System.out.println ("");
			break;
			case 1: System.out.println ("diez");
			break;
			case 2: System.out.println ("veinte");
			break;
			case 3: System.out.println ("treinta");
			break;
			case 4: System.out.println ("cuarenta");
			break;
			case 5: System.out.println ("cincuenta");
			break;
			case 6: System.out.println ("sesenta");
			break;
			case 7: System.out.println ("setenta");
			break;
			case 8: System.out.println ("ochenta");
			break;
			case 9: System.out.println ("novemta");
			break;
		}
		
		System.out.println (" y ");
		
		switch (unidades)
		{
			case 0: System.out.println ("");
			break;
			case 1: System.out.println ("uno");
			break;
			case 2: System.out.println ("dos");
			break;
			case 3: System.out.println ("tres");
			break;
			case 4: System.out.println ("cuatro");
			break;
			case 5: System.out.println ("cinco");
			break;
			case 6: System.out.println ("seis");
			break;
			case 7: System.out.println ("siete");
			break;
			case 8: System.out.println ("ocho");
			break;
			case 9: System.out.println ("nueve");
			break;
		}
	}

}
