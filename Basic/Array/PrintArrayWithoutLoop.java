package DSA.Basic.Array;

class Solution {
    static int x ;
    static int arr [];
    
       public static int[] printNos(int x) {
	        Solution.x=x;
	        arr= new int[x];
	        new Solution().recursion();
	        return arr;
		    }
		     int i = 0;
		     int j = 1;
		     void recursion(){
		        arr[i] = j;
		        ++i;
		        ++j;
		        if(i<x)
		            recursion();
    } 
}
public class PrintArrayWithoutLoop {
	public static void main(String[] args) {
	int arr []= Solution.printNos(5);
      	for(int i = 0; i<arr.length;i++) {
      		System.out.println(arr[i]);
        }
    }
}
