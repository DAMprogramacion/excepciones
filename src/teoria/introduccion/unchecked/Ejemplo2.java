package teoria.introduccion.unchecked;

public class Ejemplo2 {
    public static void main(String[] args) {
        //primero: hay que comprobar que hay al menos un argumento
        if (args.length < 1) {
            System.out.println("Faltan argumentos");
            return;
        }
        if ( ! args[0].matches("[0-9]+")) {
            System.out.println("El  argumento no es un nº entero");
            return;
        }
        //segundo: el argumento debe ser un nº entero
        int valor = Integer.parseInt(args[0]);
        System.out.printf("El valor doble de %s vale %d%n", args[0], valor * 2);
    }
}
