package tarea09;
import javax.swing.JOptionPane;
public class Principal {

	static Mproductos productos;
    static Mpuntoventa puntoventa;
    static Mreporteventa reportes;

    public static void main(String[] args) throws Throwable {
        String[] datosmenuprincipal = {"1.-Productos ", "2.-Punto de Venta ", "3.-Reporte Venta", "5.-Salida "};
        String[] datosopcion = {"1", "2", "3", "5"};
        String opcion = "0";
        try {
            do {
                opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una Opcion",
                        "Menu de Punto de Venta Tienda don Juan", JOptionPane.DEFAULT_OPTION, null,
                        datosmenuprincipal, datosmenuprincipal[0]);
                opcion = opcion.substring(0, 1);
                if (opcion == null)
                    JOptionPane.showMessageDialog(null, "Opción incorrecta ");
                else
                    switch (opcion) {
                        case "1":
                            productos = new Mproductos();
                            productos.EjecutarMproductos();
                            break;
                        case "2":
                            puntoventa = new Mpuntoventa();
                            puntoventa.EjecutarMpuntoventa();
                            break;
                        case "3":
                            reportes = new Mreporteventa();
                            reportes.capturar();
                            break;
                        case "5":
                            JOptionPane.showMessageDialog(null, "Salida del Sistema ");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No existe esta opción ");
                            break;
                    }
            } while (opcion.compareTo("5") != 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

