package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kodillaLoginPom {

    @FindBy(css = "input[type='email']")
     WebElement emailField;

    @FindBy(css = "input[type='password']")
     WebElement passwordField;

    @FindBy(css = "button[type='submit']")
            WebElement button;
    WebDriver driver;
    public kodillaLoginPom() {
        System.setProperty("webdriver.chrome.driver", "C://selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");

        PageFactory.initElements(driver, this);
    }
    public boolean login(String email,String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        button.click();
        String massage = driver.switchTo().alert().getText();
        return massage.matches("Jesteś teraz zalogowany!");
    }

    public void close() {

        driver.close();
        }








    }


