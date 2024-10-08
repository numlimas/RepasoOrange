package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opensource.UI.DatosCandidatosPage;
import opensource.UI.HomePage;
import opensource.UI.RecruitmentPage;
import opensource.acciones.SubirArchivo;

public class AgregarCandidato implements Task {
    private final String primerNombre;
    private final String segundoNombre;
    private final String apellidos;
    private final String correo;
    private final String numero;
    private final String palabrasClave;
    private final String fechaSolicitud;
    private final String observaciones;


    public AgregarCandidato(String primerNombre, String segundoNombre, String apellidos, String correo, String numero, String palabrasClave, String fechaSolicitud, String observaciones) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.numero = numero;
        this.palabrasClave = palabrasClave;
        this.fechaSolicitud = fechaSolicitud;
        this.observaciones = observaciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_RECRUITMENT),
                Click.on(RecruitmentPage.BTN_ADD),
                Enter.theValue(primerNombre).into(DatosCandidatosPage.INP_PRIMER_NOMBRE),
                Enter.theValue(segundoNombre).into(DatosCandidatosPage.INP_SEGUNDO_NOMBRE),
                Enter.theValue(apellidos).into(DatosCandidatosPage.INP_APELLIDO),
                Enter.theValue(correo).into(DatosCandidatosPage.INP_CORREO),
                Enter.theValue(numero).into(DatosCandidatosPage.INP_NUMERO),
                Enter.theValue(palabrasClave).into(DatosCandidatosPage.INP_PALABRAS_CLAVE),
                Enter.theValue(fechaSolicitud).into(DatosCandidatosPage.INP_FECHA),
                Enter.theValue(observaciones).into(DatosCandidatosPage.INP_OBSERVACIONES),
                Click.on(DatosCandidatosPage.BTN_LISTA),
                Click.on(DatosCandidatosPage.SLT_PRIMERAOPC),
                SubirArchivo.conRuta("C:\\Users\\NumaelLimasRodríguez\\OneDrive - SQA\\Documentos\\Repaso\\Ejercicio\\src\\main\\java\\opensource\\utils\\prueba.txt",DatosCandidatosPage.INP_ARCHIVO),
                Click.on(DatosCandidatosPage.BTN_GUARDAR)
        );
    }

    public static AgregarCandidato conDatos(String primerNombre, String segundoNombre, String apellidos, String correo, String numero, String palabrasClave, String fechaSolicitud, String observaciones) {
        return new AgregarCandidato(primerNombre, segundoNombre, apellidos, correo, numero, palabrasClave, fechaSolicitud, observaciones);
    }
}
