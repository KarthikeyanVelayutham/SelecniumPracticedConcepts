package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //for blank page //upcasting to access get screenshotas
		driver.manage().window().maximize(); //to maximize the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement searchText = driver.findElement(By.id("APjFqb"));
		searchText.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> ele =driver.findElements(By.xpath("//span[text()='selenium']"));
		int count = ele.size();
		System.out.println(count);
		for (WebElement webElement : ele) {
			System.out.println(webElement.getText());
		}
		ele.get(0).click();

	}

}
