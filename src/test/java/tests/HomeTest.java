package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import sun.jvm.hotspot.ui.AnnotatedMemoryPanel;

public class HomeTest extends BaseTest {

    HomePage page;

    @BeforeMethod
    public void setUp(){
        page = new HomePage(driver);
    }
    @Test(testName = "github test")
    public void testUS001My(){
        System.out.println("Practicing git");
    }
}
