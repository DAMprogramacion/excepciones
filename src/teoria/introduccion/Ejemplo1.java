package teoria.introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.FieldPosition;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) throws FileNotFoundException {
        int numerador = 3;
        int denominador = 0;
       // int operacion = numerador / denominador;
        System.out.println("Inicio de programa");
      //  System.out.printf("Resultado: %d%n", operacion);
     //   Scanner sc = new Scanner(new File("files/dato.txt"));

        try {
            Scanner sc = new Scanner(new File("files/dato.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("No existe el fichero");
           // throw new RuntimeException("No existe el fichero");
        }
        System.out.println("Fin de programa");
    }
}
