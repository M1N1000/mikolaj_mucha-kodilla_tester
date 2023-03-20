package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://selenium-drivers//chrome//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/login");

        WebElement inputField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        inputField.sendKeys("test@kodilla.com");
        WebElement inputField2 = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        inputField2.sendKeys("kodilla123");
        inputField2.submit();
    }
}


