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
		for (Region reg : regiones){
			if (reg.getNombre().equals(nombre)){
				break;
			} else {
				Region region = new Region(nombre, ciudades);
				regiones.add(region);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param nombreRegion
	 */
	public boolean eliminarRegion(String nombreRegion) {
		for (Region region : regiones){
			if (region.getNombre().equals(nombreRegion)){
				regiones.remove(region);
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
		for (Region reg : regiones){
			if (reg == region){
				Ciudad ciudad = new Ciudad(nombreCiudad, codigoPostal);
				List<Ciudad> ciudades = reg.getCiudades();
				ciudades.add(ciudad);
				reg.setCiudades(ciudades);
				return true;
			}
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

}