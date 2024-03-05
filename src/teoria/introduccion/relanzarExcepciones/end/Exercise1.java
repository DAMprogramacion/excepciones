package teoria.introduccion.relanzarExcepciones.end;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Optional;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            Map<String, Person> people = Helper.getPeople("files/personas.csv");
           // showData(people);
            String email = "ngoldbourn2c@howstuffworks.co";
            /*Person foundPerson =  foundPersonByEmail(people, email);
            if (foundPerson != null)
                System.out.printf("%s : %s%n", email, foundPerson.lastName());
            else
                System.out.printf("Don't exist person with email %s%n", email);*/
            Optional<Person> foundPerson =  foundPersonByEmail(people, email);
            if (foundPerson.isPresent())
                System.out.printf("%s : %s%n", email, foundPerson.get().lastName());
            else
                System.out.printf("Don't exist person with email %s%n", email);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());;
        }
    }



    /*private static Person foundPersonByEmail(Map<String, Person> people, String email) {
            return people.get(email);
    }*/
    private static Optional<Person> foundPersonByEmail(Map<String, Person> people, String email) {
            if (people.containsKey(email))
                return Optional.of(people.get(email));
            return Optional.empty();
    }

    private static void showData(Map<String, Person> people) {
        //ngoldbourn2c@howstuffworks.com -> Goldbourn, Nikaniki
        /*Iterator<String> iterator = people.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.printf("%s -> %s%n", key, people.get(key));
        }*/

        /*for (Map.Entry<String, Peson> entry : people.entrySet())
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());*/

        /*Set<String> keys = people.keySet();
        for (String key : keys)
            System.out.printf("%s -> %s%n", key, people.get(key));*/

        people.forEach( (k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}
