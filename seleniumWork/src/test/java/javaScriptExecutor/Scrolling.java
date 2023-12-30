package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver.get("https://www.oracle.com/in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
	
		
	//scrollto
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(2000);
		
		
	//scrollBy
		js.executeScript("window.scrollBy(0,500);");
	    Thread.sleep(2000);		
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);	
		
   //to move down	
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);"); 
		
   //to move right
		js.executeScript("window.scrollTo(document.body.scrollWidth, 0);");
		

  //scroll into view
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Learn')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		js.executeScript("arguments[0].scrollIntoView(false)",element);

		
driver.quit();
	}

}
