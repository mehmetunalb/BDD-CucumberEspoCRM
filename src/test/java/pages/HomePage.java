package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }


    @FindBy(css = ".not-in-more .full-label")
    public List<WebElement> category;

    @FindBy(xpath = "//button[@id='btn-login']")
    public WebElement login;

    @FindBy(xpath = " //a[@href='#Account']")
    public WebElement accountsButton;

    @FindBy(xpath = "//a[@class='btn btn-default action']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@data-name='name']")
    public WebElement name;



}
