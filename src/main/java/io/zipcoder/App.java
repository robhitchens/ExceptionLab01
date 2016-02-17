package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/16/16.
 */
public class App {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        int a1 = calc.add(1, 2);
        int a2 = calc.add(2,2);
        int a3 = calc.subtract(1, 7);
        int a4 = calc.subtract(1,42);
        int a5 = calc.multiply(2,42);
        int a6 = calc.multiply(42,42);

        try {
            int a8 = calc.divide(3, 0);
        }catch(DivideByZeroException dbz){
            dbz.printStackTrace();
            //System.out.println("cannot divide by zero");
        }
        int a7 = calc.divide(24, 8);
        //double a9 = calc.squareRoot(-7);
    }
}
