package folder;

import org.testng.Assert;
import org.testng.annotations.*;

public class Annotation {
    @BeforeMethod
    public void before(){
        System.out.println("before method");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class\n");
    }

    @AfterMethod
    public void after(){
        System.out.println("after method\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }

    @Test
    public void test1(){
        System.out.println("test1");
        Assert. assertEquals("1", "1");
    }

    @Test(timeOut=1000)
    public void test2(){
        System.out.println("test2");
        String expected = "expected";
        String actual = "actual";
        Assert.assertFalse(expected.equals(actual));
        Assert.assertTrue(expected.equals(expected));
        Assert.assertNotNull(actual);
        Assert.assertSame(expected, "expected");
        while(true);
    }
}
