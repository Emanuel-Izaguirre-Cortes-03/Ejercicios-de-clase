package tarea011;

import java.util.Scanner;

public class Programa14A {

	public static void main(String[] args) {
		int nota;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca una nota: ");
		nota = Entrada.nextInt();
		
		if (nota>=0 && nota <5)
		{
			System.out.println ("INSUFICIENTE");
		}
		if (nota==5)
		{
			System.out.println ("SUFICIENTE");
		}
		if (nota==6)
		{
			System.out.println ("BIEN");
		}
		if (nota==7 || nota==8)
		{
			System.out.println ("NOTABLE");
		}
		if (nota==9 || nota==10)
		{
			System.out.println ("SOBRESALIENTE");
		}
	}

}
