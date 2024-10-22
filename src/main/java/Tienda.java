import java.util.*;

public class Tienda {

	private List<Compra> compras;
	private List<Cliente> clientes;
	private List<Empleado> empleados;
	private Inventario inventario;
	private String nombre;
	private String direccion;
	private String horarioAtencion;

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

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	/**
	 * 
	 * @param horarioAtencion
	 */
	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	/**
	 * 
	 * @param nombre
	 * @param numeroId
	 * @param cargo
	 */
	public boolean agregarEmpleado(String nombre, int numeroId, String cargo) {
		// TODO - implement Tienda.agregarEmpleado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numeroId
	 */
	public boolean eliminarEmpleado(int numeroId) {
		// TODO - implement Tienda.eliminarEmpleado
		throw new UnsupportedOperationException();
	}

	public List<Empleado> consultarEmpleados() {
		// TODO - implement Tienda.consultarEmpleados
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param nCliente
	 */
	public boolean registrarCliente(String nombre, int nCliente) {
		// TODO - implement Tienda.registrarCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nCliente
	 */
	public boolean eliminarCliente(int nCliente) {
		// TODO - implement Tienda.eliminarCliente
		throw new UnsupportedOperationException();
	}

	public List<Cliente> consultarClientes() {
		// TODO - implement Tienda.consultarClientes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nCompra
	 * @param fecha
	 * @param total
	 * @param formaPago
	 * @param cliente
	 * @param productos
	 */
	public void registrarCompra(int nCompra, String fecha, int total, String formaPago, Cliente cliente, List<Producto> productos) {
		// TODO - implement Tienda.registrarCompra
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compra
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param categoria
	 */
	public boolean agregarProductosACompra(Compra compra, int codigo, String descripcion, int precio, String categoria) {
		// TODO - implement Tienda.agregarProductosACompra
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compra
	 * @param inventario
	 */
	public boolean actualizarInventarioCompra(Compra compra, Inventario inventario) {
		// TODO - implement Tienda.actualizarInventarioCompra
		throw new UnsupportedOperationException();
	}

	public List<Compra> consultarCompras() {
		// TODO - implement Tienda.consultarCompras
		throw new UnsupportedOperationException();
	}

}