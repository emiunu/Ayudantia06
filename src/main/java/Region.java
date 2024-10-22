import java.util.*;

public class Region {

	private List<Ciudad> ciudades;
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

	public List<Ciudad> getCiudades() {
		return this.ciudades;
	}
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	public Region(String nombre, List<Ciudad> ciudades) {
		this.nombre = nombre;
		this.ciudades = ciudades;
	}
}