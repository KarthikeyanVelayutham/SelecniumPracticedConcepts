package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDisabledTextBox {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    driver.get("https://demoapp.skillrary.com/");
	    WebElement textBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value='hello';",textBox);
	    driver.quit();
	}
}
