package DSA.Basic.Array;

import java.util.Scanner;
public class SortArray{
   public int[] input(){
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter length of array : ");
      int value = sc.nextInt();
      int arr[] = new int[value];
      for(int i = 0;i<value;i++){
        arr[i] = sc.nextInt();
      }
       sc.close();
     return arr;
   }

  public int[] sortFunction( int arr[]){
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
               for(int j = 0;j < arr.length-1-i;j++){
                  if(arr[j]>arr[j+1]){
                      temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                  }
               }
        }
    return arr;
  }
   public static void main(String [] args){
       SortArray sortArrey = new SortArray();
       int arr[] = sortArray.input();
            System.out.println("Before Sorting : ");
            for(int i : arr){
              System.out.print(arr[i]+"\t");
             }
        int arr1[] = sortArray.sortFunction(arr);
           System.out.println("After Sorting : ");
            for(int i : arr2){
              System.out.print(arr[i]+"\t");
             }
}
