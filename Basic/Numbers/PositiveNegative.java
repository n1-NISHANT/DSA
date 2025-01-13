package DSA.Basic.Numbers;
import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           int value = sc.nextInt();
        /*   Using if else Statement
             if(value == 0){
              System.out.print("Given Number is "+value);
           } else if(value > 0){
                    System.out.print("Given Number is Positive "+value);
           }else if(value < 0){
                      System.out.print("Given Number is Negative "+value);
           }  
         */

            String stringvalue = (value==0?"Given Number is "+value:(value>0)?"Given Number is Positive "+value:"Given Number is Negative "+value);
	        System.out.println(stringvalue);
         sc.close();
    }
}
