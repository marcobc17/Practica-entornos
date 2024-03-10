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
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.dividir(6.0, 3.0));
    }

    @Test
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.dividir(6.0, 0.0));
    }

    @Test
    public void testDividirNegativoPorPositivo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-2.0, calculadora.dividir(-6.0, 3.0));
    }
}