Feature: QA KARATE CONSUMO DE API


  Background:
    * url 'https://petstore.swagger.io/'


  Scenario: crear un usuario nuevo
    * def user =
      """
      {
          "id": 0,
          "username": "2",
          "firstName": "Gabriel",
          "lastName": "Borja",
          "email": "gaielbcoso123@hotmail.com",
          "password": "123",
          "phone": "123456789",
          "userStatus": 1
        }
      }
      """

    Given url 'https://petstore.swagger.io/v2/user'
    And request user
    When method post
    Then status 201

    * def id = response.id
    * print 'id creado es: ', id

    Given path id
    # When method get
    # Then status 200
    # And match response contains user

  Scenario: Obtener el USUARIO CREADO con id
    Given url 'https://petstore.swagger.io/v2/user/2'
    When method get
    Then status 200

    * def first = response[0]






  Scenario: actualizar un Usuario
    * def user =
      """
      {
          "id": 0,
          "username": "2",
          "firstName": "Gabriel3333",
          "lastName": "Borja3333333333",
          "email": "gaielbcoso123@hotmail.com",
          "password": "12333333",
          "phone": "123456789",
          "userStatus": 0
        }
      }
      """

    Given url 'https://petstore.swagger.io/v2/user/2'
    And request user
    When method put
    Then status 201

    * def id = response.id
    * print 'id creado es: ', id

    Given path id
    # When method get
    # Then status 200
    # And match response contains user





  Scenario: Eliminar el USUARIO CREADO con id
    Given url 'https://petstore.swagger.io/v2/user/2'
    When method delete
    Then status 200

    * def first = response[0]

    #Given path 'users', first.id
    When method get
    Then status 200





