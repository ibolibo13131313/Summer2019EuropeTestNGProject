package com.cybertek.tests.day3webElementintro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchange {
    /**
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) {
        //open the chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //ENTER any email
        WebElement emailInput = driver.findElement(By.name("email"));
       //sendKeys()--> send keyboard action to webelement / enters given text
        emailInput.sendKeys("email@gmail.com");
        //locate to password button
        WebElement retrivepassword = driver.findElement(By.id("form_submit"));
       //click button
        retrivepassword.click();
        String expectedURL ="http://practice.cybertekschool.com/email_sent ";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
            System.out.println("actual url = " + actualURL);
            System.out.println("expected url = " + expectedURL);
        }

        driver.quit();
    }
}
