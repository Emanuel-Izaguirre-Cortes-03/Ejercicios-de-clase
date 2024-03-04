package tarea011;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args)
	{
		int h, m, s;
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce hora: ");
		h = Entrada.nextInt();
		System.out.println ("Introduce minutos: ");
		m = Entrada.nextInt();
		System.out.println ("Introduce segundos: ");
		s = Entrada.nextInt();
		
		s++;
		if (s>=60)
		{
			s=0;
			m++;
			if (m>=60)
			{
				m=0;
				h++;
				if (h>=24)
				{
					h=0;
				}
			}
		}
		System.out.println ("Fecha: " + h + ":" + m + ":" + s);
	}

}
