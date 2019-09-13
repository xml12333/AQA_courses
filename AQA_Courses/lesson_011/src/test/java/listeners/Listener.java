package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("On test start");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test was successful");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("The test was skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // stab
    }

    public void onStart(ITestContext context) {
        System.out.println("On start");
    }

    public void onFinish(ITestContext context) {
        System.out.println("On finish");
  }

}
