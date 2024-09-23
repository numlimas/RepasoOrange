package opensource.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import opensource.acciones.IngresarCandidato;
import opensource.acciones.IngresarCredenciales;

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
        actor.attemptsTo(IngresarCandidato.with(primerNombre, segundoNombre, apellidos, correo, numero, palabrasClave, fechaSolicitud, observaciones));
    }

    public static AgregarCandidato conDatos(String primerNombre, String segundoNombre, String apellidos, String correo, String numero, String palabrasClave, String fechaSolicitud, String observaciones) {
        return new AgregarCandidato(primerNombre, segundoNombre, apellidos, correo, numero, palabrasClave, fechaSolicitud, observaciones);
    }
}
