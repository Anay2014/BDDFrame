package BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonpage {
	public WebDriver driver;
 public void Wait() {
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
 }
 
 public void waitForElement(String element) {
WebDriverWait	 wait=new WebDriverWait(driver, 5);
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
 }
 public void clickElement(WebElement element) {
	 element.click();
	 
 }
 
}
