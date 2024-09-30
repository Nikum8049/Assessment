package Guru99Assessment;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.Driveconect;

public class Guru99LoginListner implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("Test failed");
        Driveconect.screenShotstops("guru");
    }
}
