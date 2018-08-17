package cucumber.steps;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


import edu.wofford.*;
import cucumber.hooks.Hooks;


public class SampleSteps {
    private String currentString;
    
    @Given("the user enters the greeting {string}")
    public void theUserEntersTheGreeting(String string) {
        String[] args = {string};
        Main.main(args);
    }
    
    @When("the user views the interface")
    public void theUserViewsTheInterface() {
        currentString = Hooks.outContent.toString().trim();
    }
    
    @Then("the program responds forwards")
    public void theProgramRespondsForwards() {
        assertThat(currentString, is("hello world"));
    }
    
    @Then("the program responds backwards")
    public void theProgramRespondsBackwards() {
        assertThat(currentString, is("dlrow olleh"));
    }



}