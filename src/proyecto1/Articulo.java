package proyecto1;

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
                return "\n        Nombre: " + nombre + "\n        Descripcion: " + descripcion + "\n        Peso: " + peso + "\n    Precio: " + precio + ".";
	}
}