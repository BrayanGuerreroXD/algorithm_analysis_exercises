import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String str = scanner.nextLine();

        System.out.print("Ingresa un carácter: ");
        char a = scanner.nextLine().charAt(0);

        scanner.close();

        int count = count(str, a);
        System.out.println("Número de ocurrencias del carácter en la cadena: " + count);
    }

    public static int count(String str, char a) {
        if (str.length() == 0) {
            return 0; // Caso base: cadena vacía, no hay ocurrencias
        } else {
            char firstChar = str.charAt(0);
            int count = count(str.substring(1), a); // Llamada recursiva con la subcadena sin el primer carácter
            if (firstChar == a) {
                count++; // Si el primer carácter coincide con el carácter especificado, incrementar el contador
            }
            return count;
        }
    }
}