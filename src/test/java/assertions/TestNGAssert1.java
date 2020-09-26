package assertions;

import com.google.inject.spi.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssert1 {

    @Test
    public void testAssert1() {

        int x=12;
        Assert.assertNotEquals(x,12);

    }

    @Test
    public void testAssert2() {
        boolean val=false;
        System.out.println("*****Print 1*****");
        Assert.assertTrue(val,"Failed to match boolean");
        System.out.println("*****Print 2*****");
        Assert.assertFalse(val,"Failed to match boolean");
        System.out.println("*****Print 3*****");


    }
}
