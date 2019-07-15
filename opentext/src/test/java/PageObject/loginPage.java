package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import BasePage.Commonpage;



public class loginPage extends Commonpage {

	public WebDriver driver;
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public void launchURL() {
		
		driver=new ChromeDriver();
	    driver.get("http://billing.truweight.in/admin/dashboard");
	    driver.manage().window().maximize();
	}
	
	public void Signin() throws InterruptedException {
		Thread.sleep(8000);
		Actions action=new Actions(driver);
		WebElement sign = driver.findElement(By.xpath("//div[@class='abcRioButtonContentWrapper']"));
		action.moveToElement(sign).doubleClick().build().perform();
//		sign.click();
		clickElement(sign);
	}
	public void enterUsername(String username) throws InterruptedException {
//		Set<String> win=driver.getWindowHandles();
//		Iterator<String> itr=win.iterator();
//		String parentId=itr.next();
//		driver.switchTo().window(parentId);
		Thread.sleep(8000);
//		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("identifierId"));
		un.sendKeys(username);
	}
	
	public void enterNext() throws InterruptedException {
		Thread.sleep(8000);
		WebElement next = driver.findElement(By.xpath("//*[text()=\"Next\"]"));
		next.click();
	}
	public void enterpassword() {
		WebElement pw = driver.findElement(By.xpath("(//*[text() ='Enter your password']"));
		pw.sendKeys("Truweight@1988");
	}
	public void clickLogin() {
		WebElement lg =driver.findElement(By.xpath("//*[text()=\"Next\"]"));
		lg.click();
	}
}
