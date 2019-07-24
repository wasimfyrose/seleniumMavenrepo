package devOps;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class NewTest {
	WebDriver driver ;
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(ByName.name("userName")).sendKeys("mercury");
	  driver.findElement(ByName.name("password")).sendKeys("password");
	  Thread.sleep(1000);
	  driver.findElement(ByName.name("login")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  Assert.assertTrue(driver.getTitle().contains("Mercury"));
	  driver.close();
  }


 
}
