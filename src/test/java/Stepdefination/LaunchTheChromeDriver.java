package Stepdefination;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheChromeDriver {

    WebDriver driver;


    @Given("I click on the browser")
    public void i_click_on_the_browser() {
        System.setProperty("webdriver.chrome.driver","C://Program Files//SeleniumJarfile//chromedriver.exe");
       driver = new ChromeDriver();

    }

    @Then("I see the Google logo")
    public void iSeeTheGoogleLogo() {
        Boolean logo =driver.findElement(By.id("logo")).isDisplayed();
        Assert.assertEquals("True",logo);
    }

    @When("I wait for the page to load")
    public void iWaitForThePageToLoad() throws InterruptedException {
        Thread.sleep(1000);

    }

    @When("I close the browser")
    public void iCloseTheBrowser() {
        driver.quit();
    }

    @When("I enter the URl")
    public void iEnterTheURl() {
        driver.get("https://www.guru99.com/xpath-selenium.html");
    }

    @When("I see the Signupbutton")
    public void iSeeTheSignupbutton() {
        Boolean button = driver.findElement(By.xpath("/html/body/div[2]/main/section[1]/a")).isDisplayed();
        Assert.assertEquals("True",button);
    }

    @When("I click on create new account button")
    public void iClickOnCreateNewAccountButton() {
        driver.findElement(By.xpath("//*[contains(@data-testid,'open-registration-form-button')]")).click();
    }

    @When("I see the signup modal window")
    public void iSeeTheSignupModalWindow() {
        driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));

    }

    @When("I click on the Testing dropdown")
    public void iClickOnTheTestingDropdown() {
        WebElement  Testings = driver.findElement(By.xpath(""));




    }
}
