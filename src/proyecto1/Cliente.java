package proyecto1;

class Cliente {
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
        return rut;
    }

    public void setRut(String r) {
        rut = r;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(String d) {
        direccion.setDireccion(d);
    }

    public String toString() {
        return "Nombre del cliente: " + nombre + ". Rut: " + rut + ". " + direccion.toString();
    }
}

class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

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
