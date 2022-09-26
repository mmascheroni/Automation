package pages;

public class FormPage extends BasePage {

    String fisrtName = "//tbody/tr[2]/td[2]/input[1]";
    String lastName = "//tbody/tr[3]/td[2]/input[1]";
    String phoneNumber = "//tbody/tr[4]/td[2]/input[1]";
    String email = "//input[@id='userName']";
    String address = "//tbody/tr[7]/td[2]/input[1]";
    String city = "//input[@name='city']";
    String state = "//input[@name='state']";
    String postalCode = "//input[@name='postalCode']";
    String dropdownCountry = "//select[@name='country']";
    String userName = "//input[@id='email']";
    String password = "//input[@name='password']";
    String confirmPassword = "//input[@name='confirmPassword']";
    String submit = "//input[@name='submit']";

    public FormPage() {
        super(driver);
    }

    public void navigateToFormPage() {
        navigateTo("https://demo.guru99.com/test/newtours/register.php");
    }

    public void completefirstName(String value) {
        completeInput(fisrtName, value);
    }

    public void completeLastName(String value) {
        completeInput(lastName, value);
    }

    public void completePhone(String value) {
        completeInput(phoneNumber, value);
    }

    public void completeEmail(String value) {
        completeInput(email, value);
    }

    public void completeAddress(String value) {
        completeInput(address, value);
    }

    public void completeCity(String value) {
        completeInput(city, value);
    }

    public void completeState(String value) {
        completeInput(state, value);
    }

    public void completePostalCode(String value) {
        completeInput(postalCode, value);
    }

    public void selectElementByText(String valueToSelect) {
        selectElementInDropdownByText(dropdownCountry, valueToSelect);
    }

    public void completeUserName(String value) {
        completeInput(userName, value);
    }

    public void completePassword(String value) {
        completeInput(password, value);
    }

    public void completeConfirmPassword(String value) {
        completeInput(confirmPassword, value);
    }

    public void sendForm() {
        clickElement(submit);
    }

}
