import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void invalidUserPass () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        //*************STEPS********************
        homePage.goToN11();
        homePage.goToLogin();
        loginPage.loginToN11("swtestacademy2023@website.com", "1234qwerssdDfa");

        //*************ASSERTIONS***********************
        loginPage.verifyUsername("E-posta adresiniz veya şifreniz hatalı");
    }

    @Test
    public void emptyUserPass () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver, wait);

        //*************STEPS********************
        homePage.goToN11();
        homePage.goToLogin();
        loginPage.loginToN11("", "");

        //*************ASSERTIONS***********************
        loginPage.verifyUsernameEmpty("Lütfen e-posta adresinizi girin.");
        loginPage.verifyPassword("Bu alanın doldurulması zorunludur.");
    }

}
