package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ChromeTest {
    @Test
    public static void main() {

        System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator +"chromedriver");
                //("webdriver.chrome.driver", ChromeTest.class.getResource("/chromedriver").getPath());
                //("webdriver.chrome.driver", "/Users/rohu/Downloads/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();

        //driver.close();
    }
}
