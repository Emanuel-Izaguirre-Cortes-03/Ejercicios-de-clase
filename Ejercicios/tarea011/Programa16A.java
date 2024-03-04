package tarea011;

import java.util.Scanner;

public class Programa16A {

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

		if (año==0)
		{
			System.out.println ("fecha incorrecta");
		}
		else
		{
			if (mes==2 && (dia>=1 && dia <= 28))
			{
				System.out.println ("fecha correcta");
			}
			else
			{
				if (mes==4 || mes==6 || mes==9 || mes==11 && (dia>=1 && dia <= 30))
				{
					System.out.println ("fecha correcta");
				}
				else
				{
					if (mes==1 || mes==3 || mes==5 || mes==7 || mes== 8 || mes==10 || mes==12 && (dia>=1 && dia <= 31))
					{
						System.out.println ("fecha correcta");
					}
					else
					{
						System.out.println ("fecha incorrecta");
					}
				}
			}
		}
	}

}
