import java.util.*;

public class Ciudad {

	private List<Tienda> tiendas;
	private String nombre;
	private int codigoPostal;

	public String getNombre() {
		return this.nombre;
	}

	public Ciudad(String nombre, int codigoPostal) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.tiendas = new ArrayList<>();
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	/**
	 * 
	 * @param codigoPostal
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * 
	 * @param nombre
	 * @param direccion
	 * @param horarioAtencion
	 */
	public boolean agregarTienda(String nombre, String direccion, String horarioAtencion) {
		// TODO - implement Ciudad.agregarTienda
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 */
	public boolean eliminarTienda(String nombre) {
		// TODO - implement Ciudad.eliminarTienda
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param empleado
	 */
	public boolean asociarEmpleados(String nombre, Empleado empleado) {
		// TODO - implement Ciudad.asociarEmpleados
		throw new UnsupportedOperationException();
	}

	public List<Tienda> consultarTiendas() {
		// TODO - implement Ciudad.consultarTiendas
		throw new UnsupportedOperationException();
	}

}