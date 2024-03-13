import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * @author Marco
 */
class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Se utiliza el test sumar y se crea una calculadora con numeros positivos
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5.0, calculadora.sumar(2.0, 3.0));
    }
    /**
     * Se utiliza el test sumar y se crea una calculadora con numeros negativos
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testSumarConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-1.0, calculadora.sumar(2.0, -3.0));
    }
    /**
     * Se utiliza el test sumar y se crea una calculadora con numeros con cero
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testSumarConCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.sumar(2.0, 0.0));
    }
    @Test
/**
 * Se utiliza el test restar y se crea una calculadora con numeros positivos
 * y con una expectativa del resultado y luego el resultado real
 */
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.restar(5.0, 3.0));
    }
    /**
     * Se utiliza el test restar y se crea una calculadora con numeros negativos
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testRestarConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-5.0, calculadora.restar(-2.0, 3.0));
    }
    /**
     * Se utiliza el test restar y se crea una calculadora con numeros con cero
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testRestarConCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.restar(2.0, 0.0));
    }
    /**
     * Se utiliza el test dividir y se crea una calculadora con numeros positivos
     * y con una expectativa del resultado y luego el resultado real
     */
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.dividir(6.0, 3.0));
    }
    /**
     * Se utiliza el test dividir y se crea una calculadora con numeros por cero
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.dividir(6.0, 0.0));
    }
    /**
     * Se utiliza el test dividir y se crea una calculadora con numeros positivos y negativos
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testDividirNegativoPorPositivo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-2.0, calculadora.dividir(-6.0, 3.0));
    }
    @Test
    /**
     * Se utiliza el test multiplicar y se crea una calculadora con numeros positivos
     * y con una expectativa del resultado y luego el resultado real
     */
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6.0, calculadora.multiplicar(2.0, 3.0));
    }
    /**
     * Se utiliza el test multiplicar y se crea una calculadora con numeros por cero
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testMultiplicarPorCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.multiplicar(2.0, 0.0));
    }
    /**
     * Se utiliza el test multiplicar y se crea una calculadora con numeros positivos y negativos
     * y con una expectativa del resultado y luego el resultado real
     */
    @Test
    public void testMultiplicarNegativoPorPositivo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-6.0, calculadora.multiplicar(-2.0, 3.0));
    }
}