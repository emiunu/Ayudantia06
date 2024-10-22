import java.util.*;

public class Territorio {

	private List<Region> regiones;
	private String nombre;

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

	/**
	 * 
	 * @param nombre
	 * @param ciudades
	 */
	public boolean agregarRegion(String nombre, List<Ciudad> ciudades) {
		// TODO - implement Territorio.agregarRegion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreRegion
	 */
	public boolean eliminarRegion(String nombreRegion) {
		// TODO - implement Territorio.eliminarRegion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreCiudad
	 * @param codigoPostal
	 * @param region
	 */
	public boolean agregarCiudad(String nombreCiudad, int codigoPostal, Region region) {
		// TODO - implement Territorio.agregarCiudad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param codigoPostal
	 */
	public boolean eliminarCiudad(int codigoPostal) {
		// TODO - implement Territorio.eliminarCiudad
		throw new UnsupportedOperationException();
	}

	public List<Region> consultarRegiones() {
		// TODO - implement Territorio.consultarRegiones
		throw new UnsupportedOperationException();
	}

}