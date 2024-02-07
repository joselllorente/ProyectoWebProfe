package pojos.muebles;

public class Sofa extends Mueble {
	private String color;

	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
}
