package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.CalcLogic;

public class CalcLogicTest {

    CalcLogic calc;

    @BeforeMethod
    public void setUp() {
        calc=new CalcLogic();
    }

    @Test(dataProvider = "getNum")
    public void testSum(int input1, int input2 , int expectedResult) {
        Assert.assertEquals(calc.sum(input1,input2),expectedResult,"Failed to Add Two Ints :");
        System.out.println("Go to the next line");
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(calc.sum(-100,-50),-150,"Failed to Add Two Ints :");
    }

    @Test
    public void testSum3() {


        Assert.assertEquals(calc.sum(100,-50),51,"Failed to Add Two Ints :");

        System.out.println("Go to the next line");
    }

    @Test
    public void testSum4() {
        Assert.assertEquals(calc.sum(-100,50),-50,"Failed to Add Two Ints :");
    }

    @DataProvider
    public Object[][] getNum(){
        return new Object[][]{
            {100,50,150},
            { -100,-50,-155},
            {100,-50,50},
                {-100,50,-50}
        };
    }

}
