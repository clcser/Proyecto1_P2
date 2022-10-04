package proyecto1;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private DetalleOrden detalleOrden;
    private DocTributario docTributario;
    private ArrayList<Pago> pagos;
    private ArrayLists<DetalleOrden> detalles;

    public OrdenCompra() {
        pagos = new ArrayList<Pago>();
    }

    public float calcPrecioSinIVA() {
        return detalleOrden.calcPrecioSinIVA();
    }

    public float calcIVA() {
        return detalleOrden.calcIVA();
    }

    public float calcPrecio() {
        return detalleOrden.calcPrecio();
    }

    public float calcPeso() {
        return detalleOrden.calcPeso();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Fecha: " + fecha + ". Estado: " + " Detalle de la orden: " + detalleOrden.toString() + ". Documento Tributario: " + docTributario.toString();
    }
}
