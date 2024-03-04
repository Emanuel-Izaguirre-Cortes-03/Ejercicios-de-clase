package tarea011;

import java.util.Scanner;

public class Programa62 {

	public static void main(String[] args)
	{
		int t[] = new int [10];
		int num, sitio_num, j;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println ("Introduzca número (ordenado crecientemente): ");
			t[i] = Entrada.nextInt();
		}
		System.out.println ();
		System.out.println ("Número a insertar entre los anteriores: ");
		num = Entrada.nextInt();
		sitio_num=0;
		j=0;
		while(t[j]<num && j<=4)
		{
			sitio_num++;
			j++;
		}
		for (int i=4; i>sitio_num; i++)
		{
			t[i+1]=t[i];
		}
		t[sitio_num]=num;
		System.out.println ("La nueva serie ordenada queda: ");
		for (int i=0; i<5+1; i++)
		{
			System.out.println (t[i]);
		}
	}

}
