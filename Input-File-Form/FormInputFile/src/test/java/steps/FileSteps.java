package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FilePage;

public class FileSteps {

    FilePage filePage = new FilePage();

    @Given("I go to the form page")
    public void navigateToFilePage() {
        filePage.navigateToPage();
    }

    @And("Complete de form adding the file")
    public void completeForm() {
        filePage.uploadFile("C:/Users/mauro/Downloads/jsOrdenacion.txt");
        filePage.clickRadio();
        filePage.clickButton();
    }

    @Then("Validate results")
    public void validateResults() {

    }
}
