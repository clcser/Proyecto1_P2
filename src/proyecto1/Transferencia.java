package proyecto1;

import java.util.Date;

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
                return super.toString() + "    Banco: " + banco + "\n    Numero de cuenta: " + numCuenta;
        }
}
