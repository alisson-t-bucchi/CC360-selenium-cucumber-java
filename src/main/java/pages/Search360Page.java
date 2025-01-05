package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Search360Page {
    private WebDriver driver;
    private WebDriverWait wait;

    public Search360Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Métodos para interações com a página
    public void abrirPagina(String url) {
        driver.get(url);
    }

    public void inserirTexto(String seletor, String texto) {
        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(seletor)));
        elemento.clear();
        elemento.sendKeys(texto);
    }

    public void clicarESelecionarOpcao(String seletorClique, String seletorOpcao) {
        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(seletorClique)));
        elemento.click();
        WebElement opcao = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(seletorOpcao)));
        opcao.click();
    }

    public void clicarBotao(String seletor) {
        WebElement botao = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(seletor)));
        botao.click();
    }

    public void selecionarPeriodo(String seletorCalendario, String seletorInicio, String seletorFim) {
        clicarBotao(seletorCalendario); // Abre o calendário
        clicarBotao(seletorInicio);    // Seleciona a data inicial
        clicarBotao(seletorFim);       // Seleciona a data final
    }
}
