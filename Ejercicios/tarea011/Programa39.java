package tarea011;

import java.util.Scanner;

public class Programa39 {

	public static void main(String[] args)
	{
		int codigo;
		int litros;
		float precio;
		float importe_factura;
		float facturacion_total;
		int litros_cod1;
		int mas_600;
		
		facturacion_total=0;
		litros_cod1=0;
		mas_600=0;
		
		Scanner Entrada = new Scanner (System.in);
		for (int i=1; i<=5; i++)
		{
			System.out.println ("factura n " + i);
			System.out.println ("codigo del producto: ");
			codigo = Entrada.nextInt();
			System.out.println ("cantidad (litros): ");
			litros = Entrada.nextInt();
			System.out.println ("Precio (litro): ");
			precio = Entrada.nextInt();
			
			importe_factura=litros*precio;
			facturacion_total+=importe_factura;
			if (codigo==1)
			{
				litros_cod1+=litros;
			}
			if (importe_factura>=600)
			{
				mas_600++;
			}
		}
		
		System.out.println ("\n\nResumen de ventas\n");
		System.out.println ("La facturación total es de: " + facturacion_total + " € ");
		System.out.println ("ventas del producto 1 : " + litros_cod1 + " litros");
		System.out.println ("Factura superior a 600 €: " + mas_600);
	}

}
