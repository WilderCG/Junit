package Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    void testSuma() {
// Al usar Maven y JUnit 5, usamos assertEquals de Assertions
        assertEquals(5, Calculadora.suma(2, 3), "La suma debe ser 5");
    }
    @Test
    void testResta() {
        assertEquals(1, Calculadora.resta(3, 2));
    }
}