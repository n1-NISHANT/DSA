package DSA.Basic.String;

import java.util.Scanner;
public class Anagram{
  static boolean isAnagram(String val1, String val2) {
		 String value1 = val1.toLowerCase();
		 String value2 =  val2.toLowerCase();    
        if(value1.length() == value2.length()){
            if(shortto(value1).equals(shortto(value2))){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }     
    }
static String shortto(String s){
    char [] str = s.toCharArray();
    char temp =' ';
    String sort = "";
    for(int i = 0 ;i<str.length;i++){
        for(int j = i; j<str.length;j++){
            if(str[i]>str[j]){
               temp = str[j];
               str[j] = str[i];
               str[i] = temp; 
            }
        } 
    }
    for(int i = 0 ; i<str.length;i++){
        sort += str[i];
    }
  //  System.out.println(sort);
  //  return sort;
}  
public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
        String val1 = scan.next();
        String val2 = scan.next();
        scan.close();
        boolean ret = isAnagram(val1, val2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" ); 
    }
}
