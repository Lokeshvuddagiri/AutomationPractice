package seleniumpreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdpwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd = new Select(Dropdown);
		dd.selectByIndex(2);
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByValue("INR");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("USD");
		System.out.println(dd.getFirstSelectedOption().getText());
		driver.quit();

	}

}
