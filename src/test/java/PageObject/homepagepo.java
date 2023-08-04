package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homepagepo {
    public WebDriver driver;
    public homepagepo(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    @FindBy (how = How.XPATH, using = "//select[@name='fromPort']")
    @CacheLookup
    WebElement fromcitydrop;

    @FindBy (how = How.XPATH, using = "//select[@name='fromPort']/option[text()='Boston']")
    @CacheLookup
    WebElement fromcity;

    @FindBy (how = How.XPATH,using = "//select[@name='toPort']")
    @CacheLookup
    WebElement tocitydrop;

    @FindBy (how = How.XPATH, using = "//select[@name='toPort']//option[text()='Berlin']" )
    @CacheLookup
    WebElement tocity;

    @FindBy (how = How.XPATH, using = "//input[@type='submit']")
    @CacheLookup
    WebElement submit;

    @FindBy (how = How.XPATH, using = "(//input[@type='submit'])[3]")
    @CacheLookup
    WebElement chooseflight;

    public void clickfromcitydrop (){
        fromcitydrop.click();
    }

    public void clickfromcity(){
        fromcity.click();
    }

    public void clicktocitydrop(){
        tocitydrop.click();
    }
    public void clicktocity(){
        tocity.click();
    }
    public void clicksubmit(){
        submit.click();
    }
    public void clickchooseflight(){
        chooseflight.click();
    }


}
