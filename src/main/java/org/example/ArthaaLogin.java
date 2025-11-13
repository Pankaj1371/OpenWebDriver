package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ArthaaLogin {
    public static void main(String[] args) {

        // DELETE THE System.setProperty LINE ENTIRELY.
        // It is no longer needed with modern Selenium.

        WebDriver driver = new ChromeDriver();

        // Use implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // You should add driver.quit() here for cleanup
    }
}
