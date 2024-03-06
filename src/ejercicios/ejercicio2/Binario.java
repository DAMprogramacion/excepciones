package ejercicios.ejercicio2;

public class Binario implements Numero{
    private final String valorBinario;

    public Binario(String valorBinario) throws FormatoException {
        if (Helper.esBinario(valorBinario))
            this.valorBinario = valorBinario;
        else
            throw new FormatoException(valorBinario + " no tiene formato correcto");
    }

    @Override
    public int valorDecimal() {
        //110 2⁰ * 0 + 2¹ * 1 + 2² * 1 = 6
        /*double suma = 0;
        StringBuilder builder = new StringBuilder(valorBinario);
        String valorReverse = builder.reverse().toString(); //011
        for (int i = 0; i < valorReverse.length(); i++) {
            char caracter = valorReverse.charAt(i); // 0 1 1
            if (caracter == '1')
                suma += Math.pow(2, i);
        }
        return (int) suma;*/
        return Integer.parseInt(valorBinario, 2);
    }

    public static void main(String[] args) throws FormatoException {
        System.out.println(new Binario("1011a").valorDecimal());
    }
}
