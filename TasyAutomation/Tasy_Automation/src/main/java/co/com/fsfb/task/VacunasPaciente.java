package co.com.fsfb.task;

import co.com.fsfb.userInterface.VacunasPacientePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class VacunasPaciente implements Task
{

    @Override
    public <T extends Actor> void performAs(T actor){


            actor.attemptsTo(

                WaitUntil.the(VacunasPacientePage.btnAddVacuna, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(VacunasPacientePage.btnAddVacuna),
                WaitUntil.the(VacunasPacientePage.listVacuna, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(VacunasPacientePage.listVacuna),
                WaitUntil.the(VacunasPacientePage.tipoVacuna, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(VacunasPacientePage.tipoVacuna),
                WaitUntil.the(VacunasPacientePage.btnAceptarVacuna, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(VacunasPacientePage.btnAceptarVacuna),
                WaitUntil.the(VacunasPacientePage.listDosisVacuna, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(VacunasPacientePage.listDosisVacuna),
                WaitUntil.the(VacunasPacientePage.tipoDosisVacuna, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(VacunasPacientePage.tipoDosisVacuna),
                Click.on(VacunasPacientePage.btnGuardar)

        );


    }
    public static  VacunasPaciente vacunasPaciente(){

        return Tasks.instrumented(VacunasPaciente.class);
    }
}
