package opensource.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target TXT_USUARIO = Target.the("Campo de texto para usuario").located(By.xpath("//input[@placeholder='Username']"));

    public static final Target TXT_CONTRASENA = Target.the("Campo de texto para contrasena").located(By.xpath("//input[@placeholder='Password']"));

    public static final Target BTN_ENTRAR = Target.the("Boton entrar").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));

}
