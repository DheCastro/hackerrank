import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //Custom locale for India
        Locale indiaLocale = new Locale("en", "IN");

        System.out.println("US: " + getNumberFormat(Locale.US).format(payment));
        System.out.println("India: " + getNumberFormat(indiaLocale).format(payment));
        System.out.println("China: " + getNumberFormat(Locale.CHINA).format(payment));
        System.out.println("France: " + getNumberFormat(Locale.FRANCE).format(payment));
    }

    public static NumberFormat getNumberFormat(Locale locale){
        
        if(locale.getDisplayCountry().equals("India")){
            locale = new Locale("en", "IN");
        }
        return NumberFormat.getCurrencyInstance(locale);
    }
}
