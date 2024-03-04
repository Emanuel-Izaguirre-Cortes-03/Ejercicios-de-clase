package tarea09;
import java.util.ArrayList;

public class Lticket  extends Lproductos{
	private String idticket;
    private String fecha;

    public Lticket(String fecha, String idticket) {
        super();
        this.idticket = idticket;
        this.fecha = fecha;
        this.lista = new ArrayList<Cproducto>();
    }

    @Override
    public boolean insertar(Cproducto nodo) {
        lista.add(nodo);
        return true;
    }

    public String mostrarListaproductos() {
        String salida = "";
        salida = salida + this.mostrarLista();
        salida = salida + "\n el total de la venta --> " + this.getTotal();
        return salida;
    }

    public String mostrarListaventa() {
        String salida = "";
        salida = "Fecha " + this.fecha + " Ticket No." + this.idticket;
        salida = salida + "\n" + this.mostrarLista();
        salida = salida + "\n \n El total sin iva " + this.getSubtotal();
        salida = salida + "\n el iva total es " + this.getIva();
        salida = salida + "\n el total de la venta fue " + this.getTotal();
        return salida;
    }

    public String getSubtotal() {
        double suma = 0;
        for (Cproducto info : this.lista)
            suma = suma + (Double.parseDouble(info.getPrecio()));
        return String.valueOf(suma);
    }

    public String getIva() {
        double iva = Double.parseDouble(this.getSubtotal()) * 0.16;
        return String.valueOf(iva);
    }

    public String getTotal() {
        double total = Double.parseDouble(this.getSubtotal()) + Double.parseDouble(this.getIva());
        return String.valueOf(total);
    }

    public String getIdticket() {
        return this.idticket;
    }

    public void setIdticket(String idticket) {
        this.idticket = idticket;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String guardar() {
        String archivo = "";
        int tam = this.lista.size();
        int pos = 1;
        for (Cproducto info : this.lista)
            if (pos < tam) {
                archivo = archivo + this.fecha.trim() + "," + this.idticket.trim() + ","
                        + info.getlineaarchivo() + "\n";
                pos++;
            } else
                archivo = archivo + this.fecha.trim() + "," + this.idticket.trim() + ","
                        + info.getlineaarchivo();
        return archivo;
    }
}
	


