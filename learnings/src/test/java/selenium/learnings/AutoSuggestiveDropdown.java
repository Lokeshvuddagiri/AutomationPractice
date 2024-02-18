package selenium.learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws Exception {
		String countryname ="Ind";
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
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

	}

}
