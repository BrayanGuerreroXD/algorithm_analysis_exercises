import java.util.Scanner;

public class FactorialRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int factorial = calcularFactorial(n);
        
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
    
    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}