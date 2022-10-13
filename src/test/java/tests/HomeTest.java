package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp() {
        page = new HomePage(driver);
    }


    @Test(testName = "Google title test")
    public void test01() {
        Assert.assertEquals(driver.getTitle(), "Google");
    }
        @Test(testName = "Erik")
        public void test02() {
            System.out.println("Hocus Pocus");
        }
    }

    @Test(testName = "Google title test")
    public void test01(){
        page.assertEquals(driver.getTitle(), "Google");
    }

}

