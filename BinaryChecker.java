public class BinaryChecker {
    public static void main(String[] args) {
        // Numero binario a verificar
        int number = 101010;

        if (isBinary(number)) {
            System.out.println(number + " es un número binario.");
        } else {
            System.out.println(number + " no es un número binario.");
        }
    }

    public static boolean isBinary(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}