package p1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tab {
    public static void main(String args[]) {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver","C:\\Users\\y21cs31\\Downloads\\msedgedriver.exe");
        
        // Initialize EdgeDriver
        WebDriver driver=new EdgeDriver();
        
        // Open GitHub website in the first tab
        driver.get("https://github.com/");
        
        // Initialize JavaScript Executor
        JavascriptExecutor js=(JavascriptExecutor) driver;
        
        // Execute JavaScript to open a new tab
        js.executeScript("window.open()");
        
        // Switch to the new tab
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        
        // Open RVRJCCE website in the new tab
        driver.get("https://rvrjcce.ac.in/");
    }
}
