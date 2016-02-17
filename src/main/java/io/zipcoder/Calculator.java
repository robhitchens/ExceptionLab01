package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/16/16.
 */
public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b) throws DivideByZeroException{
        if(b ==0){
            throw new DivideByZeroException();
        }else {
            return a / b;
        }
    }
    /*public double squareRoot(int a){
        return Math.sqrt(a);
    }*/
}
class DivideByZeroException extends ArithmeticException{}
