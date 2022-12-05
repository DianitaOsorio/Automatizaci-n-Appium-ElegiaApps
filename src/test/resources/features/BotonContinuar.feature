#language: es

Característica: No habilitar boton continuar

  @BotonContinuar
    Escenario: validar que el boton continuar no se habilite
    Dado que el usuario modifique las apps
    Cuando quede una app pendiente por seleccionar
    Entonces el boton continuar no se habilite

