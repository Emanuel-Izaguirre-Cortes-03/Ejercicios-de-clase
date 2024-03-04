package tarea09;
import java.util.ArrayList;

public class Lventa {
	private ArrayList<Lticket> listaventa;

    public Lventa(ArrayList<String[]> datos) {
        super();
        int pos;
        String fecha, idticket;
        this.listaventa = new ArrayList<Lticket>();
        for (String[] info : datos) {
            fecha = info[0];
            idticket = info[1];
            Cproducto nodo = new Cproducto(info[2], info[3], info[4]);
            pos = existe(fecha, idticket);
            if (pos == -1)
                this.crearticket(fecha, idticket, nodo);
            else
                this.insertar(pos, nodo);
        }
    }

    public Lventa() {
        super();
        this.listaventa = new ArrayList<Lticket>();
    }

    public int existe(String fecha, String idticket) {
        int pos = 0;
        int enc = -1;
        for (Lticket info : this.listaventa) {
            System.out.println(info.getFecha() + " " + info.getIdticket() + " checando");
            if ((info.getFecha().compareTo(fecha) == 0) && (info.getIdticket().compareTo(idticket) == 0))
                enc = pos;
            pos++;
        }
        System.out.println(" lo encontro en la posicion" + enc);
        return enc;
    }

    public void crearticket(String fecha, String idticket, Cproducto nodo) {
        Lticket ticketlista = new Lticket(fecha, idticket);
        ticketlista.insertar(nodo);
        this.listaventa.add(ticketlista);
    }

    public void insertar(int pos, Cproducto info) {
        Lticket ticketlista = this.listaventa.get(pos);
        ticketlista.insertar(info);
        this.listaventa.set(pos, ticketlista);
    }

    public void eliminararticulo(int pos, Cproducto info) {
        Lticket ticketlista = this.listaventa.get(pos);
        if (ticketlista != null) {
            pos = ticketlista.existe(info);
            ticketlista.eliminar(pos);
            this.listaventa.set(pos, ticketlista);
        }
    }

    public String mostrarTicket(int pos) {
        return this.listaventa.get(pos).mostrarListaproductos();
    }

    public String mostrarTicket(String fecha, String idticket) {
        String salida = "";
        int pos = -1;
        salida = "";
        if (this.listaventa != null)
            pos = existe(fecha, idticket);
        if (pos >= 0)
            salida = this.listaventa.get(pos).mostrarListaproductos();
        return salida;
    }

    public String mostrarTicketlista(String fecha, String idticket) {
        String salida = "";
        int pos = -1;
        salida = "";
        if (this.listaventa != null)
            pos = existe(fecha, idticket);
        if (pos >= 0)
            salida = this.listaventa.get(pos).mostrarListaventa();
        return salida;
    }

    public String ultimoticket(String idfecha) {
        int pos;
        ArrayList<String> listadia = new ArrayList<String>();
        String idticket = "000";
        if (listaventa != null) {
            for (Lticket info : this.listaventa) {
                System.out.println("comparando " + info.getFecha() + " con " + idfecha);
                if (info.getFecha().compareTo(idfecha) == 0)
                    listadia.add(info.getIdticket());
            }
            if (listadia == null)
                idticket = "000";
            else {
                if (!listadia.isEmpty()) {
                    pos = listadia.size();
                    if (pos >= 0)
                        idticket = (String) listadia.get(pos - 1);
                } else
                    idticket = "000";
            }
        } else
            idticket = "000";
        return idticket;
    }

    public String tam() {
        return String.valueOf(this.listaventa.size());
    }

    public String guardarArchivo() {
        String ticket = "";
        int pos = 0;
        for (Lticket info : this.listaventa) {
            if (pos < this.listaventa.size())
                ticket = ticket + info.guardar() + "\n";
            else
                ticket = ticket + info.guardar();
            pos++;
        }
        return ticket;
    }

    public String getVentadia(String idfecha) {
        String ventadia = "";
        double total = 0;
        if (listaventa != null) {
            for (Lticket info : this.listaventa) {
                System.out.println("comparando " + info.getFecha() + " con " + idfecha);
                if (info.getFecha().compareTo(idfecha) == 0) {
                    ventadia = ventadia + "No Ticket ->" + info.getIdticket() + " Venta Total->" + info.getTotal()
                            + "\n";
                    total = total + Double.parseDouble(info.getTotal());
                }
            }
        }
        ventadia = ventadia + "\n" + " la venta total del dia fue " + String.valueOf(total);
        return ventadia;
	

}
}