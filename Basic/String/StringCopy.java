package DSA.Basic.String;

import java.util.Scanner;
public class StringCopy{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.nextLine();
    char[] str = temp.toCharArray();
    String copy = "";
    
    for(int i =0;i<str.length;i++){
        copy += str[i];
    }
    System.out.println("Copied string = "+copy);
}
}
