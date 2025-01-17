package DSA.Basic.Numbers;
import java.util.Scanner;

public class SumOfNatural{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Num = sc.nextInt();
    int sum = 0;
    for(int i = 1 ; i<=Num ;i++){
        sum +=i;
    }
    System.out.println(sum);
}
}

