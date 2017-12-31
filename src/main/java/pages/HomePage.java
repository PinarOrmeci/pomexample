package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    //************Constructor***************
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //************Page Variables***************
    String baseURL = "http://www.n11.com";

    //************Page Elements***************
    String singInButtonClass = "btnSignIn";

    //************Page Methods***************
    //Go to N11
    public void goToN11 () {
        driver.navigate().to(baseURL);
    }

    //Go to Login
    public void goToLogin () {
        click(By.className(singInButtonClass));
    }
}
