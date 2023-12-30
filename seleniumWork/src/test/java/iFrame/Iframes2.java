package iFrame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("click"));
		button1.click();
		String getText = button1.getText();
		System.out.println(getText);
		driver.switchTo().defaultContent();
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		int counts = count.size();
		System.out.println(counts);
		driver.quit();
	}
}
