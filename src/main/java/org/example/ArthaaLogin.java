package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ArthaaLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("http://stgsd.appsndevs.com:9040/spaadmin/login");

            // Instantiate the action class(es)
            AddMember memberActions = new AddMember();

            // 1. **TASK 1: LOGIN**
            performLogin(driver);

            // 2. **TASK 2: MEMBER CREATION**
            // Pass the active driver instance to the AddMember class method
            memberActions.createMember(driver);

            // Wait to see the final result before closing
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    // --- TASK METHOD 1: PERFORM LOGIN ---
    public static void performLogin(WebDriver driver) {

        // Enter Email
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("kumarpankaj@bugraptors.com");

        // Enter Password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("V8xPWpb@4saUz@78");

        // Click on the Login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/app-login/section/div/div/div/div[2]/form/div[3]/input"));
        loginButton.click();

        System.out.println("Login Successful.");
    }
}