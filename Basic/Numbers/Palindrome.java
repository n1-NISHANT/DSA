package DSA.Basic.Number;
import java.util.Scanner;

public class Palindrome{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int rev = 0;
    int check = num;
    while(check>0){
        int mod = check%10;
        rev = rev*10+mod;
        check /= 10;
    }
        if(num == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
}
}
