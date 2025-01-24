package DSA.Basic.String;

import java.util.Scanner;
public class FindEqualOrNot{
public static void main(String[] args) {
    int num1, num2;
    
    Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if((num1 ^ num2)==0){
        System.out.println("Equal");
    }else{
        System.out.println("Unequal");
    }
}
}
