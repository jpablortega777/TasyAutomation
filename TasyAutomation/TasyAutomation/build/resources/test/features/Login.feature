Feature: login Tasy

  Scenario: autenticacion en la web Tasy
    Given que el cliente debe ingresar con credenciales
    When cuente con un pass y user

    Then aprecera habilitadas las funciones del rol

