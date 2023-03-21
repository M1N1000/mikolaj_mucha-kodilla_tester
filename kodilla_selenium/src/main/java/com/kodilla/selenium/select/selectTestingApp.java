package com.kodilla.selenium.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://selenium-drivers//chrome//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/form");

        WebElement yaer = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/select[3]"));
        Select yearSelect = new Select(yaer);
        yearSelect.selectByIndex(5);


        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));



    }
}
