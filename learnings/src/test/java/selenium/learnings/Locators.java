package selenium.learnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();  // To initialize the browser 
		driver.manage().window().maximize();   // To maximize the driver window 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implemented implicit wait to show the elements 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");  //To pass the URL
		driver.findElement(By.id("inputUsername")).sendKeys("Lokesh");   // To find out the element using Id
		driver.findElement(By.name("inputPassword")).sendKeys("Lokesh@123"); // To find out the element using name 
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click(); // Finding the element by creating Xpath using HTML attributes
		driver.findElement(By.className("submit")).click();   // To find out the element using the className for example if we have two words in the class name we can pass only one word EXample : submit signInBtn, we can use submit or signInBtn 
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Lokesh"); //We can build our own xpath by using indexes if there is no unique attributes 
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("lokesh@gmail.com"); // We can build the css as we;; by using the indexes but it is different syntax not similar to the xpath index syntax 
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876543210"); // We can build the customized css by using the attributes as well 
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]  ")).click();//Clicking on the button using button text 
		driver.findElement(By.id("inputUsername")).sendKeys("Lokesh");  
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click(); 
		//rahulshettyacademy
		// If we face no such element exception then we can overcome this situation by using the wait mechanism . Here i am implementing the implicit wait mechanism to show sup the elements
		
		
		
		
		//driver.close(); //To close the browser instance
		
		

	}

}
