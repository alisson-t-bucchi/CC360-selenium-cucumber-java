package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class SeleniumWebformActions {

    WebDriver driver;

    @Given("acesso a pagina")
    public void acessoAPagina() {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    }

    @When("coloco {string}, {string} e {string}")
    public void colocoE(String texto1, String senha, String texto2) {

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement passwordBox = driver.findElement(By.name("my-password"));
        WebElement textArea = driver.findElement(By.name("my-textarea"));

        textBox.sendKeys("Selenium");
        passwordBox.sendKeys("ali1982");
        textArea.sendKeys("Isso é um teste realizado na Web form da página Selenium dev.");

    }

    @And("seleciono opção")
    public void selecionoOpção() throws InterruptedException {

        Select drpValue = new Select(driver.findElement(By.name("my-select")));
        drpValue.selectByValue("1");

        sleep(3000);

    }

    @Then("encerro a pagina")
    public void encerroAPagina() throws InterruptedException {

        sleep(5000);
        driver.quit();
    }

}
