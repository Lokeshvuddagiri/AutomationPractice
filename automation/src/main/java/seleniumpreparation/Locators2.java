package seleniumpreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String name = "Lokesh";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Locators2 loc = new Locators2();
		String Password = loc.GetPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		// System.out.println( driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello" + " " + name + ",");
		driver.findElement(By.xpath("//button[text()= 'Log Out']")).click();
	}

	public String GetPassword(WebDriver driver) throws Exception {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwd = driver.findElement(By.cssSelector("form p")).getText();
		String pswd[] = pwd.split("'");
		String realpwd = pswd[1].split("'")[0];
		return realpwd;

		// Please use temporary password 'rahulshettyacademy' to Login.
	}
}
