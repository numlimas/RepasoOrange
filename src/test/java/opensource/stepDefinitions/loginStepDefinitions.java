package opensource.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opensource.driver.Navegacion;
import opensource.habilidades.BuscarElSitio;
import opensource.preguntas.Inicio;
import opensource.tareas.*;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class loginStepDefinitions {

    private Actor usuario;
    private WebDriver driver;
    private Navegacion navegacion;

    @Before
    public void configurarEscenario(){
        navegacion = new Navegacion();
        driver = navegacion.iniciar();

        usuario = Actor.named("Usuario");
        usuario.can(BuscarElSitio.with(driver));
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void cerrarTelon(){
        navegacion.terminar();
    }

    @Given("^Se accede a la pagina de Opensource$")
    public void seAccedeALaPaginaDeOpensource() {
        usuario.wasAbleTo(NavegarA.PaginaLogin());
    }

    @When("^Se ingresan credenciales$")
    public void seIngresanCredenciales() throws InterruptedException {
        usuario.attemptsTo(
                Loguearse.conCredenciales("Admin","admin123")
        );
    }
    @When("^Se ingresa el candidato$")
    public void seIngresaElCandidato() {
        usuario.attemptsTo(
                AgregarCandidato.conDatos("David","Eduardo","Becks","n@m.co","3111111111","Futbolista,Empresario","2024-19-09","A la expectativa")
        );
    }

    @Then("^Se valida estar en el home logueado$")
    public void seValidaEstarEnElHomeLogueado() throws InterruptedException {
        usuario.should(seeThat(Inicio.esVisible()));
        }



}
