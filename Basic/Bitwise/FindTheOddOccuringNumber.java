package DSA.Basic.String;

import java.util.Scanner;
public class FindTheOddOccuringNumber{
public static void main(String[] args) {
    int[] arr = new int[10];
    
    int size, i;
    
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    
    for(i = 0; i < size; i++)
        arr[i] = sc.nextInt();
    
    int check = arr[0];
    for(i = 1;i<arr.length;i++){
        check = check^arr[i];
    }
    System.out.println(check);
}
}
