// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        double num1=0;
        double num2=0;
        int opcion;
        do {
            System.out.println("La calculadora tiene las siguientes opciones:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.println("¿Qué opcion quieres realizar?: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.printf("Resultado: ", calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Introduce el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.printf("Resultado: ", calculadora.restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Introduce el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.printf("Resultado: ", calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Introduce el primer numero: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = scanner.nextDouble();
                    System.out.printf("Resultado: ", calculadora.dividir(num1, num2));
                    break;
                case 0:
                    System.out.println("¡Adios!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 0);
    }
}