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

    public Date getFecha() {}
    public void setFecha(Date d) {}
    public String getEstado() {}
    public void setEstado(String e) {}

    public String toString() {
        return "Fecha: " + fecha + ". Estado: " + " Detalle de la orden: " + detalleOrden.toString() + ". Documento Tributario: " + docTributario.toString();
    }

}
