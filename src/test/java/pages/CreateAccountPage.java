package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountPage {

    public CreateAccountPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[@class='btn btn-default action']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@data-name='name']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@data-name='website']")
    public WebElement websiteField;

    @FindBy(xpath = "//input[@data-name='billingAddressCountry']")
    public WebElement countryField;

    @FindBy(xpath = "//select[@data-name='type']")
    public WebElement typeField;

    @FindBy(xpath = "//button[@data-action='save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@data-name='name']/div")
    public WebElement verifyName;

    @FindBy(xpath = "//div[@data-name='website']/div")
    public WebElement verifyWebsite;

    @FindBy(xpath = "//div[@data-name='billingAddress']/div")
    public WebElement verifyCountry;

    @FindBy(xpath = "//div[@data-name='type']/span")
    public WebElement verifyType;


    public void clickCreateAccount(){
        createAccountButton.click();
    }
    public void fillAccountInfo(String name, String website, String country, String type){
        nameField.sendKeys(name);
        websiteField.sendKeys(website);
        countryField.sendKeys(country);
        Select select=new Select(typeField);
        select.selectByVisibleText(type);
        saveButton.click();
    }

}

