package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver(); //for blank page
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/computers");
	Actions action = new Actions(driver); //for mouse hover create a Action type object 
	action.moveToElement(driver.findElement(By.partialLinkText("COMP"))).perform(); //to hover
	Thread.sleep(3000);
	action.doubleClick().perform(); // for double click
	WebElement ele = driver.findElement(By.id("small-searchterms"));
	action.contextClick(ele).perform(); // to perform right click
	action.click().perform();
	
	
	
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions action1 = new Actions(driver);
	WebElement src = driver.findElement(By.id("box5"));
	WebElement dest = driver.findElement(By.id("box103"));
	action1.dragAndDrop(src, dest).perform();// to drag and drop
	
	
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions action2 = new Actions(driver);
	WebElement srcs = driver.findElement(By.id("box5"));
	WebElement dests = driver.findElement(By.id("box103"));
	action2.clickAndHold(srcs).perform(); //to hold
	action2.release(dests).perform(); //to release the holded
	
	
	
	driver.navigate().to("https://www.wikipedia.org/");
	Actions action3 = new Actions(driver);
	action3.sendKeys(Keys.PAGE_DOWN).perform(); //to perform scroll up
	driver.quit();

}
}
