Feature: PRUEBAS AUTOMATIZADAS TASY

  @LoginTasy
  Scenario Outline: Iniciar sesion en Tasy
    Given el usuario ingresa a la web de Tasy
    When el usuario ingrese los datos <user> y <pass>
    Then la sesion inicia correctamente al rol de usuarioArea
    Examples:
    |user|pass|
    |daniel.sanchez|Test1234+|

