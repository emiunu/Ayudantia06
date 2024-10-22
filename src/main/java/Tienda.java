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

	public Tienda(Inventario inventario, String nombre, String direccion, String horarioAtencion) {
		this.empleados = new ArrayList<>();
		this.inventario = inventario;
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarioAtencion = horarioAtencion;
		this.clientes = new ArrayList<>();
		this.compras = new ArrayList<>();
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
		if (!verificarExistenciaEmpleado(numeroId)){
			Empleado empleado = new Empleado(nombre,numeroId,cargo);
			this.empleados.add(empleado);
			return true;
		}
		return false;
	}

	public boolean verificarExistenciaEmpleado(int numeroId){
		for (Empleado e : this.empleados){
			if (e.getNumeroId() == numeroId){
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param numeroId
	 */
	public boolean eliminarEmpleado(int numeroId) {
		for (Empleado e : this.empleados){
			if (e.getNumeroId() == numeroId){
				this.empleados.remove(e);
				return true;
			}
		}
		return false;
	}

	public List<Empleado> consultarEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados){
		this.empleados = empleados;
	}
	/**
	 * 
	 * @param nombre
	 * @param nCliente
	 */
	public boolean registrarCliente(String nombre, int nCliente) {
		if (!verificarExistenciaCliente(nCliente)){
			Cliente cliente = new Cliente(nombre,nCliente);
			this.clientes.add(cliente);
			return true;
		}
		return false;
	}

	public boolean verificarExistenciaCliente(int nCliente){
		for (Cliente cliente : this.clientes){
			if (cliente.getNCliente() == nCliente){
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param nCliente
	 */
	public boolean eliminarCliente(int nCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getNCliente() == nCliente) {
				this.clientes.remove(cliente);
				return true;
			}
		}
		return false;
	}

	public List<Cliente> consultarClientes() {
		return this.clientes;
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
	public boolean registrarCompra(int nCompra, String fecha, int total, String formaPago, Cliente cliente, List<Producto> productos) {
		Compra compra = new Compra(cliente, nCompra, fecha, total, formaPago, productos);
		for (Cliente client : clientes){
			if (client.equals(cliente)){
				List<Compra> comprasCliente = client.getCompras();
				comprasCliente.add(compra);
				client.setCompras(comprasCliente);
				this.compras.add(compra);
				return true;
			}
		}
		return false;
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
		for (Compra com : compras){
			if (com.equals(compra)){
				List<Producto> productos = compra.getProductos();
				productos.add(new Producto(codigo, descripcion, precio, categoria));
				compra.setProductos(productos);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param compra
	 * @param inventario
	 */
	public void actualizarInventarioCompra(Compra compra, Inventario inventario) {
		for (Producto producto : compra.getProductos()){
			inventario.actualizarInventario(producto);
		}
	}

	public List<Compra> consultarCompras() {
		return this.compras;
	}

}