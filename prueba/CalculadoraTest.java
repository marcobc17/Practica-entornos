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