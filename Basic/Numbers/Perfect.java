package DSA.Basic.Numbers;

import java.util.Scanner;
public class Perfect{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=1; 
   
    for(int i = 2;i<n;i++){
        if(n%i==0){
            sum += i;
        }
    }
    if(n == sum){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}
