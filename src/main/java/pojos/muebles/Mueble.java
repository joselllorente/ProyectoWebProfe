package pojos.muebles;

public abstract class Mueble {
	private String nombre;
	private double precio;
	public Mueble(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Mueble [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio + "]";
	}
	
	
}
