package tarea011;

import java.util.Scanner;

public class Programa33 {

	public static void main(String[] args)
	{
		long producto = 1;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=1; i<20; i+=2)
		{
			producto=producto*i;
		}
		System.out.println ("La multiplicacción de los 10 primeros números impares: " + producto);
	}

}
