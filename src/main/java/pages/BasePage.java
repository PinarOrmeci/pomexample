package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //Click Method
    public void click (By elementLocation) {
        //Synchronization
        wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
        //Click operation
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText (By elementLocation, String text) {
        //Synchronization
        waitVisibility(elementLocation);
        //Write Text
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText (By elementLocation) {
        //Synchronization
        waitVisibility(elementLocation);
        //Write Text
        return driver.findElement(elementLocation).getText();
    }

    //Verify Text
    public void verifyText (By elementLocation, String expectedText) {
        //Synchronization
        waitVisibility(elementLocation);
        //Verification
        Assert.assertEquals(readText(elementLocation),expectedText);
    }

    //Wait Visibility
    public void waitVisibility (By elementLocation){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

}
