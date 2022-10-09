package proyecto1;

abstract class DocTributario {
    private String numero, rut;
    private Date fecha;

    public DocTributario(String n, String r, Date f) {
            numero = n;
            rut = r;
            fecha = f;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String n) {
        numero = n;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String r) {
        rut = r;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date f) {
        fecha = f;
    }

    public String toString() {
        return "Numero: " + numero + ". Rut del cliente: " + rut + ". Fecha: " + fecha;
    }
}

class Boleta extends DocTributario {
    public Boleta(String n, String r, Date f) {
            super(n, r, f);
    }

    public String toString() {
            return super.toString();
    }
}

class Factura extends DocTributario {
    public Factura(String n, String r, Date f) {
        super(n, r, f);
    }

    public String toString() {
            return super.toString();
    }
}
