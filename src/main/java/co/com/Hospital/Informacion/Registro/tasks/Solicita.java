package co.com.Hospital.Informacion.Registro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import co.com.Hospital.Informacion.Registro.model.RegistroCitaMedica;
import co.com.Hospital.Informacion.Registro.util.RegistroCitaMedicaPacientes;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Solicita implements Task {

	
	
private List<RegistroCitaMedica> Datos;
	
	public Solicita(List<RegistroCitaMedica> Datos)
	{
		this.Datos=Datos;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Click.on(RegistroCitaMedicaPacientes.BOTON_FORMULARIO_CITAS));
	
		actor.attemptsTo(Enter.theValue(Datos.get(0).getFecha()).into(RegistroCitaMedicaPacientes.FECHA_CITA));	
		actor.attemptsTo(Enter.theValue(Datos.get(0).getDocIdentidadPaciente()).into(RegistroCitaMedicaPacientes.DOC_IDENTIDAD_PACIENTE));
		actor.attemptsTo(Enter.theValue(Datos.get(0).getDocumentoIdentidadDoctor()).into(RegistroCitaMedicaPacientes.DOC_IDENTIDAD_DOCTOR));
		actor.attemptsTo(Enter.theValue(Datos.get(0).getObservaciones()).into(RegistroCitaMedicaPacientes.OBSERVACIONES));
		actor.attemptsTo(Click.on(RegistroCitaMedicaPacientes.BOTON_GUARDA));
	
	}

	
	public static Solicita SuCitaMedicaConLosSiguientes(List<RegistroCitaMedica> datos) {
		
		return instrumented(Solicita.class,datos);
	}

}
