package proyecto1;
import java.util.ArrayList;

public class Cliente {
    private String nombre, rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = new Direccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getRut() {
        reutn rut;
    }

    public void setRut(String r) {
        rut = r;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(Srting d) {
        direccion.setDireccion(d);
    }

    public String toString() {
        return "Nombre del cliente: " + nombre + ". Rut: " + rut + direccion + "\n";
    }
}

public class Direccion {
    private ArrayList<Cliente> clientes;
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
        clientes = new ArrayList<Cliente>;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String d) {
        direccion = d;
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public String toString() {
        String totClientes = "";
        for(int i = 0; i < clientes.size(); i++) {
            totClientes +=  "    - " + clientes[i] + "\n"; 
        }

        return "Direccion: " + direccion + "\n" + "    Clientes:\n" + totClientes + "\n";
    }
}
