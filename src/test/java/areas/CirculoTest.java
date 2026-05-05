package areas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void calcularAreaCirculo() {
        Circulo c1 = new Circulo(4);
        assertEquals(Math.PI * 16, c1.CalcularAreaCirculo(), "error, resultado inesperado");
    }

    @Test
    void getRadio() {
        Circulo c2 = new Circulo(2);
        assertEquals(2, c2.getRadio(), "Error");
    }

    @Test
    void setRadio() {
        Circulo c3 = new Circulo(3);
        c3.setRadio(10);
        assertEquals(10, c3.getRadio(), "Error");
    }
}