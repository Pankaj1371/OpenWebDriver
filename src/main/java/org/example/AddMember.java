package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddMember {

    // Method called from the main class
    public void createMember(WebDriver driver) {

        System.out.println("Starting Member Creation steps...");

        // --- Step 1: Click the Member Nav Button ---
        // Find the correct locator (e.g., using By.xpath, By.linkText, or By.id)
        try {
            WebElement memberNavButton = driver.findElement(By.xpath("//*[@id=\"contact-tab\"]"));
            memberNavButton.click();
            System.out.println("Clicked Contact-tab button.");

            WebElement addnewmemberButton = driver.findElement(By.xpath("//*[@id=\"addnewmember\"]"));
            addnewmemberButton.click();
            System.out.println("Clicked Add-New-Member button.");




        } catch (Exception e) {
            System.err.println("Failed during member creation steps: " + e.getMessage());
        }
    }
}