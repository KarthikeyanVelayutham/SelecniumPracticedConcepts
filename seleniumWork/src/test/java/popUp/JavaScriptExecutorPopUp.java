package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver(); //for blank page
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//javascript popup
		//for only ok option
		driver.findElement(By.xpath("//button[contains(text() , 'alert')]")).click();
 		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //for ok both for accept and dismiss //only ok option is present
		Thread.sleep(2000);
		
		
		//for ok and cancel option
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.partialLinkText("OK & Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text() , 'confirm')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); //for ok accept for cancel dismiss //as ok and cancel
		Thread.sleep(2000);
		
		//to send data
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text() , 'prompt')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("karthik"); //for alert with textbox
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[contains(text() , 'alert')]")).click();
 		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept(); //for ok both for accept and dismiss //only ok option is present
		Thread.sleep(2000);
		System.out.println(text);
		driver.quit();
	}

}
