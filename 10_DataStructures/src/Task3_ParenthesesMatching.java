
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3_ParenthesesMatching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<Character> deck = new ArrayDeque<>();
        Deque<Character> stack = new ArrayDeque<>();

        String str = sc.nextLine();

        //add character
        for (char a : str.toCharArray()) {
            if (a == '(' || a == ')' || a == '{' || a == '}' || a == '[' || a == ']') {
                deck.push(a);
            }
        }

        stack.push(deck.pop());

        for (int i = 0; i < str.length(); i++) {
            if (deck.peek() == ')' && !stack.isEmpty()) {
                if (deck.peek() == '(') {
                    stack.pop();
                }
            } else if (deck.peek() == ']' && !stack.isEmpty()) {
                if (deck.peek() == '[') {
                    stack.pop();
                }
            } else if (deck.peek() == '}' && !stack.isEmpty()) {
                if (deck.peek() == '{') {
                    stack.pop();
                }
            } else {
                stack.push(deck.pop());
            }
        }

        while (!deck.isEmpty() && !stack.isEmpty()) {
            System.out.println(false);
            break;
        }

    }

}
