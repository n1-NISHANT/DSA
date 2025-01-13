package DSA.Basic.Numbers;
import java.util.Scanner;

public class AbsoluteValue{
  // Absolute value is value between 0 and value. ex--> value is -5(difference between 0 to -5 is 5) so absolute value is 5
    public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
           int value = sc.nextInt();
                if( value >= 0){
                    System.out.println(value);
                } else {
                   System.out.println(-(value));
                }
          sc.close();
    }
}
