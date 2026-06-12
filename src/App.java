import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("---Ejercicio 1:---");
        SingValidator validator = new SingValidator();
        String cadena = "({[]})";
        System.out.println("Cadena: " + cadena);
        System.out.println(validator.isValid(cadena));

        System.out.println("\n---Ejercicio 2:---");
        StackSorter sorter = new StackSorter();
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Original stack: " + stack);
        sorter.sortStack(stack);
        System.out.println("Sorted stack: " + stack);

        System.out.println("\n---Ejercicio 3:---");
        QueuePalindrome palindromeChecker = new QueuePalindrome();
        String palabra = "la ruta natural";
        System.out.println("Palabra: " + palabra);
        System.out.println("Resultado: " + palindromeChecker.isPalindrome(palabra));
    }
}
