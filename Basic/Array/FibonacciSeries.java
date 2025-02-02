package DSA.Basic.Array;

public class FibonacciSeries{
   public static void main(String[] args) {
     int arr []= Solution1.generateFibonacciNumbers(5);
     for(int i = 0; i<arr.length;i++) {
     System.out.println(arr[i]);
     }
   }
}
class Solution1 {
    public static int[] generateFibonacciNumbers(int n) {
        int arr[] = new int[n];
        if(n==1)
         return arr;
        else{ 
        int j = 0;
        arr[0]=0;
        arr[1]=1;
        for(int i = 2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
      }
    }
}
