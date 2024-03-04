package tarea09;
import javax.swing.JOptionPane;
public class Mreporteventa {
	private Lventa listatickets;
    private Carchivo archivotxtv;
    private Boolean valido;
    private String archivoventas = "ventas.txt";

    public Mreporteventa() {
        valido = true;
        archivotxtv = new Carchivo(archivoventas);
        if (archivotxtv.Existe()) {
            listatickets = new Lventa(archivotxtv.CargarArchivo());
        } else {
            JOptionPane.showMessageDialog(null, "No encontró el archivo" + archivotxtv.getNombrearchivo());
            valido = false;
        }
    }

    public void capturar() {
        String dia, mes, year, idfecha;
        idfecha = "";
        dia = Libreria.leer("Introduce el día ", 1);
        mes = Libreria.leer("Introduce el mes ", 1);
        year = Libreria.leer("Introduce el año [0000] ", 1);
        if ((dia != null) && (mes != null) && (year != null)) {
            if (dia.trim().length() == 1)
                dia = "0" + dia + "-";
            else
                dia = dia + "-";
            if (mes.trim().length() == 1)
                mes = "0" + mes + "-";
            else
                mes = mes + "-";
            idfecha = dia + mes + year;
            JOptionPane.showMessageDialog(null, listatickets.getVentadia(idfecha));
        } else
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
    }

    public void EjecutarMpuntoventa() {
        if (valido)
            this.capturar();
        else
            JOptionPane.showMessageDialog(null, "No encontró el archivo de ventas");
    }
}



