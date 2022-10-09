import java.util.Date;

public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Direccion leoDir = new Direccion("Rd. Euler, Basel");
            Direccion clauDir = new Direccion("Av. Yumbel, Los Angeles");

            Cliente leo = new Cliente("Leonardo", "8128", leoDir);
            Cliente clau = new Cliente("Claudia", "496", clauDir);

            Articulo libro = new Articulo(0.2f, "Elements de Mathematique", "Bourbaki", 50f);
            Articulo pelota = new Articulo(0.3f, "Volley", "Pelota de Volley", 60f);
            Articulo blusa = new Articulo(0.1f, "Blusa", "Blusa suave azul", 30f);
            Articulo marcador = new Articulo(0.05f, "V5 Pilot", "Marcador Pilot", 5f);
            Articulo cama = new Articulo(20f, "Superior Excelence", "La mejor cama", 1200f);

            Date fecha = new Date();

            Boleta b = new Boleta("123", leo.getRut(), fecha);
            Factura f1 = new Factura("124", clau.getRut(), fecha);
            Factura f2 = new Factura("126", clau.getRut(), fecha);

            Efectivo p1 = new Efectivo(50f, fecha);
            Tarjeta p2 = new Tarjeta(110f, fecha, "Debito", "168");
            Tarjeta p3 = new Tarjeta(30f, fecha, "Debito", "169");

            OrdenCompra oc1 = new OrdenCompra(leo, fecha, "En reparto", b, 1, libro, p1);
            OrdenCompra oc2 = new OrdenCompra(clau, fecha, "En reparto", f1, 2, pelota, p2);
            OrdenCompra oc3 = new OrdenCompra(clau, fecha, "En reparto", f2, 6, marcador, p3);

            System.out.println(oc1.toString());
            System.out.println(oc2.toString());
            System.out.println(oc3.toString());
    }
}
