import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Methods {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\y21cs31\\Downloads\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		//Navigating to other website
		driver.navigate().to("https://rvrjcce.ac.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//Refreshing Page
		driver.navigate().refresh();
		
		//Navigating back to first page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}
}
