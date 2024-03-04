package tarea09;
import javax.swing.JOptionPane;
public class Mpuntoventa {
	private Lproductos listaproductos;
    private Lventa listatickets;
    private Carchivo archivotxtp, archivotxtv;
    private String fechadia;
    private String archivoproductos = "productos.txt";
    private String archivoventas = "ventas.txt";
    private String idticket;

    public Mpuntoventa() {
        fechadia = Libreria.Fecha();
        archivotxtp = new Carchivo(archivoproductos);
        if (archivotxtp.Existe()) {
            listaproductos = new Lproductos(archivotxtp.CargarArchivo());
        } else {
            JOptionPane.showMessageDialog(null, "No encontró el archivo" + archivotxtp.getNombrearchivo());
        }
        archivotxtv = new Carchivo(archivoventas);
        if (archivotxtv.Existe()) {
            listatickets = new Lventa(archivotxtv.CargarArchivo());
        } else {
            JOptionPane.showMessageDialog(null, "No encontró el archivo" + archivotxtv.getNombrearchivo());
            listatickets = new Lventa();
        }
        idticket = listatickets.ultimoticket(fechadia);
    }

    public void capturar() {
        String codigo, info;
        Cproducto nodo;
        info = listaproductos.mostrarLista();
        codigo = Libreria.leer(info + "\nIntroduce el código del producto");
        int pos = listaproductos.existe(codigo.trim());
        if (pos > -1) {
            nodo = listaproductos.getProducto(pos);
            JOptionPane.showMessageDialog(null, nodo.getMostrarProducto());
            pos = listatickets.existe(fechadia, idticket);
            if (pos == -1)
                listatickets.crearticket(fechadia, idticket, nodo);
            else
                listatickets.insertar(pos, nodo);
        } else
            JOptionPane.showMessageDialog(null, "El código no existe, no se puede agregar");
    }

    public void eliminar() {
        String codigo;
        int pos;
        String info = listatickets.mostrarTicket(fechadia, idticket);
        codigo = Libreria.leer(info + "\nIntroduce el código del producto");
        int posi = listaproductos.existe(codigo.trim());
        if (posi > -1) {
            Cproducto nodo = listaproductos.getProducto(posi);
            pos = listatickets.existe(fechadia, idticket);
            if (pos > -1)
                listatickets.eliminararticulo(pos, nodo);
            else
                JOptionPane.showMessageDialog(null, "El artículo no existe ");
        } else
            JOptionPane.showMessageDialog(null, "Código inválido");
    }

    public void Listado() {
        JOptionPane.showMessageDialog(null, this.listatickets.mostrarTicketlista(fechadia, idticket));
    }

    public void pagar() {
        JOptionPane.showMessageDialog(null, this.listatickets.mostrarTicketlista(fechadia, idticket));
        archivotxtv.GuardarArchivo(listatickets.guardarArchivo());
    }

    public void EjecutarMpuntoventa() {
        String opcion;
        idticket = Libreria.getIdtecketsiguiente(idticket);
        do {
            String membrete = "Fecha del Día " + fechadia + " Ticket No " + idticket;
            membrete = membrete + "\n-----------------------------------------------------";
            membrete = membrete + "\n" + listatickets.mostrarTicket(fechadia, idticket);
            String[] datosmenu = {membrete + "\n Menú de Punto de Venta", "1.-Altas ", "2.-Bajas ", "3.-Listado ", "4.-Pagar ", "6.-Salida "};
            opcion = Libreria.leer(Libreria.mostrarmenu(datosmenu), 1);
            if (opcion == null)
                JOptionPane.showMessageDialog(null, "Dato incorrecto introducido");
            else
                switch (opcion) {
                    case "1":
                        this.capturar();
                        break;
                    case "2":
                        this.eliminar();
                        break;
                    case "3":
                        this.Listado();
                        break;
                    case "4":
                        this.pagar();
                        opcion = "6";
                        break;
                    case "6":
                        JOptionPane.showMessageDialog(null, "Salida del Sistema ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No existe esta opción ");
                        break;
                }
        } while (opcion.compareTo("6") != 0);
        System.out.println(listatickets.mostrarTicket(fechadia, idticket));
    }
}



