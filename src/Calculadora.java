/**
 * @author Marco
 */
public class Calculadora {
    /**
     *
     * @param a Variable de tipo númerico
     * @param b Variable de tipo númerico
     * @return Devuelve la resta de las variables
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     *
     * @param a Variable de tipo númerico
     * @param b Variable de tipo númerico
     * @return Devuelve la suma de las variables
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     *
     * @param a Variable de tipo númerico
     * @param b Variable de tipo númerico
     * @return Devuelve la division de las variables
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;

    }

    /**
     *
     * @param a Variable de tipo númerico
     * @param b Variable de tipo númerico
     * @return Devuelve la multiplicacion de las variables
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
}