package DSA.Basic.String;

import java.util.Scanner;
public class CheckNthBit{
public static void main(String[] args) {
    int num, n;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    n = sc.nextInt();
    if((num & (1<<n-1))== 0){
        System.out.println("OFF");
    }else{
        System.out.println("ON");
    }
}
}
