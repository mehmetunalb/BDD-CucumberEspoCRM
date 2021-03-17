package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccountPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;

public class ClickAccountSteps {
    WebDriver driver;
    HomePage homePage;
    CreateAccountPage createAccountPage;

    @Given("user navigates to espocrm {string}")
    public void user_navigates_to_espocrm(String url) {
        driver=Driver.getDriver();
        driver.get(ConfigReader.getProperty(url));
    }

    @When("user is on accounts page")
    public void user_is_on_accounts_page() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.login.click();
        Thread.sleep(2000);
        homePage.clickAccount();
    }
    @When("user clicks on create account button")
    public void user_clicks_on_create_account_button() {
        createAccountPage=new CreateAccountPage(driver);
        createAccountPage.clickCreateAccount();
    }
    @When("user enter {string}, {string},{string},{string}")
    public void user_enter(String name, String website, String country, String type) throws InterruptedException {
        Thread.sleep(2000);
        createAccountPage.fillAccountInfo(name,website,country,type);
    }
    @Then("user verifies his, her info {string}, {string},{string},{string}")
    public void user_verifies_his_her_info(String name, String website, String country, String type) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(name,createAccountPage.verifyName.getText());
        Assert.assertEquals(website,createAccountPage.verifyWebsite.getText());
        Assert.assertEquals(country,createAccountPage.verifyCountry.getText());
        Assert.assertEquals(type,createAccountPage.verifyType.getText());
    }


}
