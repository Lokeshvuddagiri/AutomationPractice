package seleniumpreparation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USBMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.usbank.com/index.html");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//.global-nav.primary.body.component-top header area 
		// //section[@class='topbar-background ']

		WebElement Menudriver=driver.findElement(By.cssSelector(".global-nav.primary.body.component-top"));// Limiting webdriver scope

		System.out.println(Menudriver.findElements(By.tagName("a")).size());
		WebElement AN = Menudriver.findElement(By.xpath("//section[@class='topbar-background ']"));
		System.out.println(AN.findElements(By.tagName("a")).size());

		for (int i =0; i<AN.findElements(By.cssSelector(".utility-link")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			AN.findElements(By.cssSelector(".utility-link")).get(i).sendKeys(clickonlinkTab);
		}	

		//Here I have written two lines to dismiss the cobrowser session 
		driver.findElement(By.cssSelector("#glance_cancel_btn")).click();
		driver.findElement(By.cssSelector("#glance_confirm_primary_button")).click();
		
		
//		String javascript = "document.getElementsByClassName('utility-link').style.border='2px solid red'";  
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
//		jsExecutor.executeScript(javascript); 
	//This is to check the git we can ignore it 
		//JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
	//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", );

		Set<String>abc=driver.getWindowHandles();
		Iterator<String>it=abc.iterator();

		while(it.hasNext())
		{

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
		
		driver.findElement(By.cssSelector("#smartAssistantLarge")).click();        System.out.println(driver.findElement(By.xpath("//div[@class='topSearchDiv']/div[@class='welcome-message']")).getText());
		driver.findElement(By.cssSelector("#sa-modal-web--close")).click();
		driver.findElement(By.cssSelector(".login-buttons")).click(); //To click on Login button
		driver.findElement(By.cssSelector(".login-buttons")).click(); // To close the login form
		
	}

}
