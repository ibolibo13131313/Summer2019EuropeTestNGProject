package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAdndtitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
        //get u the title of the page
        String title = driver.getTitle();
        //soutv
        System.out.println("title = " + title);
        //gets the current url of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        //gets the source code of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}