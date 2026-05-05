package areas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {


    private Triangulo t1;

    @BeforeEach
    public void crearTriangulo (){
        t1 = new Triangulo(10.0, 10.00);
    }

    @Test
    void calcularAreaTriangulo() {
        assertEquals(50.00, t1.CalcularAreaTriangulo(),"datos no coinciden");
    }

    @Test
    void getBase() {
        assertEquals(10.00, t1.getBase(), "error");
    }

    @Test
    void setBase() {
        t1.setBase(20.00);
        assertEquals(20.00, t1.getBase(),"Error");
    }

    @Test
    void getAltura() {
        assertEquals(10.00, t1.getAltura(),"Error");
    }

    @Test
    void setAltura() {
        t1.setAltura(20.00);
        assertEquals(20.00, t1.getAltura(),"Error");
    }
}