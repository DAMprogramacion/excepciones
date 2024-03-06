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
        return Integer.parseInt(valorHexadecimal, 16);
    }

    /*public static void main(String[] args) {
        System.out.println(new Hexadecimal("1f").valorDecimal());
    }*/
}
