package selenium.learnings;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Veggies {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 //String[] Itemsneeded = {"Cucumber","Brocolli","Beetroot"};
 String[] Itemsneeded= {"Cucumber","Brocolli","Beetroot"};
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
 Thread.sleep(3000);
 addItems1(driver,Itemsneeded);
 }
	
 public static  void addItems1(WebDriver driver,  String[] Itemsneeded) {
	 int j=0;
 List<WebElement> products=driver.findElements(By.className("h4.product-name"));
 
 for(int i=0;i<products.size();i++)
 {

	 String name[]=products.get(i).getText().split("-");
	 String Formattedname=name[0].trim();
	 List itemsNeededList = Arrays.asList(Itemsneeded);

	 if(itemsNeededList.contains(Formattedname))

	 {

	 j++;

	 //click on Add to cart

	 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	 if(j==Itemsneeded.length)

	 {

	 break;

	 }
 
	}

}
	}
 }
