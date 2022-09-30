package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage {

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(name = "userName")
    WebElement userName;

    @FindBy(name = "address1")
    WebElement address1;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "postalCode")
    WebElement postalCode;

    @FindBy(name = "country")
    WebElement country;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(name = "submit")
    WebElement submit;

    public FormPage() {
        super(driver);
    }

    public void navigateTo() {
        navigateTo("https://demo.guru99.com/test/newtours/register.php");
    }

    public void completeInputFistName(String criteria) {
        completeInputWihtKeys(firstName, criteria);
    }

    public void completeInputlastName(String criteria) {
        completeInputWihtKeys(lastName, criteria);
    }

    public void completeInputPhone(String criteria) {
        completeInputWihtKeys(phone, criteria);
    }

    public void completeInputUserName(String criteria) {
        completeInputWihtKeys(userName, criteria);
    }

    public void completeInputAddress(String criteria) {
        completeInputWihtKeys(address1, criteria);
    }

    public void completeInputCity(String criteria) {
        completeInputWihtKeys(city, criteria);
    }

    public void completeInputState(String criteria) {
        completeInputWihtKeys(state, criteria);
    }

    public void completeInputCountry(String criteria) {
        selectElementDropdown(country, criteria);
    }

    public void completeInputPostalCode(String criteria) {
        completeInputWihtKeys(postalCode, criteria);
    }

    public void completeInputEmail(String criteria) {
        completeInputWihtKeys(email, criteria);
    }

    public void completeInputPassword(String criteria) {
        completeInputWihtKeys(password, criteria);
    }

    public void completeInputConfirmPassword(String criteria) {
        completeInputWihtKeys(confirmPassword, criteria);
    }

    public void clickSubmit() {
        clickElement(submit);
    }

}
