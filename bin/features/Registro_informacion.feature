#language:es
#Author: ecruz@choucairtesting.com

@RegresionHospital

Característica: Realizar el registro de la información básica de los usuarios del hospital, para gestionar la cita medica
  Como Doctor 
  Quiero Realizar la solicitud de una cita médica 
  A través del sistema de administración de Hospitales

 @RegistroDoctor
 
Esquema del escenario: 
    Dado que Elizabeth necesita registrar una persona en el sistema administrativo del Hospital
    Cuando ella realiza el registro del mismo en el aplicativo de Administración de Hospitales
    
   |Nombre|Apellidos|Telefono|TipoDocto|Documento|
   |<Nombre>|<Apellidos>|<Telefono>|<TipoDocto>|<Documento>|
   
    Entonces ella verifica que se presente en pantalla el mensaje Datos guardados correctamente.
  
Ejemplos:

|Nombre|Apellidos|Telefono|TipoDocto|Documento|
|Natalia|Cruz|3036268|Cédula de ciudadanía|2189183|


 @RegistroPaci
 
Esquema del escenario: 
    Dado que Elizabeth necesita registrar una persona en el sistema administrativo del Hospital
    Cuando ella realiza el registro en el aplicativo
    
   |Nombre|Apellidos|Telefono|TipoDocto|Documento|
   |<Nombre>|<Apellidos>|<Telefono>|<TipoDocto>|<Documento>|
   
  Entonces ella verifica que se presente en pantalla el mensaje Datos guardados correctamente.
   
Ejemplos:

|Nombre|Apellidos|Telefono|TipoDocto|Documento|
|Eliana|Cardona|3036268|Cédula de ciudadanía|6764301| 
  
  
 @CrearCitaMedica
 
 Esquema del escenario: 
    Dado que Elizabeth necesita acceder a una cita Medica
    Cuando Ella realiza el agendamiento de la cita
    
  |Fecha|DocIdentidadPaciente|DocumentoIdentidadDoctor|Observaciones|
 |<Fecha>|<DocIdentidadPaciente>|<DocumentoIdentidadDoctor>|<Observaciones>|
    
    Entonces ella verifica que se presente en pantalla el mensaje Datos guardados correctamente.
   
Ejemplos:

|Fecha|DocIdentidadPaciente|DocumentoIdentidadDoctor|Observaciones|
|09/18/2018|6786430|21829183|Cita prioritaria|
|09/12/2018|6786430|21829183|Cita prioritaria| 
  
  