/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clau
 */

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
