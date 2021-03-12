package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;

public class MainPageSteps {
    WebDriver driver;
    HomePage homePage;

    @Given("user navigates to  espocrm {string}")
    public void user_navigates_to_espocrm(String url) {
        driver=Driver.getDriver();
        driver.get(ConfigReader.getProperty(url));

    }
    @When("user logs in")
    public void user_logs_in() {
        homePage=new HomePage(driver);
        homePage.login.click();

    }
    @Then("user verifies function names")
    public void user_verifies_function_names(List<String> categories) {

        Assert.assertTrue(categories.size()==homePage.category.size());

        for (int i =0; i <categories.size() ; i++) {
            Assert.assertEquals(categories.get(i),homePage.category.get(i).getText().trim());
           // Assert.assertTrue(homePage.category.get(i).getText().contains(categories.get(i)));

        }
    }

}
