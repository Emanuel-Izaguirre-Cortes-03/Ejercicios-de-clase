package JSON;

public class EscribirJSON {
	public static void main(String[] args) {
        // Crear una instancia de Carchivojson con el nombre del archivo JSON
        CarchivoJSON archivoJson = new CarchivoJSON("datos.json");

        // Crear datos en formato JSON
        String jsonData = "{\"nombre\": \"John\", \"apellido\": \"Doe\", \"edad\": 30}";

        // Guardar los datos en el archivo JSON
        archivoJson.guardarArchivo(jsonData);
    }

}
