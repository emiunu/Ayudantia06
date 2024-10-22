public class Empleado {

	private String nombre;
	private int numeroId;
	private String cargo;

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

	public int getNumeroId() {
		return this.numeroId;
	}

	/**
	 * 
	 * @param numeroId
	 */
	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	public String getCargo() {
		return this.cargo;
	}

	/**
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Empleado(String nombre, int numeroId, String cargo) {
		this.nombre = nombre;
		this.numeroId = numeroId;
		this.cargo = cargo;
	}
}