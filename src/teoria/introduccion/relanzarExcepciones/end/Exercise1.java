package teoria.introduccion.relanzarExcepciones.end;

import java.io.FileNotFoundException;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            Map<String, Peson> people = Helper.getPeople("files/peronas.csv");
            mostrarDatos(people);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());;
        }
    }

    private static void mostrarDatos(Map<String, Peson> people) {
        //ngoldbourn2c@howstuffworks.com -> Goldbourn, Nikaniki
    }
}
