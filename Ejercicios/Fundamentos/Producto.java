package Fundamentos;

public class Producto {
private String id, producto,precio,cantidad;
	
	
	public Producto(String id, String producto) {
		super();
		this.id=id;
		this.producto=producto;
		this.precio="0";
		this.cantidad="0";
	}
	public Producto() {
		super();
		this.id=null;
		this.producto=null;
		this.precio=null;
		this.cantidad=null;
	}
	//este constructor es nuevo
	public Producto(String id,String productos,String precio,String cantidad ) {
		super();
		this.id=id;
		this.producto=productos;
		this.precio=precio;
		this.cantidad=cantidad;
	}
	
	public String[]ColumnasNombres(){
		return new String[] {"id","Producto","Precio","Existencia"};
	}
	public String[] ColumnasDatos() {
		return new String[] {
				this.getId(),this.getProducto(),this.getPrecio(),this.getCantidad()
		};
	}
	public String getCantidad() {
		
		return this.cantidad;
	}
	public int[]ColumnasSize(){
		return new int[] {
			25,100,40,40
		};
	}
	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getId() {
		return id;
	}

	public String getProducto() {
		return producto;
	}

	@Override
	public String toString() {
		return this.getProducto();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean situacion = false;
		
		Producto other = (Producto) obj;
		
		if (this.getId().compareTo(other.getId() ) == 0)
			return true;
		
		return situacion;
	}

}
