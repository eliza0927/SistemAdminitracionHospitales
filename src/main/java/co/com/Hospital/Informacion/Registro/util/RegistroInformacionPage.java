package co.com.Hospital.Informacion.Registro.util;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class RegistroInformacionPage  extends PageObject{


	
	public static final Target BOTON_FORMULARIO_DOCTOR = Target.the("Acceder Formulario Doctor")
			.located(By.partialLinkText("Doctor"));
	
	public static final Target DOCTOR = 
			Target.the("First Name").located(By.xpath("//input[@placeholder='Ingrese el nombre']"));
	
	public static final Target APELLIDO=Target.the("Apellidos del doctor")
			.located(By.xpath("//input[@placeholder='Ingrese los apellidos']"));
	
	public static final Target TELEFONO=Target.the("Telefono del doctor")
			.located(By.xpath("//input[@placeholder='Ingrese el teléfono']"));
	
	

	public static final Target TIPO_DOCUMENTO=Target.the("Tipo de documento del Doctor")
			.located(By.xpath(("//select[@id='identification_type']")));
	
	public static final Target TIPO_DOCUMENTO_PACIENTE=Target.the("Tipo de documento del Doctor")
			.located(By.xpath(("//select[@name='identification_type']")));
	
	
	public static final Target NRO_DOCUMENTO=Target.the("Nro de documento del doctor")
			.located(By.xpath("//input[@placeholder='Ingrese el documento de identidad']"));
	
	
	public static final Target BOTON_GUARDA=Target.the("Boton para guardar la información registrada del doctor")
			.located(By.partialLinkText("Guardar"));
	

	public static final Target RESULTADO_GUARDADO=Target.the("Texto Doctor Guardado con exitoso")
			.located(By.xpath("//div[@class='panel-body']/p"));
	

	public static final Target BOTON_FORMULARIO_PACIENTE = Target.the("Acceder Formulario Paciente")
			.located(By.partialLinkText("Paciente"));
	
	public static final Target CHECK_PREPAGADA=Target.the("Seleccionar Prepagada")
			.located(By.name("prepaid"));
	
	
	
	
	
}
