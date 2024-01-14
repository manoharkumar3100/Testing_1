package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  public void f() throws InterruptedException {
	// To Open homepage and maximize it
			 System.setProperty("webdriver.chrome.criver", "C:\\Users\\SV IT SOLUTIONS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 WebDriver  d1= new ChromeDriver();
			 d1.get("http://37.44.244.182:8081/Tutor-Inventor/");
			 d1.manage().window().maximize();
			//scroll page
		     JavascriptExecutor js = (JavascriptExecutor)d1;
		     js.executeScript("window.scrollBy(40,3000)");
		     
		    //Home page Registration
		    //Enter name
			WebElement n = d1.findElement(By.xpath("//input[@name='name']"));
			n.click();
			n.sendKeys("Tejas Kulkarni");
			Thread.sleep(3000);
			
			// Enter Mobile
			WebElement p= d1.findElement(By.xpath("//input[@name='phone']"));
			p.click();
			p.sendKeys("98765432210");
			Thread.sleep(200);
			
			// Enter Email
			WebElement e1= d1.findElement(By.xpath("//input[@placeholder='Your Email Address']"));
			e1.click();
			e1.sendKeys("tejas12@gmail.com");
			Thread.sleep(2000);
  }
}
