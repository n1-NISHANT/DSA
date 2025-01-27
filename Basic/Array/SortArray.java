package DSA.Basic.Array;

import java.util.Scanner;
public class SortArray{
  


  
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter length of array : ");
      int value = sc.nextInt();
      int arr[] = new int[value];
      for(int i = 0;i<value;i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("Before Sorting : ");
      for(int i : arr){
        System.out.print(arr[i]+"\t");
   }
}
