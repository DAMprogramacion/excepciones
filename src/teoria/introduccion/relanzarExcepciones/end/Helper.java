package teoria.introduccion.relanzarExcepciones.end;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Helper {
    public static Map<String, Peson> getPeople(String path) throws FileNotFoundException {
        Map<String, Peson> people = new HashMap<>();
        //abrimos scanner
        Scanner sc = new Scanner(new File(path));
        //código
        sc.close();
        return people;
    }
}
