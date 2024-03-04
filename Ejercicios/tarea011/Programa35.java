package tarea011;

import java.util.Scanner;

public class Programa35 {

	public static void main(String[] args)
	{
		int num;
		int cont_ceros;
		int cont_pos;
		int cont_neg;
		int suma_pos;
		int suma_neg;
		float media_pos, media_neg;
		
		cont_ceros=0;
		cont_pos=0;
		cont_neg=0;
		suma_pos=0;
		suma_neg=0;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=1; i<=10; i++)
		{
			System.out.println ("Introduzca número: ");
			num = Entrada.nextInt();
			if (num==0)
			{
				cont_ceros++;
				if (num>0)
				{
					cont_pos++;
					suma_pos+=num;
				}
				else
				{
					cont_neg++;
					suma_neg=num;
				}
			}
		}
		System.out.println ("El número de los ceros introducidos es de: " + cont_ceros);
		if (cont_pos==0)
		{
			System.out.println ("No se puede hacer la media de los positivos");
		}
		else
		{
			media_pos=(float)suma_pos/cont_pos;
			System.out.println ("Media de los positivos: " + media_pos);
		}
		if (cont_pos==0)
		{
			System.out.println ("No se puede hacer la media de los negativos");
		}
		else
		{
			media_neg=(float)suma_neg/cont_neg;
			System.out.println ("Media de los positivos: " + media_neg);
		}
		
	}

}
