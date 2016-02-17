package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/16/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SpecCalculator {

    Calculator calcy = new Calculator();
    @Test
    public void additionTest(){
        int a =1;
        int b= 2;
        int c =a+b;
        assertEquals(" result should be equivalnt to c", c, calcy.add(a,b));
    }
    @Test
    public void subtractionTest(){
        int a =123;
        int b= 4;
        int c =a-b;
        assertEquals(" result should be equivalnt to c", c, calcy.subtract(a,b));
    }
    @Test
    public void multiplicationTest(){
        int a =456;
        int b= 2;
        int c =a*b;
        assertEquals(" result should be equivalnt to c", c, calcy.multiply(a,b));
    }
    @Test
    public void divisionTest(){
        int a =1;
        int b = 2;
        int c =a/b;
        assertEquals(" result should be equivalnt to c", c, calcy.divide(a,b));
    }
    @Test(expected=DivideByZeroException.class)
    public void divisionTestWithZero(){
        int a =42;
        int b = 0;
        int c =calcy.divide(a,b);

    }
}
