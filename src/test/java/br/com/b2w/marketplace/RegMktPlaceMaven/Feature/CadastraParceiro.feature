Feature: Cadastra Parceiro

	#DataTable for UserDetails using raw()
	@Registration
  Scenario: Cadastrar Parceiro com sucesso
    Given Que esteja na página Cadastra Parceiro
    Then Cadastro o novo parceiro
      | partnerId         |                40276534000162 |
      | company           |                40276534000162 |
      | municipalRegister |                40276534000162 |
      | trade             |                40276534000162 |
      | stateRegister     |                40276534000162 |
      | site              | "www.40276534000162.com.br"   |
      | income            | "Acima de R$ 3.600.000,00"    |
      | nome              |                40276534000162 |
      | document          |                40276534000162 |
      | phone             | "(40) 2765-34000"             |
      | mail              | "40276534000162@teste.com.br" |
      | plataform         | "VTEX"                        |
      |integrator 				| "VTEX"                        |      
      | cep               | "40276-534"                   |
      | endereco          |                40276534000162 |
      | bairro            |                40276534000162 |
      | numero            |                           100 |
      | comp              |                40276534000162 |
      | idEstado          | "Sao Paulo"                   |
      | idMunicipio       | "Carapicuiba"                 |
      | activity          | "TELEFONIA"                   |
