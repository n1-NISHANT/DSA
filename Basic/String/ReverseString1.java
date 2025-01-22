package DSA.Basic.String;

import java.util.Scanner;
public class ReverseString1{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.nextLine();
    char[] str = temp.toCharArray();
    for(int i = str.length-1;i>=0;i--){
        System.out.print(str[i]);
    }
}
}
