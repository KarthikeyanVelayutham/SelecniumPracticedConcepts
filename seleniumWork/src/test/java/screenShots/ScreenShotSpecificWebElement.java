package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotSpecificWebElement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/webelement.png");
		FileHandler.copy(src, dest); //to open right click ---> open with ---> other ---> web browser
		driver.quit();

	}

}
