/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.util.Date;

/**
 *
 * @author clau
 */
class Pago {
	private float monto;
	private Date fecha;

	public Pago (float monto, Date fecha) {
                this.monto = monto;
                this.fecha = fecha;
	}

	public float getMonto() {
                return monto;
	}

	public void setMonto(float monto) {
                this.monto = monto;
	}

	public Date getFecha() {
                return fecha;
	}

	public void setFecha(Date fecha) {
                this.fecha = fecha;
	}

	public String toString() {
                return "Monto: " + monto + ". Fecha: " + fecha;
        }
}

class Efectivo extends Pago {
	public Efectivo (float monto, Date fecha) {
                super(monto, fecha);
	}

	public float calcDevolucion(OrdenCompra oc) {
                return oc.calcPrecio() - super.getMonto();
	}
}

class Transferencia extends Pago {
	private String banco;
	private String numCuenta;

	public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
                super(monto, fecha);
                this.banco = banco;
                this.numCuenta = numCuenta;
	}

	public String getBanco() {
                return banco;
	}

	public void setBanco(String banco) {
                this.banco = banco;
	}

	public String getNumCuenta() {
                return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
                this.numCuenta = numCuenta;
	}

        public String toString() {
                return super.toString() + ". Banco: " + banco + ". Numero de cuenta: " + numCuenta;
        }
}

class Tarjeta extends Pago {
	private String tipo;
	private String numTransaccion;

	public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion) {
                super(monto, fecha);
                this.tipo = tipo;
                this.numTransaccion = numTransaccion;
	}

	public String getTipo() {
                return tipo;
	}

	public void setTipo(String tipo) {
                this.tipo = tipo;
	}

	public String getNumTransaccion() {
                return numTransaccion;
	}

	public void setNumTransaccion(String numTransaccion) {
                this.numTransaccion = numTransaccion;
	}

        public String toString() {
                return super.toString() + ". Tipo: " + tipo + ". Numero de Transaccion: " + numTransaccion;
        }
}
