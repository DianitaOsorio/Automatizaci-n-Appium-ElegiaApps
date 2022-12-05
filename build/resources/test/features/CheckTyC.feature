#language: es

Característica: No continuar sin aceptar TyC
  @CheckboxTyC
  Escenario: validar que no coninue sin aceptar TyC
    Dado que el usuario actualice las apps
    Cuando da click en boton continuar
    Entonces no debe permitir seguir sin aceptar TyC
