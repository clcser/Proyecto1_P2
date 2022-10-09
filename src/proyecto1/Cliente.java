package proyecto1;

class Cliente {
    private String nombre, rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
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
        return "\n    Nombre: " + nombre + "\n    Rut: " + rut 
                + "\n    Direccion: " + direccion.toString() + "\n";
    }
}
