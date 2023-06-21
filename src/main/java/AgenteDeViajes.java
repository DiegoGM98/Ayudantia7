public class AgenteDeViajes {
    private String nombre;
    private String apellido;
    private String email;
    // Otros atributos relevantes para el agente de viajes

    public AgenteDeViajes(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // Getters y setters para todos los atributos del agente de viajes
    // ...

    @Override
    public String toString() {
        return "AgenteDeViajes{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



