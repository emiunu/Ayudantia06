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
	public void agregarProducto(int codigo, String descripcion, int precio, String categoria) {
		this.productos.add(new Producto(codigo, descripcion, precio, categoria));
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean eliminarProducto(Producto producto) {
		boolean condicion = false;
		for (Producto p : productos) {
			if (p.equals(producto)) {
				this.productos.remove(p);
				condicion = true;
			}
		}
		return condicion;
	}

	/**
	 * 
	 * @param producto
	 */
	public boolean actualizarInventario(Producto producto) {
		for (Producto p : this.productos){
			if (p.equals(producto)) {
				this.productos.remove(producto);
				return true;
			}
		}
		return false;
	}

	public List<Producto> consultarProductos() {
		return this.productos;
	}

	/**
	 * 
	 * @param producto
	 */
	public int consultarInventario(Producto producto) {
		int contador = 0;
		for (Producto p : this.productos){
			if (p.equals(producto)){
				contador++;
			}
		}
		return contador;
	}

	public boolean verificarExistenciaProducto(int codigo){
		for (Producto producto: this.productos) {
			if (producto.getCodigo() == codigo){
				return true;
			}
		}
		return false;
	}

}