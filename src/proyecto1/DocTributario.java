package proyecto1;

<<<<<<< HEAD
import java.util.Date;

abstract class DocTributario {
=======
abstract public class DocTributario {
>>>>>>> master
    private String numero, rut;
    private Date fecha;

    public DocTributario(String n, String r, Date f) {
            numero = n;
            rut = r;
            fecha = f;
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
        return "\n    Numero: " + numero + "\n    Rut del cliente: " + rut + 
                "\n    Fecha: " + fecha + "\n";
    }
}