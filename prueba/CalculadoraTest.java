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
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6.0, calculadora.multiplicar(2.0, 3.0));
    }

    @Test
    public void testMultiplicarPorCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.multiplicar(2.0, 0.0));
    }

    @Test
    public void testMultiplicarNegativoPorPositivo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-6.0, calculadora.multiplicar(-2.0, 3.0));
    }
}