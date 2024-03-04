package tarea09;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Libreria {
	

	public static String rellenarespacios(String dato, int tamano) {
        String cadena;
        cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++)
            cadena = cadena + " ";
        return cadena;
    }

    public static String mostrarmenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones)
            cadena = cadena + info + "\n";
        cadena = cadena + "Que opcion deseas";
        return cadena;
    }

    public static boolean evaluarnumerico(String dato, int tipo) {
        boolean valido = true;
        try {
            switch (tipo) {
                case 1: {
                    int x = Integer.parseInt(dato);
                    break;
                }
                case 2: {
                    double x = Double.parseDouble(dato);
                    break;
                }
            }
        } catch (NumberFormatException e) {
            valido = false;
        }
        return valido;
    }

    public static String leer(String texto) {
        String cadena = "";
        try {
            cadena = JOptionPane.showInputDialog(texto);
            if (cadena != null)
                cadena = cadena.trim();
        } catch (Exception e) {
            cadena = null;
        }
        return cadena;
    }

    public static String leer(String texto, int tipo) {
        String cadena = "";
        try {
            cadena = JOptionPane.showInputDialog(texto);
            if (cadena != null) {
                cadena = cadena.trim();
                if ((tipo == 1) || (tipo == 2))
                    if (!evaluarnumerico(cadena, tipo))
                        cadena = null;
            }
        } catch (Exception e) {
            cadena = null;
        }
        return cadena;
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static String getIdtecketsiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10)
            idticketnext = "00" + String.valueOf(num).trim();
        else if ((num > 9) && (num < 100))
            idticketnext = "0" + String.valueOf(num).trim();
        else
            idticketnext = String.valueOf(num).trim();
        return idticketnext;
    }
}



