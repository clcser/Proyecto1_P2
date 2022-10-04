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
	}

	public void setMonto(float monto) {
	}

	public Date getFecha() {
	}

	public void setFecha(Date fecha) {
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
	}

	public void setBanco(String banco) {
	}

	public String getNumCuenta() {

	}

	public void setNumCuenta(String numCuenta) {
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
	}

	public void setTipo(String tipo) {
	}

	public String getNumTransaccion() {
	}

	public void setNumTransaccion(String numTransaccion) {
	}

    public String toString() {
        return super.toString() + ". Tipo: " + tipo + ". Numero de Transaccion: " + numTransaccion;
    }
}
