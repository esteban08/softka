package stepdefinitions;

import co.com.softka.models.entity.DataPerson;
import co.com.softka.questions.textPresent;
import co.com.softka.tasks.Login;
import co.com.softka.tasks.addToCart;
import co.com.softka.tasks.singUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class stepdefinition {

    @Managed
    private WebDriver myDirver;
    @Before
    public void prepareStage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Esteban");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDirver));
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoblaze.com/"));
    }
    @Given("^The user adds a product to the shopping cart$")
    public void theUserAddsAProductToTheShoppingCart() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(addToCart.on());
        Thread.sleep(2000);
        myDirver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
    @When("^The user registers in the system$")
    public void theUserRegistersInTheSystem(List<DataPerson> ListUser) throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(singUp.inPage(ListUser.get(0)));
        Thread.sleep(2000);
        myDirver.switchTo().alert().accept();
        Thread.sleep(2000);

    }
    @When("^The user make login into the system$")
    public void theUserMakeLoginIntoTheSystem(List<DataPerson> ListUser){
       OnStage.theActorInTheSpotlight().attemptsTo(Login.On(ListUser.get(0)));

    }

    @Then("^The user see that (.*)$")
    public void theUserSeeThatCATEGORIES(String message) throws InterruptedException {
        Thread.sleep(4000);
        OnStage.theActorInTheSpotlight().should(seeThat(textPresent.isVisible(), Matchers.containsString(message)));
    }


}
