package seleniumpreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		System.out.println("Before Selecting" + " " + driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		while (i < 5) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		System.out.println("After Selecting" + " " + driver.findElement(By.cssSelector("#divpaxinfo")).getText());
	}

}
