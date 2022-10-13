package tests;

import base.BaseTest;
import org.testng.Assert;
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
    @Test(testName = "Ketarin")
    public void test01(){
        page.assertEquals(driver.getTitle(), "Google");
    }



@Test(testName = "US002 - Nurik")
public void test0002(){
    System.out.println("Google");
}

    @Test(testName = "Google title test")
    public void test01(){
        page.assertEquals(driver.getTitle(), "Google");
    }

    @Test(testName = "Agatha TestName")
    public void test02(){
        System.out.println("Agatha's message here");
    }

    @Test(testName = "Sugar")
    public void test11(){

        System.out.println("Sugar here");
    }

}


