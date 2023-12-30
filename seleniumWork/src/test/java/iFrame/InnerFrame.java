package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrame {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		WebElement parentFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(parentFrame);
		WebElement childFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("karthikeyan");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
		driver.quit();
	}

}
