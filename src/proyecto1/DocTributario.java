package proyecto1;

public class DocTributario {
    private String numero, rut;
    private Date fecha;
    private Direccion;

    public DocTributario() {
    
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
