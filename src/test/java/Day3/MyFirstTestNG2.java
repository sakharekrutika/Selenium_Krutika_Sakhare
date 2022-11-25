package Day3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNG2 {

	@Test
    public void test1() {
        Assert.assertEquals(12, 12);
    }
    @Test
    public void test2() {
        Assert.assertEquals(12, 13,"Count Mismatched");
    }
    @Test(dependsOnMethods = "test2")
    public void test3() {
        Assert.assertTrue(true);
    }
	
}
