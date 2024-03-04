package tarea011;

import java.util.Scanner;

public class Programa28 {

	public static void main(String[] args)
	{
		int num, suma;
		
		suma=0;
		Scanner Entrada = new Scanner (System.in);
		do {
			System.out.println ("Introduzca un número: ");
			num = Entrada.nextInt();
			suma=suma+num;
		} while (num!=0);
			System.out.println ("La suma de todos los números es: " + suma);
	}

}
