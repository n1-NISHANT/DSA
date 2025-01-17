package DSA.Basic.Numbers;
import java.util.Scanner;

public class Factor{
public static void main(String[] args) {
    int N, X;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    X = sc.nextInt();
    if(N%X==0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}

