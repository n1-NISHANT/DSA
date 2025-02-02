package DSA.Search.BinarySearch;

public class BinarySearch2{
public static int OrderAgnosticBS(int []arr,int target) {
	  int start = 0;
	  int end = arr.length-1;
	  boolean ArrayIsAsc = arr[start]<=arr[end];
	  
	  while(start<=end) {
	  int mid = start +(end-start)/2;
	  
	  if(target == arr[mid])
	  {
		  return mid;
	  }
	  if(ArrayIsAsc)
		  if(target < arr[mid]) {
			  end = mid-1;
		  }else {
			  start = mid+1;
		  }
	  else  
		  if(target > arr[mid]) {
			  end = mid-1;
		  }else {
			  start = mid+1;
		  }
	  }
	return -1;
	}
	
public static void main(String[] args) {
	//int [] arr = {1,20,22,30,40,42,44,55,67,89,98};
	int []arr= {98,87,66,59,55,44,40,30,29,20,10,9,8,7,3,4,2,1};
	int target = 10;
	System.out.println(OrderAgnosticBS(arr,target));
	}
}
