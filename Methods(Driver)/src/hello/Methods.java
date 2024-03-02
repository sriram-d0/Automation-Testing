package hello;
//import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Methods {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\y21cs31\\Downloads\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); 
		// WEB DRIVER METHODS
		//get method
		driver.get("https://www.drive.google.com");
		
		//Title of page
		System.out.println(driver.getTitle());
		
		//URL of page
        System.out.println(driver.getCurrentUrl());
        
        //Source of page
        System.out.println(driver.getPageSource());
        
        //Finding Elements
       // WebElement par=driver.findElement(By.name("p"));
        //System.out.println(par.getText());
    
        //to delete cookies
        driver.manage().deleteAllCookies();
        
        //to set size of windows
        Dimension d=new Dimension(500,1000);
        driver.manage().window().setSize(d);
        Thread.sleep(2000);
       
        //to maximize the window
        driver.manage().window().maximize();
        
        //to set the position of new window
        Point p=new Point(500,500);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);
        
        //to minimize the window
        driver.manage().window().minimize();
	}
}
