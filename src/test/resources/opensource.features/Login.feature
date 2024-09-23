Feature: Pruebas de Login en Opensource

    @Funcional
    Scenario: Validar Login exitoso
        Given Se accede a la pagina de Opensource
        When Se ingresan credenciales
        And Se ingresa el candidato
        Then Se valida estar en el home logueado


