package com.cybertek.tests.day3webElementintro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerfyURLnotChange {
    /**
     * Verify URL not change
     * open chrome
     * go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
     * click on Retrieve password
     * verify that url did not change
     *
     */
    public static void main(String[] args) {
        //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_passwordHarici
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //save url to string variable
        String expectedURL = driver.getCurrentUrl();
        //click on Retrieve password
        WebElement retrievePasswordButtun = driver.findElement(By.id("form_submit"));
        //click()--> click web element
        retrievePasswordButtun.click();
        String actualURL = driver.getCurrentUrl();
        //verify that url is not change
        if (expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        //close the browser
        driver.quit();
    }
}
