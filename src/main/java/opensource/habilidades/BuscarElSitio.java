package opensource.habilidades;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
public class BuscarElSitio {

    public static BrowseTheWeb as(Actor actor) {
        return BrowseTheWeb.as(actor);
    }

    public static BrowseTheWeb with(WebDriver driver) {
        return BrowseTheWeb.with(driver);
    }

}
