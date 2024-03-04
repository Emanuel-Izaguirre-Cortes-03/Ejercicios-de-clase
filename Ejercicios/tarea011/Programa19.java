package tarea011;

import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args)
	{
		int dia1, mes1, año1;
		int dia2, mes2, año2;
		int total_dias;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Fecha 1 :");
		System.out.println ("Introduuzca dia: ");
		dia1 = Entrada.nextInt();
		System.out.println ("Introduuzca mes: ");
		mes1 = Entrada.nextInt();
		System.out.println ("Introduuzca año: ");
		año1 = Entrada.nextInt();
		
		System.out.println ("Fecha 2 :");
		System.out.println ("Introduuzca dia: ");
		dia2 = Entrada.nextInt();
		System.out.println ("Introduuzca mes: ");
		mes2 = Entrada.nextInt();
		System.out.println ("Introduuzca año: ");
		año2 = Entrada.nextInt();
		
		total_dias = dia2-dia1+30*(mes2-mes1)+365*(año2-año1);
		System.out.println ("Dias de diferencia: "+ total_dias);
	}

}
