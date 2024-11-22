package co.com.softka.tasks;

import co.com.softka.models.entity.DataPerson;
import co.com.softka.userinterface.demoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.bcel.ExceptionConstants;

public class singUp implements Task {
    private final DataPerson person;

    public singUp(DataPerson person) {
        super();
        this.person = person;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(demoBlazePage.SINGUP),
                Enter.theValue(person.getUser()).into(demoBlazePage.USER),
                Enter.theValue(person.getPassword()).into(demoBlazePage.PASSWORD),
                Click.on(demoBlazePage.BTNSINGUP),
                Click.on(demoBlazePage.BTNCLOSE)

        );
    }

    public static singUp inPage(DataPerson person){ return Tasks.instrumented(singUp.class, person);}
}
