package areas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    private Rectangulo r1;

    @BeforeEach
    public void crearRectangulo(){
        r1 = new Rectangulo(10.0, 10.0);
    }

    @Test
    void calcularAreaRectangulo() {
        assertEquals(100, r1.CalcularAreaRectangulo(), "Error");
    }

    @Test
    void sonLadosIguales() {
        assertTrue(r1.sonLadosIguales(),
                "Los lados no son iguales");
    }

    @Test
    void getBase() {
        assertEquals(10.0, r1.getBase(), "Error");
    }

    @Test
    void setBase() {
        r1.setBase(11);
        assertEquals(11.0, r1.getBase(),"Error");
    }

    @Test
    void getAltura() {
    }

    @Test
    void setAltura() {
    }
}