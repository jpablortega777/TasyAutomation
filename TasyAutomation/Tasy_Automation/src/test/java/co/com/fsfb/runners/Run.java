package co.com.fsfb.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/login.feature",//UBICACION DE DONDE SE ENCUENTRA NUESTROS FEACTURES
        glue = "co.com.fsfb.stepDefinition", //UBICACION DE DONDE SE ENCUENTRA NUESTROS STEPS
        tags = "@LoginTasy",//UBICACION DE DONDE SE ENCUENTRA NUESTRAS TAREAS
        snippets = SnippetType.CAMELCASE //INTERPRETA LA LECTURA DE LOS PASOS EN JAVA
)

public class Run {
}
