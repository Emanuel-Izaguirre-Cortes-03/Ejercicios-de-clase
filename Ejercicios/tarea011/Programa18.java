package tarea011;

import java.util.Scanner;

public class Programa18 {

	public static void main(String[] args)
	{
		int dia, mes, año;
		int dias_del_mes=0;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce dia: ");
		dia = Entrada.nextInt();
		System.out.println ("Introduce mes: ");
		mes = Entrada.nextInt();
		System.out.println ("Introduce año: ");
		año = Entrada.nextInt();
		
		if (mes==2)
		{
			dias_del_mes=28;
		}
		if (mes==4 || mes==6 || mes==9 || mes==11)
		{
			dias_del_mes=30;
		}
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes== 8 || mes==10 || mes==12)
		{
			dias_del_mes=31;
		}
		dia++;
		if (dia>dias_del_mes)
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
