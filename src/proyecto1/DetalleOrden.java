package proyecto1;

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
                return "Detalle Orden: " + "\n    Articulo: " + articulo.toString() + "\n    Cantidad: " + cantidad;
        }
}
