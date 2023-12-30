package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Suubramanian/Downloads/seleniumWork/iframefile");
		driver.findElement(By.xpath("//a[contains(text(),'iframe')]")).click();
		driver.switchTo().frame("FR1");
		driver.findElement(By.xpath("(//a[contains(text(), 'Books')])[1]")).click();
		driver.quit();
	}
}
