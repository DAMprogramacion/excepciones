package teoria.introduccion.relanzarExcepciones.inicial;

//first_name,last_name,email
public record Persona(String firstName, String lastName, String email) {
    @Override
    public String toString() {
        return String.format("%s %s, %s", firstName, lastName, email);
    }
}
