package proyecto1;

public class Cliente {
    private String nombre, rut;

    public Cliente() {
        nombre = null;
        rut = null;
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

    public String toString() {
        return "Nombre del cliente: " + nombre + ". Rut: " + rut;

    }
}

public class Direccion {
    private String direccion;

    public Direccion() {}

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String d) {
        direccion = d;
    }

    public String toString() {
        return "Direccion: " + direccion;
    }
}
