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
		if (!verificarExistenciaRegion(nombre)){
			Region region = new Region(nombre, ciudades);
			this.regiones.add(region);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param nombreRegion
	 */
	public boolean eliminarRegion(String nombreRegion) {
		for (Region region : this.regiones){
			if (region.getNombre().equals(nombreRegion)){
				this.regiones.remove(region);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param nombreCiudad
	 * @param codigoPostal
	 * @param region
	 */
	public boolean agregarCiudad(String nombreCiudad, int codigoPostal, Region region) {
		if (!verificarExistenciaCiudad(region,codigoPostal)){
			Ciudad ciudad = new Ciudad(nombreCiudad, codigoPostal);
			List<Ciudad> ciudades = region.getCiudades();
			ciudades.add(ciudad);
			region.setCiudades(ciudades);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param codigoPostal
	 */
	public boolean eliminarCiudad(int codigoPostal, String nombreRegion) {
		for (Region reg : regiones){
			if (reg.getNombre().equals(nombreRegion)){
				for (Ciudad ciu : reg.getCiudades()){
					if (ciu.getCodigoPostal() == codigoPostal){
						List<Ciudad> ciudades = reg.getCiudades();
						ciudades.remove(ciu);
						reg.setCiudades(ciudades);
						return true;
					}
				}
			}
		}
		return false;
	}

	public List<Region> consultarRegiones() {
		return this.regiones;
	}

	public boolean verificarExistenciaRegion(String nombre){
		for (Region reg : this.regiones){
			if (reg.getNombre().equals(nombre)){
				return true;
			}
		}
		return false;
	}

	public boolean verificarExistenciaCiudad(Region region, int codigoPostal){
		for (Ciudad ciudad : region.getCiudades()){
			if (ciudad.getCodigoPostal() == codigoPostal){
				return true;
			}
		}
		return false;
	}

}