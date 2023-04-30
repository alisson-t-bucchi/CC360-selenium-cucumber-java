package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.*;

public class NewLogin {

    WebDriver driver;

    @Given("acedo ao site")
    public void acedoAoSite() throws IOException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formacao.cinel.pt");

        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //Take the screenshot
        FileUtils.copyFile(screenshot1, new File("C:\\Screenshots\\NewLoginCucumber1.png"));

    }

    @When("coloco {string} e {string}")
    public void colocoE(String usuario, String senha) throws IOException {

        driver.findElement(By.id("username")).sendKeys("Alisson_Bucchi");
        driver.findElement(By.id("password")).sendKeys("#ATBucchi081982");

        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //Take the screenshot
        FileUtils.copyFile(screenshot1, new File("C:\\Screenshots\\NewLoginCucumber2.png"));

    }

    @Then("clico em entrar")
    public void clicoEmEntrar() throws InterruptedException, IOException {

        driver.findElement(By.cssSelector("button.btn")).click();
        sleep(5000);

        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //Take the screenshot
        FileUtils.copyFile(screenshot1, new File("C:\\Screenshots\\NewLoginCucumber3.png"));

        driver.quit();

    }
}


