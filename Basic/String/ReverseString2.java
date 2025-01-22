package DSA.Basic.String;

import java.util.Scanner;
public class ReverseString2{
public static void main(String[] args) {
    String t;
    Scanner sc = new Scanner(System.in);
    t = sc.nextLine();
    char[] str = t.toCharArray();
    char temp = ' ';
    int len = str.length-1;
    String copy = "";
    for(int i = 0;i<str.length/2;i++){
        temp = str[i];
        str[i] = str[len-i];
        str[len-i] = temp;
    }
    for(int i = 0 ; i<str.length;i++){
        copy += str[i];
    }
    System.out.println(copy);
}
}
