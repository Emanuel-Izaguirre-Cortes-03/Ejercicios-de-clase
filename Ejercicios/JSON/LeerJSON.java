package JSON;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
public class LeerJSON {
	  public static void main(String[] args) {
		  // Nombre del archivo JSON
	        String nombreArchivo = "productos.json";

	        // Crear una instancia de Carchivojson con el nombre del archivo JSON
	        CarchivoJSON archivoJson = new CarchivoJSON(nombreArchivo);

	        // Leer el archivo JSON y obtener su contenido como una cadena
	        String jsonData = archivoJson.abrirArchivo();

	        // Imprimir el contenido del archivo JSON
	        System.out.println("Contenido del archivo JSON:");
	        System.out.println(jsonData);
	    }
	  }
	     


