package teoria.introduccion.relanzarExcepciones.end;

public record Person(String firstName, String lastName) {
    @Override
    public String toString() {
        return String.format("%S, %S", lastName, firstName);
    }
}
