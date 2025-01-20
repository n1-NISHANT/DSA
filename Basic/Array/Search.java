package DSA.Basic.Array;

import java.util.Scanner;
public class Search{
public static void main(String[] args) {
    int[] arr = new int[10];
    int n, i, key;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    
    for (i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    key = sc.nextInt();
    boolean b1 = false;
    for(i=0;i<n;i++){
        if(key==arr[i]){
         b1 = true;   
        }
    }
    if(b1){
          System.out.println("Key found");
    }else{
          System.out.println("Key not found");
    }
}
}
