package tarea011;

import java.util.Scanner;

public class Programa29 {
	
	public static void main(String[] args)
	{
		int num, suma, elementos;
		float media;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca un número: ");
		num = Entrada.nextInt();
		suma=0;
		elementos=0;
		
		while (num>=0)
		{
			suma+=num;
			elementos++;
			System.out.println ("Introduzca otro número: ");
			num = Entrada.nextInt();
		}
		if (elementos==0)
		{
			System.out.println ("Imposible hacer la media");
		}
		else
		{
			media=(float)suma/elementos;
			System.out.println ("La media es: " +  media);
		}
		
	}
	
}
