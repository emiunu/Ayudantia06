import java.util.*;

public class Compra {

	private Cliente cliente;
	private List<Producto> productos;
	private int nCompra;
	private String fecha;
	private int total;
	private String formaPago;

	public int getNCompra() {
		return this.nCompra;
	}

	/**
	 * 
	 * @param nCompra
	 */
	public void setNCompra(int nCompra) {
		this.nCompra = nCompra;
	}

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getTotal() {
		return this.total;
	}

	/**
	 * 
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	/**
	 * 
	 * @param formaPago
	 */
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

}