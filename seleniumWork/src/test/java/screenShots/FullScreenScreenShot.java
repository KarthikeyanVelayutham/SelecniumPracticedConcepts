package screenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FullScreenScreenShot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		TakesScreenshot take = (TakesScreenshot)driver; //typecasting
		File src = take.getScreenshotAs(OutputType.FILE); //class //returntype for src file //temporary area
		File dest = new File("./screenshot/fullScreen.png"); //class //permanent area //first.png-->filename
		FileHandler.copy(src, dest); //class
		
		driver.quit();

	}

}
