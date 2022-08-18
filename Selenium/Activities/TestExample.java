package examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample {
    @Test
    public void testMethod(){
        int sum = 10;
        System.out.println("My first Test");
        Assert.assertEquals(sum,10);
    }
}
