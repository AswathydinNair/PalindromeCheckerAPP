import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static boolean twoPointerCheck(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "madamimadam"; 

        long start1 = System.nanoTime();
        twoPointerCheck(str);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        stackCheck(str);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        dequeCheck(str);
        long end3 = System.nanoTime();

        System.out.println("Performance Comparison (nanoseconds)");
        System.out.println("Two Pointer Method: " + (end1 - start1));
        System.out.println("Stack Method: " + (end2 - start2));
        System.out.println("Deque Method: " + (end3 - start3));
    }
}