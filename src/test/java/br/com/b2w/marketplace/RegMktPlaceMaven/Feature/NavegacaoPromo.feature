Feature: Navegacao Promo

  Scenario: Navegacao Promo
    Given usuario está na pagina de promocao
    And navega pela tela de promocao
    Then deve acessar os elementos
    Then realizar o logout
