package DSA.Basic.Array;

import java.util.Scanner;
public class Reverse{
public static void main(String[] args) {
    int[] arr = new int[10];
    int n, i;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    for(i=1;i<=n;i++){
        System.out.print(arr[n-i]); 
    }
}
}
