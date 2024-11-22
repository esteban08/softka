package co.com.softka.tasks;

import co.com.softka.models.entity.DataPerson;
import co.com.softka.userinterface.demoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private final DataPerson person;

    public Login(DataPerson person) {
        this.person = person;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(demoBlazePage.OPTIONLOGIN),
                Enter.theValue(person.getUser()).into(demoBlazePage.LOGINUSER),
                Enter.theValue(person.getPassword()).into(demoBlazePage.LOGINPASSWORD),
                Click.on(demoBlazePage.BTNLOGIN)
        );
    }
    public static Login On(DataPerson person){ return Tasks.instrumented(Login.class, person);}
}
