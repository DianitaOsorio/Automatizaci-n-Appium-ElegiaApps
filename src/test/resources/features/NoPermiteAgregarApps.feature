#language: es

Característica: Validar que no permita agregar Apps

  @NoPermiteAgregarApps
   Escenario: Mensaje exitoso
    Dado que el usuario visualice las apps precargadas
    Cuando realice el cambio de apps
    Entonces  valida el mensaje Tu plan no permite agregar mas apps
    Y direccione a sitio web de planes pospago
