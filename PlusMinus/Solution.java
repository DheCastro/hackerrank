import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float positiveNums = 0;
        float negativeNums = 0;
        float zeros = 0;

        for(Integer num: arr){
            if(num > 0){
                positiveNums++;
            }else if(num < 0){
                negativeNums++;
            }else{
                zeros++;
            }
        }

        System.out.println(positiveNums/arr.length);
        System.out.println(negativeNums/arr.length);
        System.out.println(zeros/arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
