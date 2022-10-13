package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp(){
        page = new HomePage(driver);
    }
    @Test(testName = "Tariq")
    public void test01(){
        String expected = "Automation with Selenium";
        String actual = driver.findElement(By.id("title")).getText();

        page.assertEquals(actual, expected);
    }


}
