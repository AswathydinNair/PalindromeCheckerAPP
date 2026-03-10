import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("Input text:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is it Palindrome? true");
        } else {
            System.out.println("Is it Palindrome? false");
        }

        sc.close();
    }
}