package selenium.learnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws Exception {
	String name="Lokesh";
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();  // To initialize the browser 
		driver.manage().window().maximize();   // To maximize the driver window 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implemented implicit wait to show the elements 
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //To pass the URL
		String loginpwd=getpassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(name);   // To find out the element using Id
		driver.findElement(By.name("inputPassword")).sendKeys(loginpwd); // To find out the element using name 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click(); // Finding the element by creating Xpath using HTML attributes
		driver.findElement(By.className("submit")).click(); 
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText()
,"Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in."); ////div/p
		driver.findElement(By.xpath("//button[contains(text(),'Out')]")).click();
		

	}
	public static String getpassword(WebDriver driver) throws Exception {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");  //To pass the URL
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(3000);
		String Password = driver.findElement(By.cssSelector(".infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[]Passwordarray=Password.split("'");
		String[] newpwd=Passwordarray[1].split("'");
		String pwd=newpwd[0];
		driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]  ")).click();
		return pwd;
		
		
	}
}
