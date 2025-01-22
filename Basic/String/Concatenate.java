package DSA.Basic.String;

import java.util.Scanner;
public class Concatenate{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.nextLine();
    char[] str1 = temp.toCharArray();
    temp = sc.nextLine();
    char[] str2 = temp.toCharArray();

    String concat = "";
    for(int i = 0 ; i<str1.length;i++){
        concat += str1[i];
    }
    for(int i = 0 ; i<str2.length;i++){
        concat += str2[i];
    }
    System.out.println(concat);
}
}
