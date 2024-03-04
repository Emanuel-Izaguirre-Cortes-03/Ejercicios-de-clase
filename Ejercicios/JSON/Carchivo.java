package JSON;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Carchivo {
	private String nombreArchivo;

    public Carchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    // Método abstracto para abrir archivo JSON
    public abstract String abrirArchivo();

    // Método abstracto para guardar archivo JSON
    public void guardarArchivo(String jsonData) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(jsonData);
            System.out.println("Archivo JSON guardado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	

}
