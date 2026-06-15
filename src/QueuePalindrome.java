import java.util.ArrayDeque;
import java.util.Deque;

public class QueuePalindrome {
    public boolean isPalindrome (String text) {

        
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> pila = new ArrayDeque<>();
        
       for (char letra : cleaned.toCharArray()) {
            pila.push(letra);
        }
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.poll();
        }

        return cleaned.equals(invertido);
        
    }
}
