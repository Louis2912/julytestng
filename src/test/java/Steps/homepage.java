package Steps;

import PageObject.homepagepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class homepage {

    public WebDriver driver;
    public homepagepo home;


    @BeforeMethod
    public void open(){
        driver = new ChromeDriver();
        home = new homepagepo(driver);
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/index.php");

    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

    @Test
    public void findflight(){
        home.clickfromcitydrop();
        home.clickfromcity();
        home.clicktocitydrop();
        home.clicktocity();
        home.clicksubmit();
        Assert.assertEquals(driver.getCurrentUrl(),"https://blazedemo.com/reserve.php");
    }

    @Test
    public void chooseflight(){
        home.clickfromcitydrop();
        home.clickfromcity();
        home.clicktocitydrop();
        home.clicktocity();
        home.clicksubmit();
        home.clickchooseflight();
        Assert.assertEquals(driver.getCurrentUrl(),"https://blazedemo.com/purchase.php");
    }

}
