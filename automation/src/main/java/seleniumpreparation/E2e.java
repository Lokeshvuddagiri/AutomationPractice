package seleniumpreparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int i = 1;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();
		driver.findElement(By.className("ui-state-highlight")).click();
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		System.out.println("Before Selecting" + " " + driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		while (i < 5) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd = new Select(Dropdown);
		dd.selectByIndex(2);
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByValue("INR");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("USD");
		System.out.println(dd.getFirstSelectedOption().getText());
		System.out.println("After Selecting" + " " + driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("Style"));
		String Country = "India";
		driver.findElement(By.id("autosuggest")).sendKeys(Country);
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("#ui-menu-item"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			// driver.findElement(By.xpath("//input[@value='Search']")).click();
			System.out.println("Succesfully completed end to end automation for travel UI");
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

			{

				System.out.println("its enabled");

				Assert.assertTrue(true);

			}

			else

			{

				Assert.assertTrue(false);

			}

		}

	}
}