package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp(){
        page = new HomePage(driver);
    }
    @Test(testName = "Alexandra")
    public void testAlexandra() {
        System.out.println("We will get Git one day!");
    }
}
