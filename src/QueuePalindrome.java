import java.util.ArrayDeque;
import java.util.Deque;

public class QueuePalindrome {
    public boolean isPalindrome (String text) {

       Deque<Character> pila = new ArrayDeque<>();
       String cleaned = text.toLowerCase().replaceAll("", "");
        for (char letra : cleaned.toCharArray()) {
            pila.push(letra);
        }
        for (char letra : text.toCharArray()) {
            pila.push(letra);
        }
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.poll();
        }

        return text.equals(invertido);
        
    }
}
