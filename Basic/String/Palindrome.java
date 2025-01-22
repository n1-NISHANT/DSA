package DSA.Basic.String;

import java.util.Scanner;
public class Palindrome{
public static void main(String[] args) {
    String t;
    Scanner sc = new Scanner(System.in);
    t = sc.nextLine();
    char[] str = t.toCharArray();
    char [] copy = new char[str.length];
    for(int i = 0;i<str.length;i++){
        copy[i]=str[i];
    }
    char temp = ' ';
    int len = str.length-1;
    for(int i = 0;i<str.length/2;i++){
        temp = str[i];
        str[i] = str[len-i];
        str[len-i]= temp;
    }
    boolean check = false;
    for(int i = 0; i<str.length;i++){
        if(copy[i]==str[i]){
            check = true;
        }else{
            check = false;
        }
    }
    if(check){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
}
}
