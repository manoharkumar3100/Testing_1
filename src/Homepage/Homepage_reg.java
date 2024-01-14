package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage_reg {

	public static void main(String[] args) throws InterruptedException {
		// To Open homepage and maximize it
		 // System.setProperty("webdriver.chrome.driver", "");
		  WebDriver  d1= new ChromeDriver();
		  d1.get("http://37.44.244.182:8081/Tutor-Inventor/");
		  d1.manage().window().maximize();
		  //scroll page
		  Thread.sleep(3000);
		  JavascriptExecutor js = (JavascriptExecutor)d1;
		  js.executeScript("window.scrollBy(40,3000)");	 
			     
	    //Home page Registration
		//Enter name
		  WebElement name = d1.findElement(By.xpath("//input[@name='name']"));
		  name.click();
		  name.sendKeys("Tejas Kulkarni");
		  Thread.sleep(3000);
				
		  // Enter Mobile
		  WebElement mob= d1.findElement(By.xpath("//input[@name='phone']"));
		  mob.click();
		  mob.sendKeys("9834023456");
		  Thread.sleep(200);
				
		  // Enter Email
		  WebElement email= d1.findElement(By.xpath("//input[@placeholder='Your Email Address']"));
		  email.click();
		  email.sendKeys("tejas124@gmail.com");
		  Thread.sleep(3000);
				
		  // Submitt Button
		  WebElement sub= d1.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
		  sub.click();
		  Thread.sleep(4000);
				
		  // Login page
		  // Username
		  Thread.sleep(2000);
		  WebElement log= d1.findElement(By.xpath("//input[@placeholder='Enter Your Username']"));
		  log.click();
		  log.sendKeys("tejas124@gmail.com");
		  Thread.sleep(3000);
				
		  // Password
		  WebElement pass= d1.findElement(By.xpath("//input[@placeholder='Enter Your Password']"));
		  pass.click();
		  pass.sendKeys("Tejas@123");
		  Thread.sleep(3000);
				
		  // Login As Parent
		  WebElement c1= d1.findElement(By.xpath("//button[@class='form-control btn btn-primary']"));
		  c1.click();
		  Thread.sleep(3000);
		  
		  //Register Here
		  WebElement reg1= d1.findElement(By.xpath("//a[text()=\" Register Here !!\"]"));
		  reg1.click();
		  Thread.sleep(3000);
		  
		  // Click on Enquiry Here
		  WebElement a1= d1.findElement(By.xpath("//button[@data-toggle='modal']"));
		  a1.click();
		  Thread.sleep(3000);
	}
}
