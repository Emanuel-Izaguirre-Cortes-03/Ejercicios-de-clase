package tarea09;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Carchivo {
	 private String nombrearchivo;

	    public Carchivo(String narchivo) {
	        super();
	        this.nombrearchivo = narchivo;
	    }

	    public String getNombrearchivo() {
	        return this.nombrearchivo;
	    }

	    public boolean Existe() {
	        boolean enc;
	        enc = false;
	        File archivo = new File(this.nombrearchivo);
	        if (archivo.exists())
	            enc = true;
	        else
	            enc = false;
	        return enc;
	    }

	    // guardar archivo txt
	    public boolean GuardarArchivo(String datos) {
	        boolean accion = true;
	        try {
	            FileWriter archivo = new FileWriter(this.nombrearchivo);
	            archivo.write(datos);
	            archivo.close();
	        } catch (IOException e) {
	            System.out.println("Error E/S: " + e);
	            accion = false;
	        }
	        return accion;
	    }

	    // carga un archivo txt a un ArrayList de tipo string
	    public ArrayList<String[]> CargarArchivo() {
	        String cadena = "";
	        ArrayList<String[]> datos = new ArrayList<String[]>();
	        try {
	            // Abro el stream, el archivo debe existir
	            FileReader archivo = new FileReader(this.nombrearchivo);
	            // Leemos el archivo línea por línea
	            BufferedReader flujo = new BufferedReader(archivo);
	            // Mientras la línea no esté vacía
	            while ((cadena = flujo.readLine()) != null) {
	                String aux = cadena.trim();
	                if (aux.length() > 0) {
	                    String[] atributos = cadena.split(",");
	                    datos.add(atributos);
	                }
	            }
	            flujo.close();
	            archivo.close();
	        } catch (IOException e) {
	            System.out.println("Error E/S: " + e);
	        }
	        return datos;
	    }

	    public ArrayList<String[]> CargarArchivo(String fecha, int indice) {
	        String cadena = "";
	        ArrayList<String[]> datos = new ArrayList<String[]>();
	        try {
	            // Abro el stream, el archivo debe existir
	            FileReader archivo = new FileReader(this.nombrearchivo);
	            // Leemos el archivo línea por línea
	            BufferedReader flujo = new BufferedReader(archivo);
	            // Mientras la línea no esté vacía
	            while ((cadena = flujo.readLine()) != null) {
	                String aux = cadena.trim();
	                if (aux.length() > 0) {
	                    String[] atributos = cadena.split(",");
	                    if (atributos[indice].compareTo(fecha) == 0)
	                        datos.add(atributos);
	                }
	            }
	            flujo.close();
	            archivo.close();
	        } catch (IOException e) {
	            System.out.println("Error E/S: " + e);
	        }
	        return datos;
	    }
	} // fin de la clase
	


