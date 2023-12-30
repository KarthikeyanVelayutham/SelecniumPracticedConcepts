package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//updating chrome setting popup
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.yatra.com/");
	    driver.quit();
	}

}
