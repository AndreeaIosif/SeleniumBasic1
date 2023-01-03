package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        openBrowser();
    }

    public static void openBrowser(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement emailInput = driver.findElement(By.id("userEmail-wrapper"));
        emailInput.sendKeys("abc@d.com");
        driver.quit();
    }
}