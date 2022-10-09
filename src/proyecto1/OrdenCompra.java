package proyecto1;

import java.util.ArrayList;

public class OrdenCompra {
        private Date fecha;
        private String estado;
        private Cliente cliente;
        private DetalleOrden detalleOrden;
        private DocTributario docTributario;
        private ArrayList<Pago> pagos;
        private ArrayLists<DetalleOrden> detalles;

        public OrdenCompra(Cliente cliente, Date fecha, String estado, String num, int cantidad, Articulo articulo, Pago p) {
                this.cliente = cliente;
                this.fecha = fecha;
                this.estado = estado;

                docTributario = new DocTributario(num, cliente.getRut(), fecha);

                pagos = new ArrayList<Pago>();

                pagos.add(p);

                detalles = new ArrayList<DetalleOrden>();

                DetalleOrden detOrd = new DetalleOrden(cantidad, articulo);

                detalles.add(detOrd);
        }

        public float calcPrecioSinIVA() {
                float sum = 0.0;

                for (int i = 0; i < detalles.length; i++) {
                        sum += detalles[i].calcPrecioSinIVA();
                }

                return sum;
        }

        public float calcIVA() {
                float sum = 0.0;

                for (int i = 0; i < detalles.length; i++) {
                        sum += detalles[i].calcIVA();
                }

                return sum;
        }

        public float calcPrecio() {
                float sum = 0.0;

                for (int i = 0; i < detalles.length; i++) {
                        sum += detalles[i].calcPrecio();
                }

                return sum;
        }

        public float calcPeso() {
                float sum = 0.0;

                for (int i = 0; i < detalles.length; i++) {
                        sum += detalles[i].calcPeso();
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
                return "Fecha: " + fecha + ". Estado: " + " Detalle de la orden: " + detalleOrden.toString() + ". Documento Tributario: " + docTributario.toString();
        }
}
