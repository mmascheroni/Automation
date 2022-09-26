package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FormPage;

public class FormSteps {

    FormPage form = new FormPage();

    @Given("I go to the form page with its url")
    public void navigateToPage() {
        form.navigateToFormPage();
    }

    @And("I complete the inputs in the form")
    public void completeInputs() {
        form.completefirstName("Mauro");
        form.completeLastName("Mascheroni");
        form.completePhone("091879844");
        form.completeEmail("mauromas97@gmail.com");
        form.completeAddress("8 de octubre");
        form.completeCity("Montevideo");
        form.completeState("La blanqueada");
        form.completePostalCode("11400");
        form.selectElementByText("URUGUAY");
        form.completeUserName("Mauro Mas");
        form.completePassword("pass123");
        form.completeConfirmPassword("pass123");
        form.sendForm();
    }

    @Then("Validate form")
    public void validateResults() {
    }

}
