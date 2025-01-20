package DSA.Basic.Array;

import java.util.Scanner;
public class OddEven{
public static void main(String[] args) {
    int[] arr = new int[10];
    int size, i;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    
    for(i = 0; i < size; i++)
        arr[i] = sc.nextInt();
    int Evencount =0 , Oddcount = 0;
    for(i = 0 ;i<size;i++){
     if(arr[i]%2==0){
         Evencount ++;
     }else{
         Oddcount ++;
     }   
    } 
    System.out.println("Even Number Count ="+Evencount);
    System.out.println("Odd Number Count ="+Oddcount);
}
}
