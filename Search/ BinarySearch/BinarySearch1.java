package DSA.Search.BinarySearch;

public class BinarySearch1{
  
public void binarySearchmethod1() {
	int [] arr = {1,20,22,30,40,42,44,55,67,89,98};
	int target = 40;
	System.out.println(indexOfTargetValue(arr,target));
	}
	public static int indexOfTargetValue(int []arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			//find the mid element 
			//int mid = (start + end) / 2 // it may be possible (start + end) exceed the range of the int here not possible
		    int mid = start + (end - start)/2; 
		   if(target < arr[mid])
			   end = mid-1;
		   else if(target> arr[mid])
			   start = mid+1;
		   else
			   //target found
			   return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new BinarySearch().binarySearchmethod1();
		
	}
}
