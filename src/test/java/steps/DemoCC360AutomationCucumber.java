package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCC360AutomationCucumber {

    WebDriver driver;
    @Given("abrir a pagina")
    public void abrirAPagina() throws InterruptedException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.cc360.dxnet.io/search360/search360");

        Thread.sleep(5000);
    }

    @When("meto {string}, {string}, {string} e {string}")
    public void metoE(String referencia, String agente, String email, String telefone) {

        WebElement RefInterna = driver.findElement(By.cssSelector("#mat-input-0"));
        RefInterna.sendKeys("1254");

        WebElement agenteInterno = driver.findElement(By.cssSelector("#mat-input-1"));
        agenteInterno.sendKeys("Francisco Carneiro");

        WebElement emailCliente = driver.findElement(By.cssSelector("#mat-input-2"));
        emailCliente.sendKeys("francisco.carneiro@gmail.com");

        WebElement telefoneCliente = driver.findElement(By.cssSelector("#mat-input-3"));
        telefoneCliente.sendKeys("913478990");

    }

    @When("clico em Linha de Atendimento e seleciono opção")
    public void clicoEmLinhaDeAtendimentoESelecionoOpção() throws InterruptedException {

        driver.findElement(By.cssSelector("#mat-select-0 .mat-select-arrow")).click();  //click Linha de Atendimento
        driver.findElement(By.cssSelector("#mat-option-0 > .mat-option-text")).click(); //select Tudo
    }

    @When("clico em Categoria e seleciono opção")
    public void clicoEmCategoriaESelecionoOpção() throws InterruptedException {

        driver.findElement(By.cssSelector("#mat-select-1 > .mat-select-trigger")).click(); //click Categoria
        driver.findElement(By.cssSelector("#mat-option-1 > .mat-option-text")).click(); //select Tudo
    }

    @When("clico em Sub-categoria e seleciono opção")
    public void clicoEmSubCategoriaESelecionoOpção() throws InterruptedException {

        driver.findElement(By.cssSelector("#mat-select-2 .mat-select-arrow-wrapper")).click(); //click Sub-categoria
        driver.findElement(By.cssSelector("#mat-option-2 > .mat-option-text")).click();         //select Tudo
    }

    @When("clico em Motivo e seleciono opção")
    public void clicoEmMotivoESelecionoOpção() throws InterruptedException {

        driver.findElement(By.cssSelector("#mat-select-3 > .mat-select-trigger")).click(); //click Motivo
        driver.findElement(By.cssSelector("#mat-option-3 > .mat-option-text")).click(); //select Tudo
    }

    @When("clico em Estado e seleciono option")
    public void clicoEmEstadoESelecionoOption() throws InterruptedException {

        driver.findElement(By.cssSelector("#mat-select-4 .mat-select-arrow")).click(); //click Estado
        driver.findElement(By.cssSelector("#mat-option-4 > .mat-option-text")).click(); //select Tudo
    }

    @When("seleciono um periodo")
    public void selecionoUmPeriodo() throws InterruptedException {

        driver.findElement(By.cssSelector("#academy-courses > div:nth-child(2) > div > div:nth-child(3) > mat-form-field.course-search.mat-form-field.ng-tns-c7-16.mat-primary.mat-form-field-type-mat-input.mat-form-field-appearance-outline.mat-form-field-can-float.mat-form-field-should-float.mat-form-field-has-label.ng-untouched.ng-pristine.ng-valid > div > div.mat-form-field-flex > div.mat-form-field-suffix.ng-tns-c7-16.ng-star-inserted > sat-datepicker-toggle > button")).click();  //open calendar

        Thread.sleep(5000);

        driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(2) > .mat-calendar-body-cell:nth-child(2) > .mat-calendar-body-cell-content")).click();
        driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(5) > .mat-calendar-body-cell:nth-child(6) > .mat-calendar-body-cell-content")).click();
    }

    @When("clico em Procurar")
    public void clicoEmProcurar() throws InterruptedException {

        driver.findElement(By.cssSelector("#academy-courses > div:nth-child(2) > div > div:nth-child(3) > div > button:nth-child(2) > span")).click(); //Search button

        Thread.sleep(15000);

    }

    @When("clico em Voz e fecho")
    public void clicoEmVozEFecho() throws InterruptedException {

        driver.findElement(By.cssSelector(".ng-tns-c13-18:nth-child(2)")).click();  //Open Voz

        Thread.sleep(10000);

        driver.findElement(By.cssSelector(".ng-tns-c13-18:nth-child(2)")).click(); //Close Voz

    }


    @When("clico em Email e fecho")
    public void clicoEmEmailEFecho() throws InterruptedException {

        driver.findElement(By.id("mat-expansion-panel-header-1")).click(); //Open Email

        Thread.sleep(10000);

        driver.findElement(By.cssSelector(".ng-tns-c13-20:nth-child(2)")).click(); //Close Email

    }


    @When("clico em Chat e fecho")
    public void clicoEmChatEFecho() throws InterruptedException {

        driver.findElement(By.cssSelector(".ng-tns-c13-22:nth-child(2)")).click(); //Open Chat

        Thread.sleep(10000);

        driver.findElement(By.cssSelector(".ng-tns-c13-22:nth-child(2)")).click(); //Close Chat

    }

    @Then("fecho a pagina")
    public void fechoAPagina() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();

    }
}
