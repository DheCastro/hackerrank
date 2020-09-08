import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        Integer hours = Integer.parseInt(s.substring(0,2));
        String notHours = "";
         if(s.contains("PM")){
            if(!hours.equals(12)){
                hours = hours + 12;
            }

         }else{
             if(hours.equals(12)){
                hours = hours - 12;
            }
         }

        //Remove hours and AM/PM
        notHours = s.substring(2, s.length()-2);  
        
        //Case 00hs
        if(hours.equals(0)){
            return "00" + notHours;
        }

        //Cases zero to the left
        if(hours < 10){
            return "0" + hours.toString() + notHours;
        }

        return hours.toString() + notHours;  
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
