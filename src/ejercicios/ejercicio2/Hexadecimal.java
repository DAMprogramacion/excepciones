package ejercicios.ejercicio2;

public class Hexadecimal implements Numero {
    private final String valorHexadecimal;

    public Hexadecimal(String valorHexadecimal) throws FormatoException {
        if (Helper.esHexadecimal(valorHexadecimal))
            this.valorHexadecimal = valorHexadecimal;
        else
            throw new FormatoException(valorHexadecimal + " no tiene formato correcto");
    }

    @Override
    public int valorDecimal() {
        double suma = 0;
        StringBuilder builder = new StringBuilder(valorHexadecimal);
        String valorReverse = builder.reverse().toString(); //011
        for (int i = 0; i < valorReverse.length(); i++) {
            char caracter = valorReverse.toLowerCase().charAt(i); // 0 1 1
            if (Character.isDigit(caracter))
                suma += Math.pow(16, i) * (caracter - 48);
            else
                suma += Math.pow(16, i) * (caracter - 87);
        }
        return (int) suma;
         //return Integer.parseInt(valorHexadecimal, 16);
    }

    public static void main(String[] args) throws FormatoException {
        System.out.println(new Hexadecimal("10").valorDecimal());
    }
}
