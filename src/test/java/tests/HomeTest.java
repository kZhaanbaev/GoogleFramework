package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp(){
        page = new HomePage(driver);
    }



}
