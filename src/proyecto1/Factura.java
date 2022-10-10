package proyecto1;

import java.util.Date;

class Factura extends DocTributario {
    public Factura(String n, String r, Date f) {
        super(n, r, f);
    }

    public String toString() {
            return "\n    Tipo: Factura" + super.toString();
    }
}
