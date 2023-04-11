package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");



        WebElement kategoria = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select[1]"));
        Select selectkategoria =new Select(kategoria);
        selectkategoria.selectByIndex(9);

        WebElement schear = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        schear.sendKeys("mavic mini");
        schear.submit();

        List<WebElement> productList = driver.findElements(By.cssSelector("li.s-item"));

        // Dla każdego produktu na liście, pobierz informacje i wyświetl je w konsoli
        for (WebElement product : productList ) {
            String name = product.findElement(By.className("s-item__title")).getText();
            String price = product.findElement(By.cssSelector("span.s-item__price")).getText();
            String description = product.findElement(By.cssSelector("div.s-item__subtitle")).getText();




            System.out.println("Nazwa: " + name);
            System.out.println("Cena: " + price);
            System.out.println("Opis: " + description);
            System.out.println("--------------------");
        }

        // Zamknij przeglądarkę
       // driver.quit();
    }
        }










