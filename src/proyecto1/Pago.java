package proyecto1;

import java.util.Date;

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
<<<<<<< HEAD
                return "    Monto: " + monto + "\n    Fecha: " + fecha + "\n";
        }
}
=======
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
>>>>>>> master
