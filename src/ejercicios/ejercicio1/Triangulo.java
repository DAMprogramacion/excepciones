package ejercicios.ejercicio1;


public class Triangulo {
    private final int lado1;
    private final int lado2;
    private final int lado3;

    private Triangulo(int lado1, int lado2, int lado3) throws TrianguloException {
        if (esTriangulo(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new TrianguloException("Con esos lados no se puede formar un triángulo");
        }
    }

    public final int getLado1() {
        return lado1;
    }

    public final int getLado2() {
        return lado2;
    }

    public final int getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return String.format("Triángulo: %d, %d y %d de lado %n",
                lado1, lado2, lado3);
    }
    public static boolean esTriangulo (int lado1, int lado2, int lado3){
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2
                && lado2 + lado3 > lado1;
    }
    public static Triangulo crearTriangulo (int lado1, int lado2, int lado3) throws TrianguloException {
        return new Triangulo(lado1, lado2, lado3);
    }
}
