package co.com.fsfb.task;

import co.com.fsfb.userInterface.BuscarEspecialidadPage;
import co.com.fsfb.userInterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BuscarEspecialidad implements Task
{


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BuscarEspecialidadPage.btnMenu, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BuscarEspecialidadPage.btnMenu),
                Click.on(BuscarEspecialidadPage.btnFuncciones),
                Enter.theValue("Control de inmunizaciones").into(BuscarEspecialidadPage.txtBuscar),
                WaitUntil.the(BuscarEspecialidadPage.btnControlInmunizacion, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BuscarEspecialidadPage.btnControlInmunizacion)


        );
    }
    public static  BuscarEspecialidad buscarEspecialidad(){

        return Tasks.instrumented(BuscarEspecialidad.class);
    }
}
