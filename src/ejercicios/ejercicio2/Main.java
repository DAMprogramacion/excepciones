package ejercicios.ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Numero> hexadecimales = new ArrayList<>();
        Path myPath = Paths.get("files/hexadecimal.txt");
        try {
            List<String> lineas = Files.readAllLines(myPath);
            for (String linea : lineas) {
                try {
                    hexadecimales.add(Numero.crearNumero(linea, SistemaNumerico.HEXADECIMAL));
                } catch (FormatoException e) {
                    System.err.println(e.getMessage());;
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }
        System.out.printf("Nº de hexadecimales %d, su suma vale %d %n",
                hexadecimales.size(), Numero.sumaEnteraDeValores(hexadecimales));
    }
}
