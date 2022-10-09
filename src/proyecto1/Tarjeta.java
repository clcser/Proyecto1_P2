package proyecto1;

import java.util.Date;

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
