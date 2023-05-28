import java.io.File;

public class TamanioCarpetaRecursiva {
    public static void main(String[] args) {
        // Ruta de la carpeta seleccionada para calcularle el tamaño
        String rutaCarpeta = "ruta_de_la_carpeta";
        long tamano = calcularTamanoCarpetaRecursiva(new File(rutaCarpeta));
        System.out.println("El tamaño de la carpeta es: " + tamano + " bytes");
    }

    // Funcion recursiva para calcular tamaño de una carpeta
    public static long calcularTamanoCarpetaRecursiva(File carpeta) {
        long tamano = 0;
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    tamano += archivo.length();
                } else if (archivo.isDirectory()) {
                    tamano += calcularTamanoCarpetaRecursiva(archivo);
                }
            }
        }
        return tamano;
    }
}