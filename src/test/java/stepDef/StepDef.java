package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

    @When("the Maker starts a game")
    public void the_maker_starts_a_game() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("First Step Executed");
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Maker waits for a Breaker to join")
    public void the_maker_waits_for_a_breaker_to_join() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Second Step Executed");
        throw new io.cucumber.java.PendingException();
    }


}
