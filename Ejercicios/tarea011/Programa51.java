package tarea011;

import java.util.Scanner;

public class Programa51 {

	public static void main(String[] args)
	{
		int  i, j, num, cont_pri;
		boolean primo;
		
		cont_pri=0;
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce número: ");
		num = Entrada.nextInt();
		
		for (i=1; i<=num; i++)
		{
			primo=true;
			j=2;
			while (j<=i-1 && primo==true)
			{
				if (i%j==0)
				{
					primo=false;
				}
				j++;
			}
			if (primo=true)
			{
				cont_pri++;
				System.out.println (i + (" es primo"));
			}
		}
		System.out.println ("En el rango 1..." + num + ", hay " + cont_pri + " números primos");
		
	}

}
