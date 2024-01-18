package seleniumpreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		    System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		    driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		    System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
