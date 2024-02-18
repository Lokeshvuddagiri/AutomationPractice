package selenium.learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the window 
		driver.get("https://www.google.co.uk/"); // To pass the url to the driver 
		driver.navigate().to("https://github.com/Lokeshvuddagiri/AutomationPractice"); // Navigating to the other page 
		driver.navigate().back(); //navigating back 
		driver.navigate().forward(); // To move forward 
		driver.quit();// To close the instances of the browser you can use the close method as well here , But i wontedly using the quiti method 


	}

}
