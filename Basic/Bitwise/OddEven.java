package DSA.Basic.String;

import java.util.Scanner;
public class oddEven{
public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    if((num&1)==0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
}
}
