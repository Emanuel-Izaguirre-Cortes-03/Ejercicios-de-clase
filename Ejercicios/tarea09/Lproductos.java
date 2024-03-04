package tarea09;
import java.util.ArrayList;
public class Lproductos {
	 ArrayList<Cproducto> lista;

	    public Lproductos() {
	        super();
	        this.lista = new ArrayList<Cproducto>();
	    }

	    public Lproductos(ArrayList<String[]> datos) {
	        super();
	        this.lista = new ArrayList<Cproducto>();
	        for (String[] info : datos) {
	            Cproducto nodo = new Cproducto(info[0], info[1], info[2]);
	            lista.add(nodo);
	        }
	    }

	    public String mostrarLista() {
	        String salida = "";
	        for (Cproducto info : this.lista)
	            salida = salida + info.getMostrarProducto() + "\n";
	        return salida;
	    }

	    public int existe(String codigo) {
	        int enc = -1;
	        int pos = -1;
	        for (Cproducto info : this.lista) {
	            pos++;
	            if (info.getCodigo().compareTo(codigo.trim()) == 0)
	                enc = pos;
	        }
	        return enc;
	    }

	    public int existe(Cproducto nodo) {
	        int enc = -1;
	        int pos = -1;
	        for (Cproducto info : this.lista) {
	            pos++;
	            if (info.getCodigo().compareTo(nodo.getCodigo()) == 0)
	                enc = pos;
	        }
	        return enc;
	    }

	    public boolean insertar(Cproducto nodo) {
	        boolean exito = true;
	        if (existe(nodo) == -1)
	            lista.add(nodo);
	        else
	            exito = false;
	        return exito;
	    }

	    public void eliminar(int pos) {
	        lista.remove(pos);
	    }

	    public void modificar(int pos, String precio) {
	        Cproducto info = lista.get(pos);
	        info.setPrecio(precio);
	        lista.set(pos, info);
	    }

	    public String guardar() {
	        String archivo = "";
	        int tam = this.lista.size();
	        int pos = 1;
	        for (Cproducto info : this.lista)
	            if (pos < tam) {
	                archivo = archivo + info.getlineaarchivo() + "\n";
	                pos++;
	            } else
	                archivo = archivo + info.getlineaarchivo() + "\n";
	        return archivo;
	    }

	    public Cproducto getProducto(int pos) {
	        return this.lista.get(pos);
	    }

	    public ArrayList<Cproducto> listaproductos() {
	        return this.lista;
	    }
	}


