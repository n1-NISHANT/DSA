package DSA.Basic.String;

import java.util.Scanner;
public class EnableNthBit{
public static void main(String[] args) {
    int num, n;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    n = sc.nextInt();
    System.out.println(num|(1<<n-1));
}
}
