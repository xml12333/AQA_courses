package folder;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoke {
    @Test(groups = "smoke")
    public void trueSmokeTest (){
        System.out.println("TEST FROM SMOKE XML");
        Assert.assertTrue(true);
    }
    @Test
    public void falseSmokeTest (){
        Assert.assertTrue(false);
    }
}
