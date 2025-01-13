package DSA.Basic.Numbers;
import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           int value = sc.nextInt();
           if(value == 0){
              System.out.print("Given Number is "+value);
           } else if(value > 0){
                    System.out.print("Given Number is Positive "+value);
           }else if(value < 0){
                      System.out.print("Given Number is Negative "+value);
           }  
         sc.close();
    }
}
