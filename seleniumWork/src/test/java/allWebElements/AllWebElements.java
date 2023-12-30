package allWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllWebElements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.name("user[email]")).clear();
		driver.navigate().to("https://demo.opensourcebilling.org/en/users/sign_in");
		String attribute = driver.findElement(By.id("password")).getAttribute("name");
		System.out.println(attribute);
		String tagName = driver.findElement(By.name("user[email]")).getTagName();
		System.out.println(tagName);
		String cssValue = driver.findElement(By.name("user[email]")).getCssValue("font");
		System.out.println(cssValue);
		int getSize = driver.findElement(By.name("user[email]")).getSize().getHeight();
		System.out.println(getSize);
		int getSizes = driver.findElement(By.name("user[email]")).getSize().getWidth();
		System.out.println(getSizes);
		int getLocation = driver.findElement(By.name("user[email]")).getLocation().getX();
		System.out.println(getLocation);
		int getLocations = driver.findElement(By.name("user[email]")).getLocation().getY();
		System.out.println(getLocations);
		driver.findElement(By.id("user_login_btn")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Skip')]")).click();
	    driver.navigate().to("https://demo.opensourcebilling.org/en/users/sign_in");
	    driver.quit();
	}

}
