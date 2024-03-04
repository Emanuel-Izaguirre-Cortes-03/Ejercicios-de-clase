package Fundamentos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import a2223330168_PA_ejercicios.Producto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class CrearJson {
	public static void main(String[] args)throws IOException{
		// Crear lista de productos
		List<Producto> productos = new ArrayList<>();
		productos.add( new Producto("1", "camisa", "10.50", "10"));
		productos.add( new Producto("2", "Zapatos", "25.00", "5"));
		productos.add( new Producto("3", "Libro", "15.50", "20"));
		productos.add( new Producto("4", "Taza", "10.50", "15"));
		
		// Crear objeto Gson
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// Convertir lista a Json
		String json = gson.toJson(productos);
		
		// Escribir archivo JSON
		FileWriter fileWriter = new FileWriter("productos.json");
		fileWriter.write(json);
		fileWriter.close();
		System.out.println("Archivo JSON creado: productos.json");
	}
	 
	     

}
