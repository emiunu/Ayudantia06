import java.util.*;

public class Inventario {

	private List<Producto> productos;

	public Inventario() {
		this.productos = new ArrayList<>();
	}

	/**
	 * 
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param categoria
	 */
	public boolean agregarProducto(int codigo, String descripcion, int precio, String categoria) {
		// TODO - implement Inventario.agregarProducto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean eliminarProducto(Producto producto) {
		// TODO - implement Inventario.eliminarProducto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean actualizarInventario(Producto producto) {
		// TODO - implement Inventario.actualizarInventario
		throw new UnsupportedOperationException();
	}

	public List<Producto> consultarProductos() {
		return this.productos;
	}

	/**
	 * 
	 * @param producto
	 */
	public int consultarInventario(Producto producto) {
		// TODO - implement Inventario.consultarInventario
		throw new UnsupportedOperationException();
	}

}