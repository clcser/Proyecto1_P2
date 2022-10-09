package proyecto1;

public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Direccion leoDir = new Direccion("Rd. Euler, Basel");
            Direccion clauDir = new Direccion("Av. Yumbel, Los Angeles");

            Cliente leo = new Cliente("Leonardo", "8128", leoDir);
            Cliente clau = new Cliente("Claudia", "496", clauDir);

            Articulo libro = new Articulo(0.2, "Elements de Mathematique", "Bourbaki", 50);
            Articulo pelota = new Articulo(0.3, "Volley", "Pelota de Volley", 60);
            Articulo blusa = new Articulo(0.1, "Blusa", "Blusa suave azul", 30);
            Articulo marcador = new Articulo(0.05, "V5 Pilot", "Marcador Pilot", 5);
            Articulo cama = new Articulo(20, "Superior Excelence", "La mejor cama", 1200);

            Date fecha = new Date();

            Efectivo p1 = new Efectivo(50, fecha);
            Tarjeta p2 = new Tarjeta(110, "Debito", "168");
            Tarjeta p3 = new Tarjeta(30, "Debito", "169");

            OrdenCompra oc1 = new OrdenCompra(leo, fecha, "En reparto", "123", 1, libro, p1);
            OrdenCompra oc2 = new OrdenCompra(clau, fecha, "En reparto", "124", 2, pelota, p2);
            OrdenCompra oc3 = new OrdenCompra(clau, fecha, "En reparto", "126", 6, marcador, p3);

            System.out.println(oc1.toString());
    }
}
