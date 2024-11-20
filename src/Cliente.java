public class Cliente {
    private String nombre;
    private String identificacion;

    // Constructor
    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
    }
}
