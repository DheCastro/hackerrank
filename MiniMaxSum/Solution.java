import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int min = 0;
        int max = 0;
        long sum = 0;
        
        //Define max
        for(int num: arr){
            if(num > max){
                max=num;
            }
        }

        //Define min
        min = max;
        for(int num: arr){
            if(num < min){
                min=num;
            }
        }

        //Sum
        for(int num: arr){
            sum+=num;
        }

        System.out.print((sum-max) + " " + (sum-min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
