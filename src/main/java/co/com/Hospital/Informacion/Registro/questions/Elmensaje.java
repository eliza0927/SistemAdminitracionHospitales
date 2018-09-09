package co.com.Hospital.Informacion.Registro.questions;

import co.com.Hospital.Informacion.Registro.util.RegistroInformacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Elmensaje  implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	
		//System.out.println(Text.of(RegistroInformacionPage.RESULTADO_GUARDADO).viewedBy(actor).asString());
		return Text.of(RegistroInformacionPage.RESULTADO_GUARDADO).viewedBy(actor).asString();
	}

	public static Elmensaje es() {
		return new Elmensaje();
	}

}


