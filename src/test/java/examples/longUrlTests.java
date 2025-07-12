package examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BulXpath;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.List;

public class longUrlTests {
    public static WebDriver driver;

    @BeforeEach
    public void setDriver() {
        driver = TestBase.createDriver();

    }

    @AfterEach
    public void tearDown() {
        //ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test
    public void test01() {
        driver.get("https://www.google.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.youtube.com");
    }

    @Test
    public void test03() {
        driver.get("https://practice.expandtesting.com/");
    }

    @Test
    public void test04() {
        driver.get("https://saatkac.info.tr/Istanbul");
    }

    @Test
    public void test05() {
        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void test06() {
        driver.get("https://practice.expandtesting.com/");
    }

    @Test
    public void test07() {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test08() {
        driver.get("https://demoqa.com/");
    }

    @Test
    public void test09() {
        driver.get("https://www.heroku.com/");
    }

    @Test
    public void test10() {
        driver.get("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void test11() {
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
    }

    @Test
    public void test12() {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

    }

    @Test
    public void test13() {
        driver.get("https://websitetestera.com/?impulse_id=427669603.1745789786");
    }

    @Test
    public void test14() {
        driver.get("https://www.apache.org/");
    }

    @Test
    public void test15() {
        driver.get("https://mvnrepository.com/");
    }

    @Test
    public void test16() {
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void test17() {
        driver.get("https://www.python.org/");
    }

    @Test
    public void test18() {
        driver.get("https://www.java.com/tr/");
    }

    @Test
    public void test19() {
        driver.get("https://oceanofpdf.com/");
    }

    @Test
    public void test20() {
        driver.get("https://testmywebsite.ai/");
    }

    @Test
    public void test21() {
        driver.get("https://github.com/janiszewskibartlomiej");
    }

    @Test
    public void test22() {
        driver.get("https://www.raditeq.com/");
    }

    @Test
    public void test23() {
        driver.get("https://www.artofunittesting.com/");
    }

    @Test
    public void test24() {
        driver.get("https://www.snapdeal.com/");
    }

    @Test
    public void test25() {
        driver.get("https://www.snapdeal.com/products/women-apparel-trousers-denims-jeggings?sort=plrty#bcrumbLabelId:23");
    }

    @Test
    public void test26() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void test27() {
        driver.get("https://www.collectapi.com/tr");
    }

    @Test
    public void test28() {
        driver.get("https://www.testotomasyonu.com/basicauth");
    }

    @Test
    public void test29() {
        driver.get("https://membername:sunflower@testotomasyonu.com/basicauth");
        ReusableMethods.bekle(3);
    }

    @Test
    public void test30() {
        driver.get("https://demoqa.com/frames");
        ReusableMethods.bekle(3);

    }

    @Test
    public void test31() {
        driver.get("https://the-internet.herokuapp.com/windows");
        ReusableMethods.bekle(3);
    }

    @Test
    public void test32() {
        driver.get("https://webdriveruniversity.com/");

    }

    @Test
    public void test33() {
        driver.get("https://webdriveruniversity.com/actions");

    }

    @Test
    public void test34() {
        driver.get("https://www.wisequarter.com/");

        // username  : " ahmeteldesyahoocom  "
        // password :   "   Ahmet.2020   ""
        ReusableMethods.bekle(300000);
    }

    @Test
    public void test35() {
        driver.get("https://testng.org/");
    }

    @Test
    public void test36() {
        driver.get("https://zigzag.kr/");
    }
}



