package opensource.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target DRP_USUARIO = Target.the("Dropdown al loguearse").located(By.xpath("//*[@class='oxd-userdropdown-tab']"));

    public static final Target BTN_RECRUITMENT = Target.the("Btn Recruitment").located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));

}
