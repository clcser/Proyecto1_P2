package proyecto1;

abstract class DocTributario {
    protected String numero, rut;
    protected Date fecha;
    
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
    public Boleta(String n, OrdenCompra orden) {
        super();
        numero = n;
        rut = ; // añadir rut desde la orden
        fecha = ; // fecha de la orden
    }

    public String toString() {
        return "Boleta " + numero + "\nRut del cliente: " + rut + "\nFecha: " + fecha;
    }
}

class Factura extends DocTributario {
    public Factura(String n, OrdenCompra orden) {
        super();
        numero = n;
        rut = ; // añadir rut desde la orden
        fecha = ; // fecha de la orden
    }

    public String toString() {
        return "Factura " + numero + "\nRut del cliente: " + rut + "\nFecha: " + fecha;
    }
}
