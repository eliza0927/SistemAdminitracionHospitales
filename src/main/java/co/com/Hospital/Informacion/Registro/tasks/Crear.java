package co.com.Hospital.Informacion.Registro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import co.com.Hospital.Informacion.Registro.model.RegistroInformacion;
import co.com.Hospital.Informacion.Registro.util.RegistroInformacionPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Crear implements Task {

	private List<RegistroInformacion> Datos;
	
	public Crear(List<RegistroInformacion> Datos)
	{
		this.Datos=Datos;
	}
	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(RegistroInformacionPage.BOTON_FORMULARIO_PACIENTE));
		actor.attemptsTo(Enter.theValue(Datos.get(0).getNombre()).into(RegistroInformacionPage.DOCTOR));	
		actor.attemptsTo(Enter.theValue(Datos.get(0).getApellidos()).into(RegistroInformacionPage.APELLIDO));
		actor.attemptsTo(Enter.theValue(Datos.get(0).getTelefono()).into(RegistroInformacionPage.TELEFONO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(Datos.get(0).getTipoDocto()).from(RegistroInformacionPage.TIPO_DOCUMENTO_PACIENTE));
		actor.attemptsTo(Enter.theValue(Datos.get(0).getDocumento()).into(RegistroInformacionPage.NRO_DOCUMENTO));
		actor.attemptsTo(Click.on(RegistroInformacionPage.CHECK_PREPAGADA));
		actor.attemptsTo(Click.on(RegistroInformacionPage.BOTON_GUARDA));
		
	}

	public static Crear RegistroInfoPacientes(List<RegistroInformacion> datos) {
	
		return instrumented(Crear.class,datos);
	}

}
