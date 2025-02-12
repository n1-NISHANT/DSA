package DSA.Basic.Array;

import java.util.Scanner;
public class Sum2D{
public static void main(String[] args) {
    int n, i, j;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(i = 0; i < n; i++)
        for(j = 0; j < n; j++)
            arr[i][j] = sc.nextInt();
    int sum = 0;
    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++){
            sum += arr[i][j];
        }
    }    
    System.out.println(sum);
}
}
