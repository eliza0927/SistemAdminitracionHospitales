package co.com.Hospital.Informacion.Registro.util;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class RegistroCitaMedicaPacientes extends PageObject {

	public static final Target BOTON_FORMULARIO_CITAS = Target.the("Acceder Formulario para la creación de la cita"
			+ "medica")
			.located(By.partialLinkText("Cita"));
	
	public static final Target DOC_IDENTIDAD_PACIENTE = 
			Target.the("Documento identidad Paciente")
			.located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
	
	public static final Target FECHA_CITA = 
			Target.the("Fecha Cita Medica")
			.located(By.xpath("//div[@class='form-group']//input[@id='datepicker']"));
					
	
	
	public static final Target DOC_IDENTIDAD_DOCTOR = 
			Target.the("Documento identidad Doctor")
			.located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
	
	public static final Target OBSERVACIONES = 
			Target.the("Observaciones Cita Medica")
			.located(By.xpath("//div[@class='form-group']/textarea"));
	
	public static final Target BOTON_GUARDA=Target.the("Boton para guardar la información de la cita medica del paciente")
			.located(By.partialLinkText("Guardar"));
	
}
