Feature: realizar ações no site Selenium Webform

  Scenario Outline: realizar ações no site do Selenium Webform
    Given acesso a pagina
    When coloco "texto1", "senha" e "texto2"
    And seleciono opção
    Then encerro a pagina
    Examples:
      | texto1   | senha   | texto2   |
      | "texto1" | "senha" | "texto2" |

