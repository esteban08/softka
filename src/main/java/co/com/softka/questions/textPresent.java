package co.com.softka.questions;

import co.com.softka.userinterface.demoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class textPresent implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(demoBlazePage.CATEGORY).viewedBy(actor).asString();
    }
    public static textPresent isVisible(){
        return new textPresent();
    }
}
