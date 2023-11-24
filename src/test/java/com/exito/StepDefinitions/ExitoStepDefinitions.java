package com.exito.StepDefinitions;

import com.exito.Tasks.BusquedaTask;
import com.exito.Tasks.PaginaInicialExitoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ExitoStepDefinitions {
    @Before
    public void setupActor() {
        setTheStage(new OnlineCast());
    }

    @Dado("el usuario ingrese a la pagina del exito")
    public void elUsuarioIngreseALaPaginaDelExito() {
        theActorCalled("Usuario").wasAbleTo(
                PaginaInicialExitoTask.abrirNavegador()
        );
    }
    @Cuando("se ingrese un producto y de enter")
    public void seIngreseUnProductoYDeEnter() {
        theActorCalled("usuario").wasAbleTo(
                BusquedaTask.buscarProducto()
        );

    }
    @Entonces("el sistema desplegara los productos asociados")
    public void elSistemaDesplegaraLosProductosAsociados() {
    }
}
