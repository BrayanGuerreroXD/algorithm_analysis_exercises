import java.util.Scanner;

public class ReverseDisplayInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int value = scanner.nextInt();
        scanner.close();

        System.out.print("Número invertido: ");
        reverseDisplayInteger(value);
    }

    // Metodo que muestra de forma invertida un número entero
    public static void reverseDisplayInteger(int value) {
        if (value < 10) {
            System.out.print(value);
        } else {
            System.out.print(value % 10);
            reverseDisplayInteger(value / 10);
        }
    }
}