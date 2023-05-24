public class SubcadenaCount {
    public static int contarSubcadena(String cadena, String subcadena) {
        int count = 0;
        int cadenaLength = cadena.length();
        int subcadenaLength = subcadena.length();

        for (int i = 0; i <= cadenaLength - subcadenaLength; i++) {
            boolean match = true;

            for (int j = 0; j < subcadenaLength; j++) {
                if (cadena.charAt(i + j) != subcadena.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String cadena = "abcdabcabcabc";
        String subcadena = "abc";
        int resultado = contarSubcadena(cadena, subcadena);
        System.out.println("El número de veces que la subcadena \"" + subcadena + "\" aparece en la cadena \"" + cadena + "\" es: " + resultado);
    }
}