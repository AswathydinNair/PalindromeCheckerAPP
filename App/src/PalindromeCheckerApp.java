import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

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
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text:");
        String str = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(str);

        if (result) {
            System.out.println("Is it Palindrome? true");
        } else {
            System.out.println("Is it Palindrome? false");
        }

        sc.close();
    }
}