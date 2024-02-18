package selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	      driver.findElement(By.cssSelector("a[value='BLR']")).click(); //selected the departure city as Bangalore
	      Thread.sleep(3000);
	      //driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();// this is not the recommended practice so we need to use the parent child traverse mechanisim 
	      driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	      
	      

	}

}
