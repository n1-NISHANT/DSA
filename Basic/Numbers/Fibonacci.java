package DSA.Basic.Numbers;

import java.util.Scanner;
public class Fibonacci{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int c = 0;
    if(n==1){
        System.out.println(0);
    }else if(n == 2 ){
        System.out.println(""+0+1);
    }else if(n>2){
        for(int i = 0;i<n;i++){
            System.out.print(a);
             c = a + b;
             a = b;
             b = c;
        }
    }

}

}
