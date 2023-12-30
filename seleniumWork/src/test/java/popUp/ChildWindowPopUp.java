package popUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		/*//close the popup
		WebElement closePopUp = driver.findElement(By.className("_30XB9F"));
		closePopUp.click();*/
		
		//search a text in text box
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("iphone" + Keys.ENTER);
		
		//window handle ----> parent
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		
		driver.findElement(By.partialLinkText("APPLE iPhone 14 (Blue, 128 GB)")).click();
		
		
		//windowHandles ------> for all ID
		Set<String> allId = driver.getWindowHandles();
		
		
		//for-each loop to transfer the control
		for (String string : allId) {
			driver.switchTo().window(string);	
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
