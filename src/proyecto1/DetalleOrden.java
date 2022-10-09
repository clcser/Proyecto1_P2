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

	public Articulo(float peso, String nombre, String descripcion, float precio) {
            this.peso = peso;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
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

	public String getDescripcion() {
                return descripcion;
	}

	public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
	}

	public float getPrecio() {
                return precio;
	}

	public void setPrecio(float precio) {
                this.precio = precio;
	}

	public String toString() {
                return "Articulo: " + nombre + ". Descripcion: " + descripcion + ". Peso: " + peso + ". Precio: " + precio + ".";
	}
}

class DetalleOrden {
	private int cantidad;
        private Articulo articulo;

	public DetalleOrden(int cantidad, Articulo articulo) {
                this.cantidad = cantidad;
                this.articulo = articulo;
	}

	public int getCantidad() {
                return cantidad;
	}

	public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
	}

        public Articulo getArticulo() {
                return articulo;
        }

        public void setArticulo(Articulo articulo) {
                this.articulo = articulo;
        }

	public float calcPrecio() {
                return cantidad * articulo.getPrecio();
	}

	public float calcPrecioSinIVA() {
                return this.calcPrecio() / 1.19f;
	}

	public float calcIVA() {
                return this.calcPrecio() - this.calcPrecioSinIVA();
	}

	public float calcPeso() {
                return cantidad * articulo.getPeso();
	}

        public String toString() {
                return "Detalle Orden: " + cantidad + "\n" + articulo.toString();
        }
}
