public class Producto {

	private int codigo;
	private String descripcion;
	private int precio;
	private String categoria;

	public Producto(int codigo, String descripcion, int precio, String categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return this.codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}