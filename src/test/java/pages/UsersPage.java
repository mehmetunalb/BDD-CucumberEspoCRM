package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class UsersPage {

    public UsersPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody/tr[1]/td")
    public List<WebElement> usersRow1; // 7
    @FindBy(xpath = "//tbody/tr[2]/td")
    public List<WebElement> usersRow2;
    @FindBy(xpath = "//tbody/tr[3]/td")
    public List<WebElement> usersRow3;
    @FindBy(xpath = "//tbody/tr[4]/td")
    public List<WebElement> usersRow4;
    @FindBy(xpath = "//tbody/tr[5]/td")
    public List<WebElement> usersRow5;
    @FindBy(xpath = "//tbody/tr[6]/td")
    public List<WebElement> usersRow6;
    @FindBy(xpath = "//tbody/tr[7]/td")
    public List<WebElement> usersRow7;
    @FindBy(xpath = "//tbody/tr[8]/td")
    public List<WebElement> usersRow8;
    @FindBy(xpath = "//tbody/tr[9]/td")
    public List<WebElement> usersRow9;
    @FindBy(xpath = "//tbody/tr[10]/td")
    public List<WebElement> usersRow10;
    @FindBy(xpath = "//tbody/tr[11]/td")
    public List<WebElement> usersRow11;


    public List<List<WebElement>> getUsersList(){
        List<List<WebElement>> usersList=new ArrayList<>();
        usersList.add(usersRow1);
        usersList.add(usersRow2);
        usersList.add(usersRow3);
        usersList.add(usersRow4);
        usersList.add(usersRow5);
        usersList.add(usersRow6);
        usersList.add(usersRow7);
        usersList.add(usersRow8);
        usersList.add(usersRow9);
        usersList.add(usersRow10);
        usersList.add(usersRow11);

        return usersList;
    }


}
