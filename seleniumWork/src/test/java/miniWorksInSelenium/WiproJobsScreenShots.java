package miniWorksInSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WiproJobsScreenShots {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver(); // launching web browser
		driver.manage().window().maximize(); // screen maximize
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit wait
        driver.get("https://www.google.co.in/"); // url
        driver.findElement(By.name("q")).sendKeys("wipro jobs" + Keys.ENTER); // search wipro
        Thread.sleep(5000);
        TakesScreenshot take = (TakesScreenshot) driver; // typecasting
        File src = take.getScreenshotAs(OutputType.FILE); // temporary area
        File dest = new File("./screenshot/wipro.png"); // screenshots->foldername // first.png-->filename
        FileHandler.copy(src, dest); 

        driver.quit();

	}

}
