package opensource.preguntas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opensource.UI.HomePage;

public class Inicio implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.DRP_USUARIO.resolveFor(actor).isDisplayed();
    }

    public static Inicio esVisible() {
        return new Inicio();
    }
}