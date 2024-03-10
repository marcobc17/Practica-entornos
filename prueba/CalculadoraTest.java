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
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.restar(5.0, 3.0));
    }

    @Test
    public void testRestarConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-5.0, calculadora.restar(-2.0, 3.0));
    }

    @Test
    public void testRestarConCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.restar(2.0, 0.0));
    }

}
