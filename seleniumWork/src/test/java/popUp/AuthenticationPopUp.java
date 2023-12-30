package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//usename password popup(or)authentication popup
				//---> in url itself we have to give username and password
				WebDriver driver = new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    driver.manage().window().maximize();
			    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			    Thread.sleep(2000);
			    driver.quit();
	}

}
