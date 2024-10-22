import java.util.*;

public class Cliente {

	private List<Compra> compras;
	private String nombre;
	private int nCliente;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNCliente() {
		return this.nCliente;
	}

	/**
	 * 
	 * @param nCliente
	 */
	public void setNCliente(int nCliente) {
		this.nCliente = nCliente;
	}

}