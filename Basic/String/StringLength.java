package DSA.Basic.String;

import java.util.Scanner;
public class StringLength{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.nextLine();
    
    char[] str = temp.toCharArray();
     System.out.println(str.length);
}
}
  
