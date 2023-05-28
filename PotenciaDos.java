public class PotenciaDos {
    public static void main(String[] args) {
        // Número para calcular la potencia de 2^n (Se puede cambiar obvio)
        int n = 5;
        int resultado = calcularPotenciaDos(n);
        System.out.println("2 elevado a la " + n + " es: " + resultado);
    }
    
    public static int calcularPotenciaDos(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * calcularPotenciaDos(n - 1);
        }
    }
}