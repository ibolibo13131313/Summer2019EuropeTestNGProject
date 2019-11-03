package com.cybertek.tests.day3webElementintro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerfyConfirmationMassage {
    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */
    public static void main(String[] args) throws InterruptedException {
        // OPEN BROWSER
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //navigate to website
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox = driver.findElement(By.name("email"));
        String expectedEmail = "test@gmail.com";
        emailInputbox.sendKeys(expectedEmail);
        //verify that email is display in the input box
        //getting text from webelements
        //gettext()--> from web element %99
        //getAttribute()-> get value of attirubutes
        String actualEmail = emailInputbox.getAttribute("value");
       // String actualEmail = emailInputbox.getText();
        if (expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected email = " + expectedEmail);
            System.out.println("actualEmail=" + actualEmail);
        }
        //local retrievePasswordButton using id attribute
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //clicking webelement
        retrievePasswordButton.click();
        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage ="Your e-mail's been sent!";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();
        System.out.println(actualMessage);
        if (expectedMessage.equals(actualMessage)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("expected Message = " + expectedMessage);
            System.out.println("actual message = " + actualMessage);
        }

        Thread.sleep(3000);
        //close the browser
        driver.quit();
    }
}
