package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopupAndDownloadPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       
        //file download
        driver.navigate().to("https://www.leafground.com/file.xhtml;jsessionid=node04q82t1f8dwp09jf9217dti09693044.node0");
        driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\Suubramanian\\Downloads\\seleniumWork\\fileUpload\\SQL_Practice.pdf");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        Thread.sleep(2000);
        driver.quit();

	}
	//file:///C:/Users/Suubramanian/Downloads/seleniumWork/fileUpload/SQL_Practice.pdf
}
