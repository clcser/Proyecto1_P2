package proyecto1;

import java.util.Date;

class Boleta extends DocTributario {
    public Boleta(String n, String r, Date f) {
            super(n, r, f);
    }

    public String toString() {
            return "\n    Tipo: Boleta" + super.toString();
    }
}
