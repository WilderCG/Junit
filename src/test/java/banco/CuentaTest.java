package banco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    private Cuenta c1;

    @BeforeEach
    public void creaCuenta() {
         c1 = new Cuenta("ES1234561234", 100);
    }

    @Test
    void getSaldo() {
        assertEquals(100, c1.getSaldo(), "eres mu tonta");

    }

    @Test
    void setSaldo() {
        c1.setSaldo(150);
        assertEquals(150, c1.getSaldo(), "Saldo incorrecto");
    }

    @Test
    void ingresarDinero() {
        c1.ingresarDinero(100);
        assertEquals(200, c1.getSaldo(), "error, saldo no coincide");
    }

    @Test
    void extraerDinero() {
        c1.extraerDinero(10);
        assertEquals(90, c1.getSaldo(), "Error, saldo no coincide");
        assertThrows(ArithmeticException.class, () -> c1.extraerDinero(500), "No va la excepción");
    }
}