package DSA.Basic.Numbers;
import java.util.Scanner;

public class OddEven{
    public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           int value = sc.nextInt();

         /*  if(value % 2 == 0){
                  System.out.println("Given value is even ");
           }else{
                 System.out.println("Given number is Odd");
           }
        */

         String val = (value % 2 == 0 ? "Given value is even ":"Given number is Odd");
          System.out.println(val);
      sc.close();
    }
}
