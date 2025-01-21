package DSA.Basic.String;

import java.util.Scanner;
public class CountVowels{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.next();
    char[] str = temp.toCharArray();
    int count = 0;
    for(int i =0;i<str.length;i++){
        if(str[i]=='A'||
           str[i]=='a'||
           str[i]=='E'||
           str[i]=='e'||
           str[i]=='I'||
           str[i]=='i'||
           str[i]=='O'||
           str[i]=='o'||
           str[i]=='U'||
           str[i]=='u'){
            count ++;
        }
    }
    System.out.println(count);
}

}
