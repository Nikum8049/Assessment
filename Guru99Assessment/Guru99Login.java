package Guru99Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import util.Driveconect;

import static org.testng.AssertJUnit.assertEquals;
import static util.Driveconect.driver;

public class Guru99Login {

    @Test
    public void loginTest()
    {
        WebDriver driver= Driveconect.connect("https://www.demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr591125");
        driver.findElement(By.name("password")).sendKeys("tAbumEm");
        driver.findElement(By.name("btnLogin")).click();

        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        assertEquals(title,"User or Password is not valid");

    }



}

