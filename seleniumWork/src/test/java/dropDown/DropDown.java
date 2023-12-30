package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByIndex(8);
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select sell = new Select(month);
		sell.selectByValue("3");
		
		
		WebElement Year = driver.findElement(By.id("year"));
		Select selll = new Select(Year);
		selll.selectByVisibleText("2005");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
