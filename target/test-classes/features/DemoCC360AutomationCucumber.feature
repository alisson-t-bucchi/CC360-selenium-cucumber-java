
Feature: realizar uma busca completa de uma informação na pagina Search 360

  Scenario Outline: realizar uma busca completa na pagina Search 360
    Given abrir a pagina
    When meto "referencia", "agente", "email" e "telefone"
    When clico em Linha de Atendimento e seleciono opção
    When clico em Categoria e seleciono opção
    When clico em Sub-categoria e seleciono opção
    When clico em Motivo e seleciono opção
    When clico em Estado e seleciono option
    When seleciono um periodo
    When clico em Procurar
    When clico em Voz e fecho
    When clico em Email e fecho
    When clico em Chat e fecho
    Then fecho a pagina



    Examples:
      | referencia   | agente   | email   | telefone   |
      | "referencia" | "agente" | "email" | "telefone" |
