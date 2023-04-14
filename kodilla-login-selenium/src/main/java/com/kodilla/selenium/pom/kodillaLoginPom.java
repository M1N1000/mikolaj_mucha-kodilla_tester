package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kodillaLoginPom {

    //obsługa pola email
    @FindBy(css = "input[type='email']")
    WebElement emailField;

    //obsługa pola hasło
    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    //obsługa przycisku zaloguj
    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement button;
    WebDriver driver;
    public kodillaLoginPom() {
        System.setProperty("webdriver.chrome.driver", "C://kodowanie/kodilla-course/kodilla-login-selenium/chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.navigate().to("https://kodilla.com/pl/test/login");


    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        button.click();
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.dismiss();
            return alertText.equals("Jesteś teraz zalogowany!");
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    //zamykanie przegladarki
    public void close() {

        driver.close();
    }
}




