package ejercicios.ejercicio2;

public class Helper {
    public static boolean esBinario(String valor) {
        return valor.matches("[01]+");
    }

    public static boolean esHexadecimal(String valor) {
        return valor.toLowerCase().matches("[0-9a-f]+");
    }
    public static void main(String[] args) {
        System.out.println(esBinario(""));
        System.out.println(esHexadecimal("1a23Fg"));
    }
}
