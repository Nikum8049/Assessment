package Guru99Assessment;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.Driveconect;

public class Guru99ParameteriseTestListner implements ITestListener {

    public void onTestFailure(ITestResult result, WebDriver driver) {

        Driveconect.screenShotstops(driver,"guru");
    }
}
