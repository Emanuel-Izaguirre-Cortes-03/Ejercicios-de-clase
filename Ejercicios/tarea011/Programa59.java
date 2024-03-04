package tarea011;

import java.util.Scanner;

public class Programa59 {

	public static void main(String[] args)
	{
		int t[] = new int [10];
		int elemento, posicion;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Leyendo datos..");
		for (int i=0; i<10; i++)
		{
			System.out.println ("número: ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ("nuevo elemento:");
		elemento = Entrada.nextInt();
		System.out.println ("posicion donde insertar (de 0 a 8): ");
		posicion = Entrada.nextInt();
		for (int i=7; i>=posicion; i--)
		{
			t[i+1]=t[i];
		}
		t[posicion]=elemento;
		System.out.println ("La tabla queda: ");
		for (int i=0; i<9; i++)
		{
			System.out.println (t[i]);
		}
	}

}
