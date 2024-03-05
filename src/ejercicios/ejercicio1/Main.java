package ejercicios.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("files/triangulos.csv"))) {
            Triangulo triangulo;
            String posibleCabecera = sc.nextLine();
            /*if (! posibleCabecera.matches("[0-9].*")){
              //se omite la cabecera
            }
            else {
                String[] tokens =
            }
            while ()*/
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
