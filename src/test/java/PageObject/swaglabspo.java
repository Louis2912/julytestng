package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class swaglabspo {

    public WebDriver driver;

    public swaglabspo (WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    @FindBy(how = How.ID, using = "user-name")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.ID, using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    @CacheLookup
    WebElement loginbutton;

    @FindBy(how = How.XPATH, using = "//h3")
    @CacheLookup
    WebElement error;

    public void setUsername (String usname){
        username.sendKeys(usname);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public void clicklogin(){
        loginbutton.click();
    }

    public String geterror(){
      String errormsg=  error.getText();
      return errormsg;
    }
}
