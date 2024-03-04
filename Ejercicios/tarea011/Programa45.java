package tarea011;

import java.util.Scanner;

public class Programa45 {

	public static void main(String[] args)
	{
		int num;
		boolean multiplo_3;
		
		Scanner Entrada = new Scanner (System.in);
		multiplo_3=false;
		for (int i=0; i<5; i++)
		{
			System.out.println ("Introduzca número: ");
			num = Entrada.nextInt();
			
			if (num%3==0)
			{
				multiplo_3=true;
			}
		}
		if (multiplo_3==false)
		{
			System.out.println ("No existen multiplos de 3");
		}
		else
		{
			System.out.println ("Hay multiplos de 3");
		}
	}

}
