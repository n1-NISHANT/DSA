package DSA.Basic.Numbers;
import java.utiil.Scanner;

public class Reverse{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int ans = 0;
    while(num>0){
        int mod = num%10;
        ans = ans*10 + mod;
        num /=10;
    }
    System.out.println(ans);
}
}
