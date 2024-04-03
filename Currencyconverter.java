package practise;


import java.util.*;
import java.text.*;

public class Currencyconverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = 12324.134;
        scanner.close();
        
        // Write your code here.
        //String us = NumberFormat.getInstance(Locale.US).format(payment);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        NumberFormat nf = NumberFormat.getInstance();
//        for (int i = 0; i < myNumber.length; ++i) {
//            output.println(nf.format(myNumber[i]) + "; ");
//        }
        String us1 = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
          System.out.println("US: " + us1);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}