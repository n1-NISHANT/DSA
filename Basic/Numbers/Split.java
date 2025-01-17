package DSA.Basic.Numbers;
import java.util.Scanner;

public class Split{
public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    while(num>0){
       System.out.println(num%10);
       num /=10;
    }
}
}
