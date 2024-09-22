package Guru99Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.Driveconect;

public class Guru99Parameterise {
    WebDriver driver =null;

    @BeforeClass
    public void  setup()
    {
        driver= Driveconect.connect("https://www.demo.guru99.com/V4/index.php");
    }

    @Test(dataProvider = "dp")
    public void test(String userId, String userPass)
    {

      WebElement userid=driver.findElement(By.name("uid"));
      WebElement upass= driver.findElement(By.name("password"));
      WebElement login=driver.findElement(By.name("btnLogin"));

      userid.clear();
      userid.sendKeys(userId);
      upass.clear();
      upass.sendKeys(userPass);
      login.click();

       driver.navigate().back();



    }
    @DataProvider(name="dp")
    public Object[][] setData()
    {
        Object obj [][]= new Object[2][2];
        obj[0][0] = "mngr591125";
        obj[0][1] = "tAbumEm";

        obj[1][0] = "tech@gmail.com";
        obj[1][1] = "tech";
        return obj;
    }
}
