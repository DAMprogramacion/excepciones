package teoria.introduccion.relanzarExcepciones.end;

public record Peson(String firstName, String lastName) {
    @Override
    public String toString() {
        return String.format("%S, %S", lastName, firstName);
    }
}
