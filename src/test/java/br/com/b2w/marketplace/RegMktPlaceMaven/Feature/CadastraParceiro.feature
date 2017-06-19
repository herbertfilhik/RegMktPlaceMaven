Feature: Cadastra Parceiro

	#DataTable for UserDetails using raw()
	@Registration
  Scenario: Cadastrar Parceiro com sucesso
    Given Que esteja na página Cadastra Parceiro
    Then Cadastro o novo parceiro
      | partnerId         |                40276534000163 |
      | company           |                40276534000163 |
      | municipalRegister |                40276534000163 |
      | trade             |                40276534000163 |
      | stateRegister     |                40276534000163 |
      | site              | www.40276534000163.com.br     |
      | income            | Acima de R$ 3.600.000,00      |
      | nome              |                40276534000163 |
      | document          |                40276534000163 |
      | phone             | "(40) 2765-34000"             |
      | mail              | 40276534000163@teste.com.br   |
      | plataform         | VTEX                          |
      | integrator 				| VTEX                          |     
      | cep               | "40276-534"                   |
      | endereco          |                40276534000163 |
      | bairro            |                40276534000163 |
      | numero            |                           100 |
      | comp              |                40276534000163 |
      | idEstado          | Sao Paulo                     |
      | idMunicipio       | Carapicuiba                   |
      | activity          | TELEFONIA                     |
