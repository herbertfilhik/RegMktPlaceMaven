Feature: Navegacao Geral Chrome

  Scenario: Navegacao Geral Chrome
    Given Usuário está na página Chrome
    When Usuário faz login na página Chrome
    And usuário digita usuário e senha Chrome
    Then exibe mensagem de sucesso do login Chrome
    Then usuário navega pelos menus Chrome
    When usuário efetua logout Chrome
    Then mensagem ao usuário informando o logout com sucesso Chrome
