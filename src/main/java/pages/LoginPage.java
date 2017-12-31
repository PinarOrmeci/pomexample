package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    //************Constructor***************
    public LoginPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //************Page Variables***************


    //************Page Elements***************
    String usernameId = "email";
    String passwordId = "password";
    String loginButtonId = "loginButton";
    String errorMessageUserNameCssEmpty = "#loginForm .error:nth-of-type(1) .errorText";
    String errorMessageUsernameCss = ".error .errorText";
    String errorMessagePasswordCss = "#loginForm .error:nth-of-type(2) .errorText";

    //************Page Methods***************
    //Go to N11
    public void loginToN11 (String username, String password) {
        writeText(By.id(usernameId), username);
        writeText(By.id(passwordId), password);
        click(By.id(loginButtonId));
    }

    //Verify UserName
    public void verifyUsername (String expectedText) {
        verifyText(By.cssSelector(errorMessageUsernameCss),expectedText);
    }

    //Verify UserName
    public void verifyUsernameEmpty (String expectedText) {
        verifyText(By.cssSelector(errorMessageUserNameCssEmpty),expectedText);
    }

    //Verify Password
    public void verifyPassword (String expectedText) {
        verifyText(By.cssSelector(errorMessagePasswordCss),expectedText);
    }

}
