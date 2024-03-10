import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5.0, calculadora.sumar(2.0, 3.0));
    }

    @Test
    public void testSumarConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-1.0, calculadora.sumar(2.0, -3.0));
    }

    @Test
    public void testSumarConCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.sumar(2.0, 0.0));
    }
}