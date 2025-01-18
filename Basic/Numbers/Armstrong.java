package DSA.Basic.Numbers;

import java.util.Scanner;
public class Armstrong{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int ans = 0;
    while(num>0){
        int mod = num%10;
        ans += mod * mod *mod;
        num /= 10;
    }
    if(ans == temp){
        System.out.println("Armstrong number");
    }else{
        System.out.println("Not Armstrong number");
    }
}
}
