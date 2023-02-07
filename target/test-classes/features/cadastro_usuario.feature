# language: pt

  @Cadastro
  Funcionalidade: Cadastro de usuario

    @cadastro-sucesso
    Cenario: Registrar novo usuario com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadatro
      E clico em registrar
      Entao vejo a mensagem de cadastro realizado