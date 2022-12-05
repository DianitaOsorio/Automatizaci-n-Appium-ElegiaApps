#language: es

Característica: Validar boton cambiar apps

  @IngresarAPantallaResumenApps
  Escenario: validar que regrese la pantalla anterior
    Dado que el usuario ingrese a la pantalla de resumen
    Cuando da click en boton cambiar apps
    Entonces regrese a la pantalla de las ultimas apps seleccionadas

