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

    @FindBy(xpath = "//button[@id='btn-login']")
    public WebElement login;

    @FindBy(css = ".not-in-more .full-label")
    public List<WebElement> category;

    @FindBy(linkText = "Accounts") //   //a[@href='#Account']
    public WebElement accountsButton;

    @FindBy(xpath = "//a[@id='nav-more-tabs-dropdown']") //  //span[@class='fas fa-ellipsis-h more-icon']

    public WebElement threeDots;

    @FindBy(xpath = "//a[@href='#User']")
    public WebElement usersButton;

    public void goToUsersPage(){
        threeDots.click();
        usersButton.click();
    }

    public void clickAccount(){
        accountsButton.click();
        System.out.println("ayhan");

    }


}
