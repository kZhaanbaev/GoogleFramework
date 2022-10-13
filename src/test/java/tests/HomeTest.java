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

    @Test(testName = "Agatha TestName")
    public void test02(){
        System.out.println("Agatha's message here");
    }

}


