package DSA.Basic.Numbers;

import java.util.Scanner;
public class Prime{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  num = sc.nextInt();
    int flag = 0;
    for(int i = 2;i<num;i++){
        if(num%i==0){
            flag = 1;
        }
    }
    if(flag == 0){
        System.out.println(" Prime number");
    }else{
         System.out.println("Not Prime number");
    }
}
}
