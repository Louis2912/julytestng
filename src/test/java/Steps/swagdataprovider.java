package Steps;

import PageObject.swaglabspo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class swagdataprovider {
    public WebDriver driver;
    public swaglabspo loginpo;

    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test(dataProvider = "mylogindata")
    public void login(String username, String password, String link) throws InterruptedException {
       driver = new ChromeDriver();
       loginpo = new swaglabspo(driver);
       driver.manage().window().maximize();
       driver.get("https://www.saucedemo.com/");
       loginpo.setUsername(username);
       loginpo.setPassword(password);
       Thread.sleep(2000);
       loginpo.clicklogin();
       Thread.sleep(2000);
       Assert.assertEquals(driver.getCurrentUrl(),link);
    }

    @DataProvider(name = "mylogindata")
    public Object[][] senddata(){
        Object logindata[][] = new  Object[2][3];
        logindata[0][0] = "standard_user";
        logindata[0][1] = "secret_sauce";
        logindata[0][2] = "https://www.saucedemo.com/inventory.html";
        logindata[1][0] = "standard_user100";
        logindata[1][1] = "secret_sauce";
        logindata[1][2] = "https://www.saucedemo.com/";
        return logindata;
    }
}
