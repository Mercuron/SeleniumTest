package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {

        two();
    }

    public static void first(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        WebElement fruit = driver.findElement(By.cssSelector("#announcement-banner > div > div > div > h4"));

        System.out.println("====" +  fruit.getText());

        driver.quit();
    }
    public static void two(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        System.out.println("== BEFORE ===" + driver.manage().getCookies());

        driver.manage().addCookie(new Cookie("Name1","Value1"));

        System.out.println("== AFTER  ===" + driver.manage().getCookies());

        driver.quit();
    }


}