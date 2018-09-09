package co.com.Hospital.Informacion.Registro.tasks;

import co.com.Hospital.Informacion.Registro.util.RegistroCitaMedicaPacientes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;



public class Iniciar implements Task{

	private RegistroCitaMedicaPacientes registroCitaMedicaPacientes;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(registroCitaMedicaPacientes));
		
	}
	
	public static Iniciar PaginaAdministracionCitas() {
		return Tasks.instrumented(Iniciar.class);
	}

	

}
