package com.kodilla.selenium.pom;

public class kodilllaPomApplication {
    public static void main(String[] args) {
        kodillaLoginPom kodillaLoginPom = new kodillaLoginPom();
        kodillaLoginPom.login("test@kodilla.com","kodilla123");
        kodillaLoginPom.close();

    }
}
