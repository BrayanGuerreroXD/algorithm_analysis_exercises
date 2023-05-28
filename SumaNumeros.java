public class SumaNumeros {
    public static void main(String[] args) {
        // Número hasta el cual se calculará la suma (Se puede cambiar obvio)
        int n = 5;
        int resultado = calcularSumaNumeros(n);
        System.out.println("La suma de los números desde 1 hasta " + n + " es: " + resultado);
    }
    
    public static int calcularSumaNumeros(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calcularSumaNumeros(n - 1);
        }
    }
}