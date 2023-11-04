package seleniumpreparation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
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
    
 
    
	}

}
