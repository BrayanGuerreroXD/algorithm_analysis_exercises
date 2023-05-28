public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "((2+3)*4)"; // Expresión que deseas verificar

        if (isBalanced(expression)) {
            System.out.println("La expresión tiene paréntesis balanceados.");
        } else {
            System.out.println("La expresión no tiene paréntesis balanceados.");
        }
    }

    public static boolean isBalanced(String expression) {
        return isBalancedHelper(expression, 0, 0);
    }

    private static boolean isBalancedHelper(String expression, int index, int count) {
        if (count < 0) {
            return false; // Hay más paréntesis de cierre que de apertura, no están balanceados
        }
        if (index >= expression.length()) {
            return count == 0; // Si se llega al final de la expresión, están balanceados si count es 0
        }

        char currentChar = expression.charAt(index);
        if (currentChar == '(') {
            return isBalancedHelper(expression, index + 1, count + 1); // Paréntesis de apertura, incrementar count
        } else if (currentChar == ')') {
            return isBalancedHelper(expression, index + 1, count - 1); // Paréntesis de cierre, decrementar count
        }

        return isBalancedHelper(expression, index + 1, count); // Otros caracteres, seguir verificando sin modificar count
    }
}