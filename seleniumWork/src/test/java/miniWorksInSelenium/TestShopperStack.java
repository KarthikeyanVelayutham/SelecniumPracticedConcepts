package miniWorksInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestShopperStack {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		//get url from notepad
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("./datas/url.txt");
		pro.load(fis);
		driver.get(pro.getProperty("url"));
		
		//login
		driver.findElement(By.id("loginBtn")).click();
		
		
		//username and password
		FileInputStream fis1 = new FileInputStream("./datas/username password.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet("s1");
		String username = sheet.getRow(0).getCell(1).getStringCellValue(); 
		String password = sheet.getRow(1).getCell(1).getStringCellValue(); 
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		
		
		//mouse hover to electronics
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@id='electronics']"));
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@id='electronics']/../div/aside/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//h1[text()='registered office address:']"));
		action.moveToElement(ele1).perform();
		
		
		//take screenshot
		TakesScreenshot sc = (TakesScreenshot)driver;
		//WebElement sc = driver.findElement(By.xpath("(//*[name()='svg' and @aria-hidden='true'])[8]"));
		Thread.sleep(2000);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/ShopperStack.png");
		FileHandler.copy(src, dest);

	}

}
