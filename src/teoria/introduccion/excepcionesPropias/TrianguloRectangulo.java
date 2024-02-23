package teoria.introduccion.excepcionesPropias;
//excepciones propias
import java.io.IOException;

public final class TrianguloRectangulo {
    private final double cateto1;
    private  final double cateto2;
    private  final double hipotenusa;   //nos obligan a trabajar con este atributo

    public TrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) throws TrianguloRectanguloException {
        if ( esTrianguloRectangulo(cateto1, cateto2, hipotenusa)) {
            this.cateto1 = cateto1;
            this.cateto2 = cateto2;
            this.hipotenusa = hipotenusa;
        } else {
            String message = String.format("Valores no válidos: %.1f; %.1f; %.1f%n",
                    cateto1, cateto2, hipotenusa);
            throw new TrianguloRectanguloException(message);
        }
    }

    public  final double getCateto1() {
        return cateto1;
    }

    public final double getCateto2() {
        return cateto2;
    }

    public  final double getHipotenusa() {
        return hipotenusa;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CATETO1: ").append(cateto1).append('\n');
        builder.append("CATETO2: ").append(cateto2).append('\n');
        builder.append("HIPOTENUSA: ").append(hipotenusa).append('\n');
        return builder.toString();
    }
    private static boolean esTrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) {
        return Math.hypot(cateto1, cateto2) == hipotenusa;
    }






}
