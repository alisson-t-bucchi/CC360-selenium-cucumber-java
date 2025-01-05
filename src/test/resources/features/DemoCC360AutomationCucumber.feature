Feature: realizar uma busca completa de uma informação na pagina Search 360

  Scenario Outline: realizar uma busca completa na pagina Search 360
    Given abrir a pagina
    When meto "referencia", "agente", "email" e "telefone"
    And clico em Linha de Atendimento e seleciono opção
    And clico em Categoria e seleciono opção
    And clico em Sub-categoria e seleciono opção
    And clico em Motivo e seleciono opção
    And clico em Estado e seleciono option
    And seleciono um periodo
    And clico em Procurar
    And clico em Voz e fecho
    And clico em Email e fecho
    And clico em Chat e fecho
    Then fecho a pagina

    Examples:
      | referencia   | agente   | email   | telefone   |
      | "referencia" | "agente" | "email" | "telefone" |