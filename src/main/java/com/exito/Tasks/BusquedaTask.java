package com.exito.Tasks;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.exito.UI.BusquedaUI.TXT_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Celulares").into(TXT_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }
    public static BusquedaTask buscarProducto(){
        return instrumented(BusquedaTask.class);
    }
}
