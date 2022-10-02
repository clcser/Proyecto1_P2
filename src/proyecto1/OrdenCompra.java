package proyecto1;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private DetalleOrden detalleOrden;
    private DocTributario docTributario;

    public OrdenCompra() {}

    public float calcPrecioSinIVA() {}
    public float calcIVA() {}
    public float calcPrecio() {}
    public float calcPeso() {}

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date d) {
        fecha = d;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String e) {
        estado = e;
    }

    public String toString() {
        return "Fecha: " + fecha + ". Estado: " + " Detalle de la orden: " + detalleOrden.toString() + ". Documento Tributario: " + docTributario.toString();
    }
}
