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

    @Test(testName = "Oksana")
    public void testOksana(){
        System.out.println("Hi from Oksana");
    }

}
