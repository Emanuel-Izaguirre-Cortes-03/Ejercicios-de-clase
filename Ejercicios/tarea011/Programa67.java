package tarea011;

import java.util.Scanner;

public class Programa67 {

	public static void main(String[] args)
	{
		int primer[], segundo[], tercer[];
		int num, i;
		int suma_primer, suma_segundo, suma_tercer;
		double media_alumno;
		
		primer = new int[5];
		segundo = new int[5];
		tercer = new int[5];
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Notas del primer trimestre: ");
		for (i=0; i<5; i++)
		{
			System.out.println ("Alumnos ( " + i + " ): ");
			primer[i] = Entrada.nextInt();
		}
		System.out.println ("Notas del segundo trimestre: ");
		for (i=0; i<5; i++)
		{
			System.out.println ("Alumnos ( " + i + " ): ");
			segundo[i] = Entrada.nextInt();
		}
		System.out.println ("Notas del tercer trimestre: ");
		for (i=0; i<5; i++)
		{
			System.out.println ("Alumnos ( " + i + " ): ");
			tercer[i] = Entrada.nextInt();
		}
		suma_primer=0;
		suma_segundo=0;
		suma_tercer=0;
		for (i=0; i<5; i++)
		{
			suma_primer+=primer[i];
			suma_segundo+=segundo[i];
			suma_tercer+=tercer[i];
		}
		
		System.out.println ("Media primer trimestre: " + suma_primer/5.0);
		System.out.println ("Media segundo trimestre: " + suma_segundo/5.0);
		System.out.println ("Media tercer trimestre: " + suma_tercer/5.0);
		System.out.println ();
		System.out.println ("Introduzca posición del alumno (de 0 a 4): ");
		num = Entrada.nextInt();
		media_alumno=(double)(primer[num]+segundo[num]+tercer[num])/3;
		System.out.println ("La media del alumno es: " + media_alumno);
	}

}
