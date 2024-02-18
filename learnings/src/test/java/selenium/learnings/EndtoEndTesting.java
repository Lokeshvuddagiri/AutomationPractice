package selenium.learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEndTesting {

	public static void main(String[] args) throws Exception {
		String countryname ="Ind";
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
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(countryname);
		Thread.sleep(3000);
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		String mycountry="India";
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase(mycountry)){
				option.click();
				break;

			}}
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
	      driver.findElement(By.cssSelector(".paxinfo")).click();
	      Thread.sleep(2000);
	      for(int i=0;i<5;i++) {
	      driver.findElement(By.cssSelector("#hrefIncAdt")).click();
	      i++;
	      }
	      driver.findElement(By.xpath("//div[@class='ad-row align-center'] //input")).click(); // We can build the xpath traversing from parent to child by following this syntax //parenttag/childtag or //ParentTagName  //Child Tag
	      System.out.println("After selecting the count" + driver.findElement(By.cssSelector(".paxinfo")).getText());
	      driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
					.click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		      //System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).isEnabled());
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());  
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		      driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		      System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		      if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		      {

		      System.out.println("its enabled");

		      Assert.assertTrue(true);

		      }

		      else

		      {

		      Assert.assertTrue(false);

		      }
		
	      driver.close();
		

	}





}
