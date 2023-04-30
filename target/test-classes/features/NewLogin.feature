Feature: realizar login com cadastro criado

  Scenario Outline: realizar login no site
    Given acedo ao site
    When coloco "usuario" e "senha"
    Then clico em entrar
    Examples:
      | usuario   | senha   |
      | "usuario" | "senha" |