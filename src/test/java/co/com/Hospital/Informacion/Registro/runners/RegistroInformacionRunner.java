package co.com.Hospital.Informacion.Registro.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			features="src/test/resources/features/Registro_informacion.feature",
			tags= "@RegresionHospital",
			glue="co.com.Hospital.Informacion.Registro.StepDefinitions",
			snippets=SnippetType.CAMELCASE	
			
			
			)

public class RegistroInformacionRunner {

}
