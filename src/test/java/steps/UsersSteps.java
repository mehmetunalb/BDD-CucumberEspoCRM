package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.UsersPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;

public class UsersSteps {
    WebDriver driver;
    HomePage homePage;
    UsersPage usersPage;

    @Given("user navigates  to  espocrm {string}")
    public void user_navigates_to_espocrm(String url) {
        driver= Driver.getDriver();
        driver.get(ConfigReader.getProperty(url));
    }
    @When("user clicks Users button")
    public void user_clicks_users_button() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.login.click();
        Thread.sleep(2000);
        homePage.goToUsersPage();
        Thread.sleep(2000);
    }
    @Then("user verifies usernames and emails")
    public void user_verifies_usernames_and_emails(List<List<String>> dataTable) {
        usersPage=new UsersPage(driver);
        List<List<WebElement>> usersList;
        usersList=usersPage.getUsersList();

        /*for (int i=0; i<usersList.size();i++) { //11
            System.out.println(usersList.get(i).get(4).getText().trim());
            System.out.println(dataTable.get(i).get(1));
        }*/

        for (int i=0; i<usersList.size(); i++) { // 11
            Assert.assertEquals(usersList.get(i).get(1).getText().trim(),dataTable.get(i).get(0));
            Assert.assertEquals(usersList.get(i).get(4).getText().trim(),dataTable.get(i).get(1));
        }

    }


}
