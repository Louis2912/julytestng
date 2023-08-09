package Steps;

import PageObject.detailspagepo;
import PageObject.homepagepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class detailpagestep {

    public WebDriver driver;
    public homepagepo home;
    public detailspagepo details;

    @BeforeMethod
    public void open(){
        driver = new ChromeDriver();
        home = new homepagepo(driver);
        details = new detailspagepo(driver);
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/index.php");
        home.clickfromcitydrop();
        home.clickfromcity();
        home.clicktocitydrop();
        home.clicktocity();
        home.clicksubmit();
        home.clickchooseflight();
    }

    @Test
    public void detailtest(){
        details.setname("John");
        details.setaddress("Chennai");
        details.setcity("Tamilnadu");
        details.setstate("Tamilnadu");
        details.setzipcode("600018");
        details.clickcardtype();
        details.setcardno("1235456789");
        details.setcardname("John John");
        details.clickremember();
        details.clicksubmit();
        Assert.assertEquals(driver.getCurrentUrl(),"https://blazedemo.com/confirmation.php");
    }

    @Test
    public void textcheck(){
        Assert.assertEquals(details.fetchtext(),"Your flight from TLV to SFO has been reserved.");
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}
