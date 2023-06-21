public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    // Otros atributos relevantes para el cliente

    public Cliente(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters y setters para todos los atributos del cliente
    // ...

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
