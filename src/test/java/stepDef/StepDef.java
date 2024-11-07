package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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


    @When("I search for books by author Erik Larson")
    public void iSearchForBooksByAuthorErikLarson() {
        
    }

    @Then("I find {int} books")
    public void iFindBooks(int arg0) {
    }

    @Given("I have the following books in the store by list")
    public void iHaveTheFollowingBooksInTheStoreByList(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        System.out.println(rows);

    }

    @Given("I have the following books in the store by map")
    public void iHaveTheFollowingBooksInTheStoreByMap(DataTable table) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        List<String> titleData = rows.stream().flatMap(map -> map.entrySet().stream())
                .filter(entry -> entry.getKey().equals("title"))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        titleData.forEach(System.out::println);
    }
}
