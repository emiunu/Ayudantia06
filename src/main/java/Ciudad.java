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
		if (!verificarExistenciaTienda(nombre)){
			Tienda tienda = new Tienda(new Inventario(),nombre,direccion,horarioAtencion);
			this.tiendas.add(tienda);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param nombre
	 */
	public boolean eliminarTienda(String nombre) {
		for (Tienda tienda : this.tiendas){
			if (tienda.getNombre().equals(nombre)){
				this.tiendas.remove(tienda);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param nombre
	 * @param empleado
	 */
	public boolean asociarEmpleados(String nombre, Empleado empleado) {
		for (Tienda tienda : this.tiendas){
			if (tienda.getNombre().equals(nombre)){
				List<Empleado> empleadosTienda = tienda.consultarEmpleados();
				empleadosTienda.add(empleado);
				tienda.setEmpleados(empleadosTienda);
				return true;
			}
		}
		return false;
	}

	public List<Tienda> consultarTiendas() {
		return this.tiendas;
	}


	public boolean verificarExistenciaTienda(String nombre){
		for (Tienda tienda : this.tiendas){
			if (tienda.getNombre().equals(nombre)){
				return true;
			}
		}
		return false;
	}

}