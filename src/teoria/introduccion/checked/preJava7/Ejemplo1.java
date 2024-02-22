package teoria.introduccion.checked.preJava7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(new File("files/datos.txt"));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            //System.out.println("El fichero no existe");
        } finally {
            System.out.println("Cerrando flujos...");
            if (sc != null)
                sc.close();
        }

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("files/dato.txt"));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Cerrando flujos...");
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }


    }
}
