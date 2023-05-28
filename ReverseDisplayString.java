import java.util.Scanner;

public class ReverseDisplayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        scanner.close();

        System.out.print("Cadena invertida: ");
        reverseDisplayString(cadena);
    }

    public static void reverseDisplayString(String cadena) {
        if (cadena.length() == 0) {
            return;
        } else {
            reverseDisplayString(cadena.substring(1));
            System.out.print(cadena.charAt(0));
        }
    }
}