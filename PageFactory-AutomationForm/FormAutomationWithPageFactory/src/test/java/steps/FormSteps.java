package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FormPage;

public class FormSteps {

    FormPage form = new FormPage();

    @Given("I go to the form page")
    public void navigateToFormPage() {
        form.navigateTo();
    }

    @And("Complete all inputs on the page")
    public void completeForm() {
        form.completeInputFistName("Mauro");
        form.completeInputlastName("Mascheroni");
        form.completeInputPhone("091888444");
        form.completeInputUserName("mauro@hotmail.com");
        form.completeInputAddress("20 de febrero 1414");
        form.completeInputCity("Montevideo");
        form.completeInputState("La blanqueada");
        form.completeInputPostalCode("111111");
        form.completeInputCountry("URUGUAY");
        form.completeInputEmail("mmUserName");
        form.completeInputPassword("pass");
        form.completeInputConfirmPassword("pass");
        form.clickSubmit();
    }

    @Then("Validate results")
    public void validateResults() {

    }
}
