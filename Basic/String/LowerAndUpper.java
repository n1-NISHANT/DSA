package DSA.Basic.String;

import java.util.Scanner;

public class LowerAndUpper{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.nextLine();
    char[] str = temp.toCharArray();
   String check = "";
    for(int i =0;i<str.length;i++){
        if(str[i]>='A'&& str[i]<='Z'){
            check +=(char)(str[i]+32);
        }else if(str[i]>='a'&& str[i]<='z'){
            check += (char)(str[i]-32);
        }
    }
    System.out.println(check);
}
}
