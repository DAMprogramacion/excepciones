package teoria.introduccion.relanzarExcepciones.end;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Helper {
    public static Map<String, Person> getPeople(String path) throws FileNotFoundException {
        Map<String, Person> people = new HashMap<>();  //diccinario vacío
        //abrimos scanner
        Scanner sc = new Scanner(new File(path));
        //código:  ngoldbourn2c@howstuffworks.com -> new Person(Nikaniki,Goldbourn)
        String head =  sc.nextLine();   //obviamos la cabecera
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            //Nikaniki,Goldbourn,ngoldbourn2c@howstuffworks.com  hay que trocearlo
            String[] tokens = line.split(",");
            String firstName = tokens[0];
            String lastaName = tokens[1];
            String email     = tokens[2];
            Person person = new Person(firstName, lastaName);
            people.put(email, person);
        }
        sc.close();
        return people;
    }
}
