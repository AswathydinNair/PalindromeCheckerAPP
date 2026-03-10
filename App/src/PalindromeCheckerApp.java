import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Input text:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        if (str.equals(reversed)) {
            System.out.println("Is it Palindrome? true");
        } else {
            System.out.println("Is it Palindrome? false");
        }
        sc.close();
    }
}