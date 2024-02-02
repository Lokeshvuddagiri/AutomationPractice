package selenium.learnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement staticdropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select(staticdropdown);
		dropdown.selectByIndex(1);
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "INR");
		dropdown.selectByValue("AED");
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "AED");
		dropdown.selectByVisibleText("USD");
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "USD");
	
		
		
	

	}

}
