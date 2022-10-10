package proyecto1;

import java.util.Date;

class Efectivo extends Pago {
	public Efectivo (float monto, Date fecha) {
                super(monto, fecha);
	}

	public float calcDevolucion(OrdenCompra oc) {
                return oc.calcPrecio() - super.getMonto();
	}
}
