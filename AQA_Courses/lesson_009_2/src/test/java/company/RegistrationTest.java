package company;

import company.model.Account;
import company.model.AccountBuilder;
import company.pages.MainPage;
import company.pages.MyAccountPage;
import company.pages.RegistrationPage;
import company.pages.SignInPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static company.utils.TestHelper.randomInt;

public class RegistrationTest extends BaseTest {

    private Account account;
    private MainPage mainPage;
    private SignInPage signInPage;
    private RegistrationPage registrationPage;
    private MyAccountPage myAccountPage;

    @Before
    public void setupAccount() {
        account = new AccountBuilder()
                .withGender("Mr.")
                .withEmail("Jack.Daniels"+ randomInt() +"@gmail.com")
                .withPassword("Jack.Daniels")
                .withFirstCustomerName("Jack")
                .withLastCustomerName("Daniels")
                .withBirthdayDay("8")
                .withBirthdayMonth("8")
                .withBirthdayYear("1987")
                .withFirstName("Yakov")
                .withLastName("Fayn")
                .withCompany("IBM")
                .withAddress1("San Francisco 1")
                .withAddress2("Moscow 2")
                .withCity("London")
                .withState("Alabama")
                .withZipCode("02206")
                .withCountry("United States")
                .withPhoneMobile("+30995652333")
                .withAliasAddress("Alloha!")
                .build();
        mainPage = new MainPage(driver);
    }

    @Test
    public void canCreateNewAccount() {
        signInPage = mainPage.clickSignIn();
        registrationPage = signInPage.createNewAccountWithEmail(account.getEmail());
        myAccountPage = registrationPage.fillAndSubmitRegistrationForm(account);
        String actualResult = myAccountPage.getAccountName();
        String expectedResult = account.getFirstCustomerName();

        Assert.assertTrue("If test failed then user name is incorrect", actualResult.contains(expectedResult));
    }

    @Test
    public void canCreateNewAccountChain() {
        Assert.assertTrue(mainPage.clickSignIn()
                .createNewAccountWithEmail(account.getEmail())
                .fillAndSubmitRegistrationForm(account)
                .getAccountName()
                .contains(account.getFirstCustomerName())
        );
    }
}
