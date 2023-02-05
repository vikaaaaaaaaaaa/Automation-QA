package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {
    @Test
    public void seleniumTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/default.asp");
        WebElement navBtn = driver.findElement(By.id("navbtn_tutorials"));
        navBtn.click();
        WebElement learnHTML = driver.findElement(By.cssSelector("#nav_tutorials > div > div > div:nth-child(2) > a:nth-child(2)"));
        learnHTML.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement element = driver.findElement(By.cssSelector("#main > h1 > span"));
        String actual = element.getText();
        assertEquals("Tutorial", actual);
    }

}
