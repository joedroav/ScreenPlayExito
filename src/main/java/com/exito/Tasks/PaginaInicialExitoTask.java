package com.exito.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaInicialExitoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.exito.com")
        );
    }
    public static PaginaInicialExitoTask abrirNavegador(){
        return instrumented(PaginaInicialExitoTask.class);
    }
}
