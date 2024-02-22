package teoria.introduccion.unchecked;

import java.util.Random;

public class Ejemplo4 {
    public static void main(String[] args) {
        int[] datos = new Random()
                .ints(0,350)
                .limit(20)
                .toArray();

        int posicion = -1, intentos = 0;
        do {
            posicion = new Random().nextInt(1_000);
            intentos++;
        } while (posicion > datos.length - 1);
        System.out.printf("Valor de la posición %d es %d%n", posicion, datos[posicion]);
        System.out.printf("Nº intentos: %d%n", intentos);

        /*if (posicion < 20 )
            System.out.printf("Valor de la posición %d es %d%n", posicion, datos[posicion]);
        else
            System.out.printf("La posición %d no existe%n", posicion);*/
    }
}
