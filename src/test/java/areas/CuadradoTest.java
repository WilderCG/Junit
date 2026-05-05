package areas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void calcularAreaCuadrado() {
    Cuadrado cua1 = new Cuadrado(5.0);
    assertEquals(25.0, cua1.CalcularAreaCuadrado(), "Error, resultado no coincide");
    }

    @Test
    void getBase() {
        Cuadrado cua2 = new Cuadrado(5.0);
        assertEquals(5.0, cua2.getBase(), "Error, getBase no coincide");
    }

    @Test
    void setBase() {
        Cuadrado cua3 = new Cuadrado(5.0);
        cua3.setBase(10.0);
        assertEquals(10.0, cua3.getBase(), "Error, setBase no coincide");
    }
}