package DSA.Basic.Array;

public class FindMissingNumber{
  public static void main(String [] args){
      int ar1[] = new int[100];

      for(int i = 1; i<=ar1.length;i++){
           if(i==13){
                continue;
           } 
           ar1[i-1] = i;
      }
      int num = (100*(100+1))/2;
      int sum = 0;
      for(int i = 0; i < ar1.length;i++){
          sum = sum+ar1[i];
      }
    int mn  = num-sum;
    System.out.println("missing number = "+mn);  
  }
}
