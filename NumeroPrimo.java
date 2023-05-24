public class NumeroPrimo {
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numero = 17;
        boolean resultado = esPrimo(numero);
        System.out.println("El número " + numero + " es primo? " + resultado);
    }
}