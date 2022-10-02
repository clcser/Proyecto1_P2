/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author clau
 */
public class Pago {
	private float monto;
	private Date fecha;

	public Pago () {
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
	public Efectivo () {
	}

	public float calcDevolucion() {
	}
}

class Transferencia extends Pago {
	private String banco;
	private String numCuenta;

	public Transferencia() {
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

	public Tarjeta() {
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
