package co.com.Hospital.Informacion.Registro.tasks;

import co.com.Hospital.Informacion.Registro.util.RegistroInformacionPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	private RegistroInformacionPage registroInformacionPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(registroInformacionPage));
		
	}

	public static Abrir PaginaSistemAdministracionHospital() {
		return Tasks.instrumented(Abrir.class);
	}

	
	
}
