package co.com.fsfb.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//INICIAR QUE LA PRUEBA SE VA A EJECUTAR CON SERENITY
@RunWith(CucumberWithSerenity.class)

//RELACION DE DONDE ESTA UBICADO NUESTRA CONFIGURACION
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",//UBICACION DE DONDE SE ENCUENTRA NUESTROS FEACTURES
        glue = "stepDefinition", //UBICACION DE DONDE SE ENCUENTRA NUESTROS STEPS
        tags = "",//UBICACION DE DONDE SE ENCUENTRA NUESTRAS TAREAS
        snippets = SnippetType.CAMELCASE //INTERPRETA LA LECTURA DE LOS PASOS EN JAVA
)

public class Run {
}
