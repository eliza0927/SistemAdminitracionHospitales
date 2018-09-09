package co.com.Hospital.Informacion.Registro.StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.Hospital.Informacion.Registro.model.RegistroCitaMedica;
import co.com.Hospital.Informacion.Registro.model.RegistroInformacion;
import co.com.Hospital.Informacion.Registro.questions.Elmensaje;
import co.com.Hospital.Informacion.Registro.tasks.Abrir;

import co.com.Hospital.Informacion.Registro.tasks.Crear;
import co.com.Hospital.Informacion.Registro.tasks.Iniciar;
import co.com.Hospital.Informacion.Registro.tasks.Realizar;
import co.com.Hospital.Informacion.Registro.tasks.Solicita;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegistroInformacionStepDefinitions {

	@Managed(driver="chrome")
	private WebDriver SuNavegador;
	private Actor Elizabeth= Actor.named("Elizabeth");
	
	
	@Before
	public void ConfiguracionInciai()
	{
		Elizabeth.can(BrowseTheWeb.with(SuNavegador));
	}
	
	@Dado("^que Elizabeth necesita registrar una persona en el sistema administrativo del Hospital$")
	public void queElizabethNecesitaRegistrarUnaPersonaEnElSistemaAdministrativoDelHospital() throws Exception {
	    Elizabeth.wasAbleTo(Abrir.PaginaSistemAdministracionHospital());
	   
	}
	
	@Cuando("^ella realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
	public void 
	ellaRealizaElRegistroDelMismoEnElAplicativoDeAdministraciónDeHospitales(List<RegistroInformacion>Datos) throws Exception {
	    
		Elizabeth.attemptsTo(Realizar.RegistroInfoDoctor(Datos));
	
	}
	
	@Cuando("^ella realiza el registro en el aplicativo$")
	public void ellaRealizaElRegistroEnElAplicativo(List<RegistroInformacion>Datos) throws Exception {
		Elizabeth.attemptsTo(Crear.RegistroInfoPacientes(Datos));
	}
		
	@Entonces("^ella verifica que se presente en pantalla el mensaje (.*)")
	public void ellaVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String Mensaje) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Elizabeth.should(seeThat(Elmensaje.es(), equalTo(Mensaje)));
	}
	
	
	@Dado("^que Elizabeth necesita acceder a una cita Medica$")
	public void queElizabethNecesitaAccederAUnaCitaMedica() throws Exception {
		  Elizabeth.wasAbleTo(Iniciar.PaginaAdministracionCitas());
	}
	
	@Cuando("^Ella realiza el agendamiento de la cita$")
	public void ellaRealizaElAgendamientoDeLaCita(List<RegistroCitaMedica>Datos) throws Exception {
		
		Elizabeth.attemptsTo(Solicita.SuCitaMedicaConLosSiguientes(Datos));
	    
	}
	
	




	
	
	
	
	
	


	
	
	
	
	
}
