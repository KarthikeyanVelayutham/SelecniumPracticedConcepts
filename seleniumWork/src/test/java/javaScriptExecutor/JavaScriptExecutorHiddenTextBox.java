package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorHiddenTextBox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,300);");
	    Thread.sleep(2000);
	    
	    WebElement hide = driver.findElement(By.id("hide-textbox"));
	    hide.click();
	    Thread.sleep(2000);
	    
	    
	    WebElement display = driver.findElement(By.id("displayed-text"));
	    js.executeScript("arguments[0].value='hello';",display);
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("show-textbox")).click();
	    driver.quit();
	}

}
