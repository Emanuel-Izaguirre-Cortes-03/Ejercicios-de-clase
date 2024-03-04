package tarea011;

import java.util.Scanner;

public class Programa15 {

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
		
		if (dia>=1 && dia<=30)
		{
			if (mes>=1 && mes<=12)
			{
				if (año!=0)
				{
					System.out.println ("fecha correcta");
				}
				else
				{
					System.out.println ("año incorecto");
				}
			}
			else
			{
				System.out.println ("mes incorecto");
			}
		}
		else
		{
			System.out.println ("dia incorecto");
		}
	}

}
