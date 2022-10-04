package proyecto1;

abstract public class DocTributario {
    private String numero, rut;
    private Date fecha;

    public DocTributario() {
        numero = null;
        rut = null;
        fecha = new Date();
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
        return "Boleta numero: " + numero + ". Rut del cliente: " + rut + ". Fecha: " + fecha;
    }
}

class Boleta extends DocTributario {
    public Boleta() {

    }
}

class Factura extends DocTributario {
    public Factura() {

    }
}
