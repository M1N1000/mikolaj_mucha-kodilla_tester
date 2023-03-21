package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");



        WebElement kategoria = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select[1]"));
        Select selectkategoria =new Select(kategoria);
        selectkategoria.selectByIndex(9);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        name.sendKeys("mavic mini");
        name.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-ac")));





    }
}
