package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And; // Importando @And
import pages.Search360Page;

public class DemoCC360AutomationCucumber extends BaseTest {
    private Search360Page searchPage;

    @Given("abrir a pagina")
    public void abrirAPagina() {
        iniciarDriver();
        searchPage = new Search360Page(driver);
        searchPage.abrirPagina("https://demo.cc360.dxnet.io/search360/search360");
    }

    @When("meto {string}, {string}, {string} e {string}")
    public void metoE(String referencia, String agente, String email, String telefone) {
        searchPage.inserirTexto("#mat-input-0", referencia);
        searchPage.inserirTexto("#mat-input-1", agente);
        searchPage.inserirTexto("#mat-input-2", email);
        searchPage.inserirTexto("#mat-input-3", telefone);
    }

    @When("clico em Linha de Atendimento e seleciono opção")
    public void clicoEmLinhaDeAtendimentoESelecionoOpcao() {
        searchPage.clicarESelecionarOpcao("#mat-select-0 .mat-select-arrow", "#mat-option-0 > .mat-option-text");
    }

    @And("clico em Categoria e seleciono opção")
    public void clicoEmCategoriaESelecionoOpcao() {
        searchPage.clicarESelecionarOpcao("#mat-select-1 > .mat-select-trigger", "#mat-option-1 > .mat-option-text");
    }

    @And("clico em Sub-categoria e seleciono opção")
    public void clicoEmSubCategoriaESelecionoOpcao() {
        searchPage.clicarESelecionarOpcao("#mat-select-2 .mat-select-arrow-wrapper", "#mat-option-2 > .mat-option-text");
    }

    @And("clico em Motivo e seleciono opção")
    public void clicoEmMotivoESelecionoOpcao() {
        searchPage.clicarESelecionarOpcao("#mat-select-3 > .mat-select-trigger", "#mat-option-3 > .mat-option-text");
    }

    @And("clico em Estado e seleciono option")
    public void clicoEmEstadoESelecionoOption() {
        searchPage.clicarESelecionarOpcao("#mat-select-4 .mat-select-arrow", "#mat-option-4 > .mat-option-text");
    }

    @And("seleciono um periodo")
    public void selecionoUmPeriodo() {
        searchPage.selecionarPeriodo(
            "#academy-courses > div:nth-child(2) > div > div:nth-child(3) > mat-form-field.course-search.mat-form-field.ng-tns-c7-16.mat-primary.mat-form-field-type-mat-input.mat-form-field-appearance-outline.mat-form-field-can-float.mat-form-field-should-float.mat-form-field-has-label.ng-untouched.ng-pristine.ng-valid > div > div.mat-form-field-flex > div.mat-form-field-suffix.ng-tns-c7-16.ng-star-inserted > sat-datepicker-toggle > button",
            ".ng-star-inserted:nth-child(2) > .mat-calendar-body-cell:nth-child(2) > .mat-calendar-body-cell-content",
            ".ng-star-inserted:nth-child(5) > .mat-calendar-body-cell:nth-child(6) > .mat-calendar-body-cell-content"
        );
    }

    @And("clico em Procurar")
    public void clicoEmProcurar() {
        searchPage.clicarBotao("#academy-courses > div:nth-child(2) > div > div:nth-child(3) > div > button:nth-child(2) > span");
    }

    @And("clico em Voz e fecho")
    public void clicoEmVozEFecho() {
        searchPage.clicarBotao(".ng-tns-c13-18:nth-child(2)");
        searchPage.clicarBotao(".ng-tns-c13-18:nth-child(2)");
    }

    @And("clico em Email e fecho")
    public void clicoEmEmailEFecho() {
        searchPage.clicarBotao("#mat-expansion-panel-header-1");
        searchPage.clicarBotao(".ng-tns-c13-20:nth-child(2)");
    }

    @And("clico em Chat e fecho")
    public void clicoEmChatEFecho() {
        searchPage.clicarBotao(".ng-tns-c13-22:nth-child(2)");
        searchPage.clicarBotao(".ng-tns-c13-22:nth-child(2)");
    }

    @Then("fecho a pagina")
    public void fechoAPagina() {
        fecharDriver();
    }
}
