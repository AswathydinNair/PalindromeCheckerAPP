import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text:");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is it Palindrome? " + isPalindrome);
    }
}