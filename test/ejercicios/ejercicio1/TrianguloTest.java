package ejercicios.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @org.junit.jupiter.api.Test
    void esTriangulo() {
        assertTrue(Triangulo.esTriangulo(1, 1, 1));
        assertTrue(Triangulo.esTriangulo(5, 3, 4));
        assertFalse(Triangulo.esTriangulo(11, 1, 1));
        assertFalse(Triangulo.esTriangulo(0, 1, 1));
    }

    @Test
    void crearTriangulo() throws TrianguloException {
        assertDoesNotThrow(() -> Triangulo.crearTriangulo(1, 1, 1));
        TrianguloException e = assertThrows(TrianguloException.class,
                () -> Triangulo.crearTriangulo(11, 1, 1));
        assertEquals("Con esos lados no se puede formar un triángulo",
               e.getMessage());
    }
}