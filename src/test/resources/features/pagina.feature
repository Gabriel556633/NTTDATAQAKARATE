Feature: Purchase productos de Opencart

  @producto1Path
    #Scenario: Proceso de compra1
    Scenario Outline: Proceso de compra1

    Given USer ingreso a la pagina OpenCart
    When selecciono un producto
    Then agrego producto al carrito
    And voy al carrito

    When ingreso datos <first_name> <last_name> <email> <phone> <company> <address> <city> <post_code> <country> <region>
    Then voy a nuevo formulario

    Examples:
          | first_name | last_name | email      | phone      | company | address | city  | post_code | country | region    |
          | Gabriel    | Borja     | gb@123.com | 0995787383 | GBM     | Quito   | Quito | 123456    | Ecuador | Pichincha |
