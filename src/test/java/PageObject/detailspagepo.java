package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class detailspagepo {
    public WebDriver driver;

    public detailspagepo(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver,this);
    }

    @FindBy(how = How.ID, using = "inputName")
    @CacheLookup
    WebElement name;

    @FindBy(how = How.ID, using = "address")
    @CacheLookup
    WebElement address;

    @FindBy(how = How.ID, using = "city")
    @CacheLookup
    WebElement city;

    @FindBy(how = How.ID, using = "state")
    @CacheLookup
    WebElement state;

    @FindBy(how = How.ID, using = "zipCode")
    @CacheLookup
    WebElement zipcode;

    @FindBy(how = How.XPATH, using = "//select[@id='cardType']/option[2]")
    @CacheLookup
    WebElement cardtype;

    @FindBy(how = How.ID, using = "creditCardNumber")
    @CacheLookup
    WebElement cardno;

    @FindBy(how = How.ID, using = "nameOnCard")
    @CacheLookup
    WebElement cardname;

    @FindBy(how = How.ID, using = "rememberMe")
    @CacheLookup
    WebElement remember;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    @CacheLookup
    WebElement submit;

    @FindBy(how = How.XPATH, using = "//h2")
    @CacheLookup
    WebElement text;


    public void setname(String name1){
        name.sendKeys(name1);
    }

    public void setaddress(String address1){
        address.sendKeys(address1);
    }

    public void setcity(String city1){
        city.sendKeys(city1);
    }
    public void setstate(String state1){
        state.sendKeys(state1);
    }
    public void setzipcode(String zipcode1){
        zipcode.sendKeys(zipcode1);
    }
    public void clickcardtype(){
        cardtype.click();
    }
    public void setcardno(String cardno1){
        cardno.sendKeys(cardno1);
    }
    public void setcardname(String cardname1){
        cardname.sendKeys(cardname1);
    }
    public void clickremember(){
        remember.click();
    }
    public void clicksubmit(){
        submit.click();
    }

    public String fetchtext(){
       return text.getText();
    }




}
