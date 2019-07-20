package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmLogin {
	WebDriver driver;
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	public void StartUrl() throws InterruptedException {
	    driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(3000);
		
	}
	public void enterUN() {
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("dubeymohan48@gmail.com");
		
	}
	public void enterPswd(String password) {
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys(password);
	}
	public void clickLogin() throws InterruptedException {
		Thread.sleep(8000);
		WebElement click = driver.findElement(By.xpath("//div[text()='Login']"));
		click.click();
		
	
	}
	public void Contacts() throws InterruptedException {
		Thread.sleep(8000);
		WebElement contact = driver.findElement(By.xpath("//div[contains (text(),'Contacts activity stream')]"));
		contact.isDisplayed();
		
		
	}
	public void Deals() throws InterruptedException {
		Thread.sleep(8000);
		WebElement deal = driver.findElement(By.xpath("(//div[contains (text(),'Deals')])[2]"));
		deal.isDisplayed();
		
	}
	public void CallQueue() {
		WebElement call = driver.findElement(By.xpath("(//span[contains (text(),'Call Queue')])[1]"));
		call.isDisplayed();
	}
	public void campaign() throws InterruptedException {
		Thread.sleep(5000);
		WebElement camp = driver.findElement(By.xpath("//a[@href='/campaigns']"));
		camp.click();
		
	}  
	public void validatePage() throws InterruptedException {
		Thread.sleep(5000);
		WebElement header = driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']"));
		header.isDisplayed();
	}
  public void clickNew() throws InterruptedException {
	  WebElement newcreate= driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[1]"));
	  Thread.sleep(5000);
	  newcreate.click();  
    }
  public void enterName() throws InterruptedException {
	  WebElement entname=driver.findElement(By.xpath("(//*[@type='text'])[2]"));
	  Thread.sleep(5000);
	  entname.sendKeys("valvo");
	  
	  
  }
  public void enterEmail() {
	  WebElement entemail=driver.findElement(By.xpath("(//div[@name='transport_type']"));
	  entemail.click();
  }
  public void checkbox() {
	  WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox']"));
	  checkbox.click();
	}
 
public void submit() {
WebElement submit=driver.findElement(By.xpath("//button[@class='ui linkedin button'] "));
submit.click();
}

	
	

}