package co.com.fsfb.userInterface;

import co.com.fsfb.task.BuscarEspecialidad;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarEspecialidadPage
{
    public static final Target btnMenu = Target.the("Menu Hamburguesa").
            locatedBy("//button[@class='w-spotlight-hamburguer ng-scope']");
    public static final Target btnFuncciones = Target.the("Funciones").
            locatedBy("//li[@class='w-launcher__tab ng-scope']//a[@class='ng-binding'][normalize-space()='Funciones']");
    public static final Target txtBuscar = Target.the("Buscador").
            locatedBy("(//input[@type='text'])[10]");
    public static final Target btnControlInmunizacion = Target.the("Especialidad Control de inmunizaciones").
            locatedBy("//span[normalize-space()='Control de Inmunizaciones']");
}
