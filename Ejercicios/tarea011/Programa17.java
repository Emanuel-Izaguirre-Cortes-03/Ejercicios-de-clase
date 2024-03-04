package tarea011;

import java.util.Scanner;

public class Programa17 {

	public static void main(String[] args)
	{
		int dia, mes, año;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce dia: ");
		dia = Entrada.nextInt();
		System.out.println ("Introduce mes: ");
		mes = Entrada.nextInt();
		System.out.println ("Introduce año: ");
		año = Entrada.nextInt();
		dia++;
		if (dia>=30)
		{
			dia=1;
			mes++;
			if (mes>=12)
			{
				mes=1;
				año++;
			}
		}
		if (año==0)
		{
			año=1;
		}
		System.out.println (dia + "/" + mes + "/" + año);
		
	}

}
