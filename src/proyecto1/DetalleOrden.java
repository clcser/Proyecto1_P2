/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author clau
 */
class Articulo {
	private float peso;
	private String nombre;
	private String descripcion;
	private float precio;

	public Articulo() {
	}

	public float getPeso() {
                return peso;
	}

	public void setPeso(float peso) {
                this.peso = peso;
	}

	public String getNombre() {
                return nombre;
	}

	public void setNombre(String nombre) {
                this.nombre = nombre;
	}

	private String getDescripcion() {
                return descripcion;
	}

	private void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
	}

	private float getPrecio() {
                return precio;
	}

	private void setPrecio(float precio) {
                this.precio = precio;
	}

	public String toString() {
                return "Articulo: " + nombre + ". Descripcion: " + descripcion + ". Peso: " + peso + ". Precio: " + precio;
	}
}

public class DetalleOrden {
	private int cantidad;

	public DetalleOrden() {
	}

	public int getCantidad() {
                return cantidad;
	}

	public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
	}

	public String toString() {
                return "Cantidad: " + cantidad;
	}

	public float calcPrecio() {
	}

	public float calcPrecioSinIVA() {
	}

	public float calcIVA() {
	}

	public float calcPeso() {
	}
}
