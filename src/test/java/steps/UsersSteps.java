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
    public void user_verifies_usernames_and_emails(List<List<WebElement>> dataTable) {
        usersPage=new UsersPage(driver);
        for (int i=0; i<usersPage.usersList.size(); i++) { // 11
                int k=0;
            System.out.println(usersPage);
                Assert.assertEquals(usersPage.usersList.get(i).get(1).getText().trim(),dataTable.get(i).get(0));
                Assert.assertEquals(usersPage.usersList.get(i).get(4).getText().trim(),dataTable.get(i).get(1));
        }


    }

}
