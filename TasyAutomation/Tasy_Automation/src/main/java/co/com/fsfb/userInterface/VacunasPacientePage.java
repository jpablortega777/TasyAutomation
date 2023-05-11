package co.com.fsfb.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class VacunasPacientePage
{
    public static final Target btnAddVacuna = Target.the("Boton añadir vacuna").
            locatedBy("/html/body/div[1]/tasy-corsisf1/div/w-mainlayout/div/div/feature-instance[2]/atepaceo/div/div[2]/div[1]/tasy-wtab-panel/div/div/div[2]/tasy-tab-page[1]/div/div/div/div/tasypopupmenu/tasy-wdbpanel/div/div[2]/div[2]/tasy-handlebar-new/div/div[1]/div/button[1]/span");
    public static final Target listVacuna = Target.the("Boton añadir vacuna").
            locatedBy("/html/body/div[1]/tasy-corsisf1/div/w-mainlayout/div/div/feature-instance[2]/atepaceo/div/div[2]/div[1]/tasy-wtab-panel/div/div/div[2]/tasy-tab-page[1]/div/div/div/div/tasypopupmenu/tasy-wdbpanel/div/div[2]/div[4]/div[2]/tasy-wmdetail/div[2]/div[3]/form/div[1]/div[14]/div[2]/tasy-listbox/div/div");

    //div[@class='wtitle-container margin']
    public static final Target tipoVacuna = Target.the("Opcon atencion").
            locatedBy("//span[@class='ng-binding ng-scope' and text()='Hepatitis A']//parent::a");
    public static final Target btnAceptarVacuna = Target.the("Aceptar vacuna").
            locatedBy("//button[@class='gwt-Button btn-blue']");
    public static final Target listDosisVacuna = Target.the("Dosis vacuna").
            locatedBy("/html/body/div[1]/tasy-corsisf1/div/w-mainlayout/div/div/feature-instance[2]/atepaceo/div/div[2]/div[1]/tasy-wtab-panel/div/div/div[2]/tasy-tab-page[1]/div/div/div/div/tasypopupmenu/tasy-wdbpanel/div/div[2]/div[4]/div[2]/tasy-wmdetail/div[2]/div[3]/form/div[1]/div[17]/div[2]/tasy-listbox/div/div");
    public static final Target tipoDosisVacuna = Target.the("tipo Dosis vacuna").
            locatedBy("//span[@class='ng-binding ng-scope' and text()='Dosis adicional']//parent::a");
    public static final Target btnGuardar = Target.the("Guardar").
            locatedBy("//div[@class='wbutton-container enable btn-blue']");
    //div[@class='wbutton-container enable btn-blue']
}
