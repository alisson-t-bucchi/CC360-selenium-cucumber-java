package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class NewLogin {

    WebDriver driver;

        @Given("acesso ao site")
        public void acessoAoSite() {

            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://formacao.cinel.pt");

        }

        @When("coloco {string} e {string}")
        public void colocoE (String usuario, String senha){

            driver.findElement(By.id("username")).sendKeys("username here");
            driver.findElement(By.id("password")).sendKeys("password here");

        }

        @Then("clico em entrar")
        public void clicoEmEntrar () throws InterruptedException {

            driver.findElement(By.cssSelector("button.btn")).click();
            sleep(5000);

            driver.quit();

        }
}
