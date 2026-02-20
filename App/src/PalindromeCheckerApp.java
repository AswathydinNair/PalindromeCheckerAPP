import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input text");
        String Str=sc.nextLine();
        StringBuilder sb  = new StringBuilder();
        for(int i=Str.length()-1;i>=0;i--){
            sb.append(Str.charAt(i));
        }
       String reverse=sb.toString();
        if(Str.equals(reverse)){
            System.out.println("is it Palindrome? true");
        }
        else{
            System.out.println("Is it Palindrome? False");
        }
    }
}
