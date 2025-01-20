package DSA.Basic.Array;

import java.util.Scanner;
public class LargestSmallest{
public static void main(String[] args) {
    int[] arr = new int[10];
    int n, i;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    
    for (i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    int max = arr[0], min = arr[0];
    for(i=0;i<n;i++){
        if(max<arr[i]){
            max = arr[i];
        }
        if(min > arr[i]){
            min = arr[i];
        }
    }
     System.out.println("Max ="+max);
     System.out.println("Min ="+min);
}
}
