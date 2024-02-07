package pojos.muebles;

public class Lampara extends Mueble {
	private double potencia;

	public Lampara(String nombre, double precio, double potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
}
