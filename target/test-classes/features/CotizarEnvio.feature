Feature: Cotizar envío

#Escenario 1
  @TestCase1
  Scenario: Ingresar a la páina de Cotizar envío
    Given Estoy en la página de inicio de Interrapidisimo
    When voy a la sección 'Cotiza tu envío'
    Then valido que se muestre correctamente la página "Cotiza tu envío"


#Escenario 2
  @TestCase2
  Scenario: Validar obligatoriedad de los campos del formulario de cotizar envío sin diligenciar ningún campo
    Given Estoy en la página de inicio de Interrapidisimo
    And voy a la sección "Cotiza tu envío"
    When cotizo el envío
    Then se muestra un mensaje de validación de obligatoriedad para los campos
     #Campos obligatorios: Ciudad Origen, Ciudad destino, Peso real bascula y tipo de entrega.


#Scenario 3.
  @TestCase3
  Scenario: Validar obligatoriedad del campo 'Ciudad Origen' del formulario de cotizar envío
    Given Estoy en la página de inicio de Interrapidisimo
    And voy a la sección 'Cotiza tu envío'
    When diligencio el formulario sin llenar el campo "Ciudad Origen"
    Then se muestra un mensaje de validación de obligatoriedad para el campo 'Ciudad Origen'

#Scenario 4.
  @TestCase4
  Scenario: Validar obligatoriedad del campo 'Ciudad Destino' del formulario de cotizar envío
    Given Estoy en la página de inicio de Interrapidisimo
    And voy a la sección 'Cotiza tu envío'
    When diligencio el formulario sin llenar el campo "Ciudad Origen"
    Then se muestra un mensaje de validación de obligatoriedad para el campo 'Ciudad Destino'
