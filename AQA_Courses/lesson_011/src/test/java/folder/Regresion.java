package folder;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Regresion {
    @Test
    public void trueRegressionTest (){
        System.out.println("Regression test1\n");
        Assert.assertTrue(true);
    }
    @Test
    public void falseRegressionTest (){
        System.out.println("Regression test2");
        Assert.assertTrue(false);
    }
}
