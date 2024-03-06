package ejercicios.ejercicio2;

import java.util.List;

public interface Numero {
    int valorDecimal();
    static Numero crearNumero(String valor, SistemaNumerico sistemaNumerico ) throws FormatoException {
        switch (sistemaNumerico) {
            case BINARIO -> {return new Binario(valor);}
            case HEXADECIMAL -> { return new Hexadecimal(valor);}
            default -> {return null;}
        }

    }

    static long sumaEnteraDeValores(List<Numero> numeros) {
        long suma = 0;
        for (Numero numero : numeros){
            suma += numero.valorDecimal();
        }
        return suma;
    }
}
