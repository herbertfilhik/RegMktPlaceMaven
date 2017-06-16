Feature: Navegacao Meus Produtos

  Scenario: Navegacao Meus Produtos
    Given Usuário está na página Meus Produtos
    When Usuário faz login na página Meus Produtos
    And usuário digita usuário e senha Meus Produtos
    Then exibe mensagem de sucesso do login Meus Produtos
    Then usuário navega até o menu Meus Produtos
    Then usuário valida itens da tela e seus acessos Meus Produtos
    When usuário efetua logout Meus Produtos
    Then mensagem ao usuário informando o logout com sucesso Meus Produtos
