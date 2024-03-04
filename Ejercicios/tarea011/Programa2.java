package tarea011;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, r; //artea y radio
		Scanner Entrada = new Scanner (System.in);
		System.out.println ("Introduce el radio del circulo: ");
		r = Entrada.nextDouble();
		a = Math.PI*(r*r);
		System.out.println ("El área de una circuferencia de radio " + r + " es: " + a);

	}

}
