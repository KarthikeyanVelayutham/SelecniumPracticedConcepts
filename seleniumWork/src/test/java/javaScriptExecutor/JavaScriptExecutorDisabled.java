package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDisabled {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1200);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='ZIP'][1]")).click();
		
		//driver.findElement(By.name("licenseAccept")).click();
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text() , 'Download W')]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",ele);
		driver.quit();

	}

}
