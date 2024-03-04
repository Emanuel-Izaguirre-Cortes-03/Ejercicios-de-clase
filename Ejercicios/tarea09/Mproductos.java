package tarea09;
import javax.swing.JOptionPane;
public class Mproductos {
	private Lproductos listaproductos;
    private Carchivo archivotxt;
    private Boolean valido;

    public Mproductos() {
        valido = true;
        archivotxt = new Carchivo("productos.txt");
        if (archivotxt.Existe())
            listaproductos = new Lproductos(archivotxt.CargarArchivo());
        else {
            listaproductos = new Lproductos();
            JOptionPane.showMessageDialog(null, "No encontró el archivo" + archivotxt.getNombrearchivo());
            valido = false;
        }
    }

    public void capturar() {
        String codigo, producto, precio;
        String info = listaproductos.mostrarLista();
        codigo = Libreria.leer(info + "\nIntroduce el código del producto");
        producto = Libreria.leer(info + "\nIntroduce el nombre del producto");
        precio = Libreria.leer(info + "\nIntroduce el precio del producto", 2);
        if ((codigo != null) && (producto != null) && (precio != null))
            if ((!codigo.isEmpty()) && (!producto.isEmpty()) && (!precio.isEmpty())) {
                Cproducto nodo = new Cproducto(codigo, producto, precio);
                if (!listaproductos.insertar(nodo))
                    JOptionPane.showMessageDialog(null, "El código ya existe, no se puede agregar");
            }
    }

    public void eliminar() {
        String codigo, info = listaproductos.mostrarLista();
        int posicion;
        codigo = Libreria.leer(info + "\nIntroduce el código del producto");
        posicion = listaproductos.existe(codigo);
        System.out.println("posición " + posicion);
        if (posicion > -1)
            listaproductos.eliminar(posicion);
        else
            JOptionPane.showMessageDialog(null, "No existe el código");
    }

    public void modificar() {
        String codigo, precio, info = listaproductos.mostrarLista();
        int posicion;
        codigo = Libreria.leer(info + "\nIntroduce el código del producto a modificar");
        posicion = listaproductos.existe(codigo);
        System.out.println("posición " + posicion);
        if (posicion > -1) {
            precio = Libreria.leer(info + "\nIntroduce el precio del producto", 2);
            posicion = listaproductos.existe(codigo);
            listaproductos.modificar(posicion, precio);
        } else
            JOptionPane.showMessageDialog(null, "No existe el código");
    }

    public void Listado() {
        if (valido)
            JOptionPane.showMessageDialog(null, listaproductos.mostrarLista());
        else
            JOptionPane.showMessageDialog(null, "No hay datos");
    }

    public void EjecutarMproductos() {
        String[] datosmenu = {"Menu de Productos", "1.-Altas ", "2.-Bajas ", "3.-Modificar ", "5.-Listado ", "6.-Salida "};
        String opcion = Libreria.leer(Libreria.mostrarmenu(datosmenu), 1);
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
                    this.modificar();
                    break;
                case "5":
                    this.Listado();
                    break;
            }
        archivotxt.GuardarArchivo(listaproductos.guardar());
        System.out.println(listaproductos.mostrarLista());
    }
}



