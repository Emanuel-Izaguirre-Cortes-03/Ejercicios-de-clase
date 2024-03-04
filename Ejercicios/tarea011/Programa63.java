package tarea011;

import java.util.Scanner;

public class Programa63 {

	public static void main(String[] args)
	{
		int t[] = new int [10];
		int posicion;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println ("Elemento ( " + i + " ): ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ();
		System.out.println ("Posicion a eliminar: ");
		posicion = Entrada.nextInt();
		for (int i=posicion; i<9; i++)
		{
			t[i]=t[i+1];
		}
		System.out.println ("La tabla queda: ");
		for (int i=0; i<9; i++)
		{
			System.out.println (t[i]);
		}
	}

}
