package Fundamentos;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// importamos las bibliotecas necesarias para que pueda ejecutar
public class lista_productos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// craer una lista de productos
		 List <String> listpro=new ArrayList<>();
		 listpro.add("camisa 1");
		 listpro.add("pantalon 2");
		 listpro.add("calcetines 3");
		 listpro.add("zapatos 4");
		 listpro.add("lentes 5");
		 
		 // converimos la lista en JSONArray
		 JSONArray jsonArray = new JSONArray();
		 for(String producto:listpro) {
			 jsonArray.put(producto);
		 }
		 
		 //Crea un JSONObject para almacenar el JSONArray:
		 JSONObject jsonObject = new JSONObject ();
		 jsonObject.put("Lista de productos", jsonArray);
		 
		 //Escribe el JSONObject en un archivo JSON
		 try (FileWriter file = new FileWriter("Listpro.json")) {
			    file.write(jsonObject.toString());
			    System.out.println("Archivo JSON creado con éxito.");
			} catch (IOException e) {
			    e.printStackTrace();
			
			}
		 
		 
		 

	}

}
