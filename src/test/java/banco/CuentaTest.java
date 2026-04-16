package banco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void getNumero() {
    }

    @Test
    void setNumero() {
    }

    @Test
    void getSaldo() {
        Cuenta c1 = new Cuenta("ES1234561234", 100);
        float saldito = c1.getSaldo();
        assertEquals(100,c1.getSaldo(), "eres mu tonta");

    }

    @Test
    void setSaldo() {
    }

    @Test
    void ingresarDinero() {
    }

    @Test
    void extraerDinero() {
    }

    @Test
    void mostrarCuenta() {
    }
}