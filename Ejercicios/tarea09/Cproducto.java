package tarea09;

public class Cproducto {
	// ...


    private String codigo;
    private String producto;
    private String precio;

    public Cproducto(String codigo, String producto, String precio) {
        super();
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
    }

    public Cproducto(String[] datos) {
        super();
        this.codigo = datos[0];
        this.producto = datos[1];
        this.precio = datos[2];
    }

    public Cproducto() {
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMostrarProducto() {
        String codigo = Libreria.rellenarespacios(this.getCodigo(), 5);
        String producto = Libreria.rellenarespacios(this.getProducto(), 30);
        String precio = Libreria.rellenarespacios(this.getPrecio(), 10);
        String cadena = codigo + producto + precio;
        return cadena;
    }

    public String getlineaarchivo() {
        return this.getCodigo() + "," + this.getProducto() + "," + this.precio;
    }

    public String[] getDatosProducto() {
        String[] datos = new String[3];
        datos[0] = this.getCodigo();
        datos[1] = this.getProducto();
        datos[2] = this.getPrecio();
        return datos;
    }

    public Object[] getTablaDatos() {
        String[] datos = new String[3];
        datos[0] = this.getCodigo();
        datos[1] = this.getProducto();
        datos[2] = this.getPrecio();
        return datos;
    }

    @Override
    public String toString() {
        return this.getProducto() + "---> " + this.precio;
    }
}


