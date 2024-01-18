package seleniumpreparation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.id("inputUsername")).sendKeys("Lokesh");
    driver.findElement(By.name("inputPassword")).sendKeys("Password");
    driver.findElement(By.name("chkboxTwo")).click();
    driver.findElement(By.className("signInBtn")).click();
    System.out.println(   driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lokesh");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lokesh@gmail.com");
    driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9876543210");
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
    driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Lokesh");
    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".signInBtn")).click();
    //driver.quit();
    
	}

}
