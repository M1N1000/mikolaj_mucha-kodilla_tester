package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ebaySearchTesting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://selenium-drivers//chrome//chromedriver.exe/");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.ebay.pl");

        WebElement button = webDriver.findElement(By.id("gh-ac"));
        button.sendKeys("Laptop");
        button.submit();


        WebDriverWait wait = new WebDriverWait(webDriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gh=ac")));




    }

}
