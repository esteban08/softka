package co.com.softka.tasks;

import co.com.softka.userinterface.demoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class addToCart implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(demoBlazePage.MOBILE),
                Click.on(demoBlazePage.BTNADD)
        );
    }

    public static addToCart on(){return new addToCart();}
}
