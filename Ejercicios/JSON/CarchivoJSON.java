package JSON;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CarchivoJSON extends Carchivo {
	private static final String RUTA_ESPECIFICA = "C:\\Users\\Emanu\\eclipse-workspace\\a2223330168_PA_Unidad1";

    public CarchivoJSON(String nombreArchivo) {
        super(nombreArchivo);
    }

    @Override
    public String abrirArchivo() {
        // Implementa el método según tus necesidades
        return null;
    }

    @Override
    public void guardarArchivo(String jsonData) {
        // Crea la carpeta específica si no existe
        File carpeta = new File(RUTA_ESPECIFICA);
        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea la carpeta y sus directorios padres si no existen
        }

        // Guarda el archivo en la carpeta específica
        String rutaArchivo = RUTA_ESPECIFICA + File.separator + getNombreArchivo();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write(jsonData);
            System.out.println("Archivo JSON guardado exitosamente en: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
