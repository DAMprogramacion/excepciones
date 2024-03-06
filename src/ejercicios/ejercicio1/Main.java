package ejercicios.ejercicio1;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Triangulo> triangulos = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("files/triangulos.csv"))) {
            String linea = sc.nextLine();
            if (! linea.matches("[0-9].*")){
                System.out.println("Omitiendo cabecera.....");
            }
            else {
                //47,09,02
                Triangulo triangulo = null;
                try {
                    triangulo = getTriangulo(linea);
                    triangulos.add(triangulo);
                } catch (TrianguloException e) {
                    System.err.println(e.getMessage());
                }

            }
           while (sc.hasNextLine()) {
               linea = sc.nextLine();
               Triangulo triangulo = null;
               try {
                   triangulo = getTriangulo(linea);
                   triangulos.add(triangulo);
               } catch (TrianguloException e) {
                   System.err.println(e.getMessage());
               }

           }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } /*catch (TrianguloException e) {
            System.err.println(e.getMessage());
        }*/
        System.out.printf("Nº triángulo creados %d%n", triangulos.size());

    }

    @NotNull
    private static Triangulo getTriangulo(String linea) throws TrianguloException {
        String[] tokens = linea.split(",");
        int lado1 = Integer.parseInt(tokens[0]);
        int lado2 = Integer.parseInt(tokens[1]);
        int lado3 = Integer.parseInt(tokens[2]);
        Triangulo triangulo = Triangulo.crearTriangulo(lado1, lado2, lado3);
        return triangulo;
    }
}
