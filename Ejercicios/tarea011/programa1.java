package tarea011;

import java.util.Scanner;

public class programa1 {
	public static void main(String[] args)
	{
		double a, b, c; // coeficientes ax2+bx+c=0
		double x1, x2, d; //soluciones y determinante
		
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduzca el primer coeficiente (a): ");
		a = Entrada.nextDouble();
		System.out.println ("Introduzca el segundo coeficiente (b): ");
		b = Entrada.nextDouble();
		System.out.println ("Introduzca el tercer coeficiente (c): ");
		c = Entrada.nextDouble();
		
		// calculamos el determinante
		d=((b*b)-4*a*c);
		if (d<0)
		{
			System.out.println ("No existen soluciones reales");
		}
		else 
		{
			// queda confirmar que a sea distinto de 0
			// si a=0 nos encontramos una división por cero
			
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(+b+Math.sqrt(d))/(2*a);
			System.out.println ("Solución: " + x1);
			System.out.println ("Solución: " + x2);
		}

}
}