package selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      System.out.println(driver.findElement(By.cssSelector(".paxinfo")).getText());
      driver.findElement(By.cssSelector(".paxinfo")).click();
      Thread.sleep(2000);
      for(int i=0;i<5;i++) {
      driver.findElement(By.cssSelector("#hrefIncAdt")).click();
      i++;
      }
      driver.findElement(By.xpath("//div[@class='ad-row align-center'] //input")).click(); // We can build the xpath traversing from parent to child by following this syntax //parenttag/childtag or //ParentTagName  //Child Tag
      System.out.println("After selecting the count" + driver.findElement(By.cssSelector(".paxinfo")).getText());
      driver.close();
      
	}

}
