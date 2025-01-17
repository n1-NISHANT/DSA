package DSA.Basic.Numbers;
import java.util.Scanner;

public class SumOfDigits{
public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
     int sum = 0;
    while(num>0){
        sum += num%10;
        num /=10;
    }
    System.out.println(sum);
}
}
