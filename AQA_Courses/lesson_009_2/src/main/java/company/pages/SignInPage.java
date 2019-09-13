package company.pages;

import company.pages.attributes.AlreadyRegistered;
import company.pages.attributes.CreateAccountAttribute;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private WebDriver driver;

    private AlreadyRegistered alreadyRegistered;
    private CreateAccountAttribute createAccountAttribute;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegistrationPage createNewAccountWithEmail(String email){
        createAccountAttribute = new CreateAccountAttribute(driver);
        return createAccountAttribute.typeEmail(email).clickCreateAnAccount();
    }
}
