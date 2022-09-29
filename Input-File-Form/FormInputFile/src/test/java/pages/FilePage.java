package pages;

public class FilePage extends BasePage {

    String file = "//input[@id='fileinput']";
    String radio = "//input[@id='itsafile']";
    String button = "//body/div[1]/div[3]/form[1]/div[3]/input[1]";

    public FilePage() {
        super(driver);
    }

    public void navigateToPage() {
        navigateTo("https://testpages.herokuapp.com/styled/file-upload-test.html");
    }

    public void uploadFile(String urlFile) {
        uploadFile(file, urlFile);
    }

    public void clickRadio() {
        clickElement(radio);
    }

    public void clickButton() {
        clickElement(button);
    }

}
