package teoria.introduccion.relanzarExcepciones.inicial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        //abrir el scanner que apunte a personas.csv
        try (Scanner sc = new Scanner(new File("files/personas.csv"))) {
            System.out.println("Fichero abierto...");
            //vamos a leer los datos, la cabecera aparte
            String cabecera = sc.nextLine();
            System.out.printf("Cabecera: %S%n", cabecera);
            System.out.println("===========================");
            while (sc.hasNextLine()) {
                String sPersona = sc.nextLine();
              //  System.out.printf("LEIDO: %s%n", sPersona);
                //Anallise,Coverlyn,acoverlyn5e@thetimes.co.uk
                String[] tokens = sPersona.split(",");
             //   System.out.printf("EMAIL: %S%n", tokens[2]);
                //a partir de la cabecera hay que crear objetos
                Persona persona = new Persona(
                        tokens[0].toLowerCase(), tokens[1].toLowerCase(), tokens[2]);
              // System.out.println(persona);
                //guardarlo en una lista de objetos Persona
                personas.add(persona);

            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        //crear una lista ordenada alfabeticamente por el primer apellido
        List<Persona> personasOrdenasAlfabeticamenPorApellido = personas.stream()
                .sorted(Comparator.comparing(Persona::lastName))
                .collect(Collectors.toList());
        //mostramos la lista
        personasOrdenasAlfabeticamenPorApellido.forEach(System.out::println);

        String dominio = "edu";
        List<Persona> personasPorDominio =
                obtenerListaPersonasPorDominio(personas, dominio);
        System.out.println("======personas por dominio========");
        personasPorDominio.forEach(System.out::println);

        System.out.println("==========personas que empiezan por vocal===============");
        int numeroPersonasQueApellidoEmpienzanPorVocal =
                calucarPersonasQueApellidoEmpienzanPorVocal(personas);
        System.out.printf("Nº persona que su apellido empiezan por vocal: %d%n",
                numeroPersonasQueApellidoEmpienzanPorVocal);

    }

    private static int calucarPersonasQueApellidoEmpienzanPorVocal(List<Persona> personas) {
        return (int) personas.stream()
                .filter(persona -> persona.lastName().toUpperCase().matches("[AEIOU].*"))
                .peek(persona -> System.out.println(persona))
                .count();
    }

    private static List<Persona> obtenerListaPersonasPorDominio(
            List<Persona> personas, String dominio) {

        return personas.stream()
                .filter(persona -> persona.email().endsWith(dominio))
                .toList();
    }
}
