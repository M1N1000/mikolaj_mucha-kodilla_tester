package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/kodowanie/kodilla-course/kodilla_selenium/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        WorldTimePage page = new WorldTimePage(webDriver);

        Ocular.config()
                        .resultPath(Paths.get("C://kodowanie/result"))
                                .snapshotPath(Paths.get("C://kodowanie/snapshots"))
                                        .globalSimilarity(95)
                                                .saveSnapshot(true);


        page.open();
        page.compare();
        page.close();

    }
}
