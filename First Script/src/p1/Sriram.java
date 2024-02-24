package p1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sriram {
	public static void main(String args[]) {
		//Starting the session
		WebDriver driver=new ChromeDriver();
		
		//Taking action on browser
		driver.get("https://google.com");
		
		//Requesting browser information
		System.out.println(driver.getTitle());
		
		//Establishing Waiting Strategy
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//Finding an element
		WebElement textBox = driver.findElement(By.name("q"));
        WebElement submitButton = driver.findElement(By.name("btnK"));
        
        //Taking action on element
        textBox.sendKeys("Selenium");
        submitButton.click();
        
        //Requesting element information
        WebElement message = driver.findElement(By.id("result-stats"));
        System.out.println(message.getText());
        
        //End the Session
        driver.quit();
	}

}
