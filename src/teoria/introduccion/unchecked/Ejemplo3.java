package teoria.introduccion.unchecked;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        //solicitamos por Scanner un número
        //comprobar que introducimos un nº entero
        //sino lo es, le pedimos al usuario que vuelva a introducirlo
        //así hasta que atine
        //mostramos por pantalla el doble de ese valor

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Introduce un nº entero");
        int valor = sc.nextInt();  //donde puede saltar la excepción
        System.out.printf("El valor doble de %d vale %d%n", valor, valor * 2);*/

        String sValor = "";
        do {
            System.out.println("Introduce un nº entero");
            sValor = sc.nextLine();
        } while (! sValor.matches("[0-9]+"));
        sc.close();
        int iValor = Integer.parseInt(sValor);
        System.out.printf("El valor doble de %d vale %d%n", iValor, iValor * 2);


    }
}
