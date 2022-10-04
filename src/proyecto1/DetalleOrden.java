/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.ArrayList;

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
            this.descripcion = descipcion;
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
                return "Articulo: " + nombre + ". Descripcion: " + descripcion + ". Peso: " + peso + ". Precio: " + precio + ".";
	}
}

public class DetalleOrden {
	private int cantidad;
        private ArrayList<Articulo> articulos;

	public DetalleOrden(ArrayList<Articulo> a) {
            cantidad = a.length;

            articulos = a;
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
            float sum = 0;

            for (int i = 0; i < articulos.length; i++) {
                sum += articulos[i].getPrecio();
            }

            return sum;
	}

	public float calcPrecioSinIVA() {
            return calcPrecio() - calcIVA();
	}

	public float calcIVA() {
            float sum = 0;

            for (int i = 0; i < articulos.length; i++) {
                sum += articulos[i].getPrecio() / 1.19;
            }

            return sum;
	}

	public float calcPeso() {
            float sum = 0;

            for (int i = 0; i < articulos.length; i++) {
                sum += articulos[i].getPeso();
            }

            return sum;
	}

        public String toString() {
            String str = "Cantidad: " + cantidad + "\n";

            for (int i = 0; i < articulos.length; i++) {
                str += Articulo.toString() + "\n";
            }

            return str;
        }
}
