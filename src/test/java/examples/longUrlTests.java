package examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class longUrlTests {
    public static WebDriver driver ;
    @BeforeEach
    public void setDriver(){
        driver = TestBase.createDriver();

    }
    @AfterEach
    public void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }
    @Test
    public void test01(){
        driver.get("https://www.google.com");
    }
    @Test
    public void test02(){
        driver.get("https://www.youtube.com");
    }
    @Test
    public void test03(){
        driver.get("https://practice.expandtesting.com/");
    }
    @Test
    public void test04(){
        driver.get("https://saatkac.info.tr/Istanbul");
    }
}
