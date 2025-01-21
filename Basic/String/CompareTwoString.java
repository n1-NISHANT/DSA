package DSA.Basic.String;

import java.util.Scanner;
public class CompareTwoString{
public static void main(String[] args) {
    String temp;
    Scanner sc = new Scanner(System.in);
    temp = sc.nextLine();
    char[] str1 = temp.toCharArray();
    temp = sc.nextLine();
    char[] str2 = temp.toCharArray();
    boolean flag = false;
    if(str1.length == str2.length){
        for(int i=0;i<str1.length;i++){
            if(str1[i]==str2[i])
            flag = true;
            else
             flag = false;
        }
    }
    if(flag == true){
         System.out.println("Yes");
    }else{
         System.out.println("No");
    }
}

}
