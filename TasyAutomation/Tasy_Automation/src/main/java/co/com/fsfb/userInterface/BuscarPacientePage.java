package co.com.fsfb.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarPacientePage
{
    public static final Target btnLupa = Target.the("Boton Buscar paciente").
            locatedBy("//div[@class='person-bar-image-container-hover ng-scope']");
    public static final Target btnAtencion = Target.the("Opcon atencion").
            locatedBy("(//div[@class='wtab-label truncate wtab-link-horizontal'])[6]");

    public static final Target txtNombre = Target.the("Nombre paciente").
            locatedBy("//input[@name='DS_ATENDIMENTO']");
    public static final Target btnFiltrar = Target.the("Boton filtrar").
            locatedBy("(//button[@class='btn-green wfilter-button ng-binding'][normalize-space()='Filtrar'])[2]");
    public static final Target btnOkPaciente = Target.the("Boton ok Paciente").
            locatedBy("//button[@id='handlebar-452235']");
}
