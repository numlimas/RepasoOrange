package opensource.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosCandidatosPage {

    public static final Target INP_PRIMER_NOMBRE = Target.the("Caja de texto para primer nombre")
            .located(By.xpath("//input[@name='firstName']"));

    public static final Target INP_SEGUNDO_NOMBRE = Target.the("Caja de texto para segundo nombre")
                    .located(By.xpath("//input[@name='middleName']"));

    public static final Target INP_APELLIDO = Target.the("Caja de texto para apellido")
            .located(By.xpath("//input[@name='lastName']"));

    public static final Target INP_CORREO = Target.the("Caja de texto para correo")
            .located(By.xpath("(//input[@placeholder='Type here'])[1]"));

    public static final Target INP_NUMERO = Target.the("Caja de texto para numero")
            .located(By.xpath("(//input[@placeholder='Type here'])[2]"));

    public static final Target INP_PALABRAS_CLAVE = Target.the("Caja de texto para palabras clave")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));

    public static final Target INP_OBSERVACIONES = Target.the("Caja de texto para observaciones")
            .located(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']"));

    public static final Target INP_FECHA = Target.the("Caja de texto para fecha")
            .located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));

    public static final Target BTN_LISTA = Target.the("boton de dropdown")
            .locatedBy("//div[@class='oxd-select-text-input']");

    public static final Target LISTA_OPTIONES = Target.the("opciones del dropdown")
            .locatedBy("//div[contains(@class,'oxd-select-option')]");
    
    public static final Target BTN_RECRUITMENT = Target.the("Btn Recruitment")
            .located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));



}
