package proyecto1;

import java.util.ArrayList;
import java.util.Date;

class OrdenCompra {
        private Date fecha;
        private String estado;
        private Cliente cliente;
        private DocTributario docTributario;
        private ArrayList<Pago> pagos;
        private ArrayList<DetalleOrden> detalles;

        public OrdenCompra(Cliente cliente, Date fecha, String estado, DocTributario dt, int cantidad, Articulo articulo, Pago p) {
                this.cliente = cliente;
                this.fecha = fecha;
                this.estado = estado;
                docTributario = dt;

                pagos = new ArrayList<Pago>();

                pagos.add(p);

                detalles = new ArrayList<DetalleOrden>();

                DetalleOrden detOrd = new DetalleOrden(cantidad, articulo);

                detalles.add(detOrd);
        }

        // Implementing off-time paying behaviour and DetalleOrden modifications post creation

        public void pay(Pago p) {
                pagos.add(p);
        }

        public void addDetalle(DetalleOrden d) {
                detalles.add(d);
        }

        public float calcPrecioSinIVA() {
                float sum = 0.0f;

                for (int i = 0; i < detalles.size(); i++) {
                        sum += detalles.get(i).calcPrecioSinIVA();
                }

                return sum;
        }

        public float calcIVA() {
                float sum = 0.0f;

                for (int i = 0; i < detalles.size(); i++) {
                        sum += detalles.get(i).calcIVA();
                }

                return sum;
        }

        public float calcPrecio() {
                float sum = 0.0f;

                for (int i = 0; i < detalles.size(); i++) {
                        sum += detalles.get(i).calcPrecio();
                }

                return sum;
        }

        public float calcPeso() {
                float sum = 0.0f;

                for (int i = 0; i < detalles.size(); i++) {
                        sum += detalles.get(i).calcPeso();
                }

                return sum;
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
                String str = "Cliente: " + cliente.toString() + "Fecha: " + fecha + "\nEstado: " 
                        + estado + "\nDocumento Tributario: " + docTributario.toString();

                for (int i = 0; i < pagos.size(); i++) {
                        str += "Pago " + i+1 + ":\n" + pagos.get(i).toString() + "\n";
                }

                for (int i = 0; i < detalles.size(); i++) {
                        str += detalles.get(i).toString() + "\n";
                }

                return str + "\n";
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
