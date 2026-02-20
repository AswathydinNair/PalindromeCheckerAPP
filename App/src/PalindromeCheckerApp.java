import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input text:");
        String Str=sc.nextLine();
        int left=0;
        int right=Str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(Str.charAt(left)!=Str.charAt(right)){
                isPalindrome=false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Is it a Palindrome? : true");
        }
        else{
            System.out.println("Is it a Palindrome? : False");
        }
    }
}
