import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
    
        String result = (isPalindrome(A) ? "Yes" : "No");
        System.out.print(result);
     
    }

    public static boolean isPalindrome(String s){
     if(s.toUpperCase().equals(new StringBuilder(s).reverse().toString().toUpperCase())){
        return true;
     }
     return false;
    }
}



