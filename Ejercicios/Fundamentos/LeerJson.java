package Fundamentos;
import com.google.gson.Gson;
 import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
 import java.io.IOException;
 import java.util.List;
public class LeerJson {
	 public static void main(String[] args) throws IOException {
		// Leer archivo JSON 
		 FileReader fileReader = new FileReader("productos.json");
		 Gson gson = new Gson();
		 
		 //Convertir JSON a lista de productos
		 List<Producto> productos = gson.fromJson(fileReader, new TypeToken<List<Producto>>(){}.getType());
		 
		// Imprimir datos de los productos
		 for (Producto producto : productos) {
			 System.out.println("ID: " + producto.getId());
			 System.out.println("Producto: " + producto.getProducto());
			 System.out.println("Precio: " + producto.getPrecio());
			 System.out.println("Cantidad: " + producto.getCantidad());
			System.out.println();
			        }
			
			        fileReader.close();
		 
	 }
	 
	      
	

}
