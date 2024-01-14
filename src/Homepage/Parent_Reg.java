package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Reg {

	public static void main(String[] args) throws InterruptedException {
		// To Open homepage and maximize it
		 System.setProperty("webdriver.chrome.criver", "C:\\Users\\SV IT SOLUTIONS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver  d1= new ChromeDriver();
		 d1.get("http://37.44.244.182:8081/Tutor-Inventor/");
		 d1.manage().window().maximize();
		
		// Click on Enquiry Here
		WebElement a1= d1.findElement(By.xpath("//button[@data-toggle='modal']"));
		a1.click();
		Thread.sleep(3000);
		
		
		// Enter Parent Name
		WebElement parent= d1.findElement(By.xpath("//input[@name='parentname']"));
		parent.click();
		parent.sendKeys("Tejas Kulkarni");
		Thread.sleep(3000);
		
		// Enter Child Name
		WebElement child= d1.findElement(By.xpath("//input[@name='childname']"));
		child.click();
		child.sendKeys("Manohar");
		Thread.sleep(3000);
		
		
		// Enter Contact No.
		WebElement contact= d1.findElement(By.xpath("//input[@name='contactnumber']"));
		contact.click();
		contact.sendKeys("9834023456");
		Thread.sleep(3000);
		
		// Scroll list to select board 1
		WebElement board = d1.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div[4]/div"));
		//WebElement board = d1.findElement(By.xpath("//div[@class='nice-select form-control w-100 my-2']"));
		board.click();
		Thread.sleep(3000);
		
		// Select CBSC
		//WebElement k = d1.findElement(By.xpath("//li[@data-value='CBSC']"));
		//k.click();
		//Thread.sleep(3000);
		
		// Select SSC/ HSC
		WebElement k2= d1.findElement(By.xpath("//li[@data-value='SSC/HSC']"));
		k2.click();
		Thread.sleep(2000);
		
		// Select General
		//WebElement j2= d1.findElement(By.xpath("//li[@data-value='General']"));
		//j2.click();
		//Thread.sleep(3000);
		
		// Select Other
		//WebElement q2= d1.findElement(By.xpath("//li[text()='Other']"));
		//q2.click();
		//Thread.sleep(3000);
		
		// Select Course
		WebElement c2= d1.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div[5]/div"));
		c2.click();
		Thread.sleep(2000);
		
		// Select 1st To 10th
		//WebElement a2= d1.findElement(By.xpath("//li[@data-value='1st to 10th']"));
		//a2.click();
		//Thread.sleep(3000);
		
		// Select 11th To 12th
		//WebElement b2= d1.findElement(By.xpath("//li[@data-value='11th to 12th']"));
		//b2.click();
		//Thread.sleep(3000);
		
		// Select Graduation Courses
		WebElement j2= d1.findElement(By.xpath("//li[text()='Graduation Courses']"));
		j2.click();
		Thread.sleep(3000);
		
		// Select Spoken English Courses
		//WebElement j2= d1.findElement(By.xpath("//li[text()='Spoken English']"));
		//j2.click();
		//Thread.sleep(3000);
		
		// Select Other
		//WebElement m2= d1.findElement(By.xpath(""));
		//m2.click();
		//Thread.sleep(3000);	
		
		// Enter Address Details
		WebElement add= d1.findElement(By.xpath("//input[@name='area']"));
		add.click();
		add.sendKeys("A-block Manohar Niwas Bhusawal");
		Thread.sleep(3000);
		
		// Enter email 
		WebElement e = d1.findElement(By.xpath("//input[@placeholder='Enter Your Email']"));
		e.click();
		e.sendKeys("tejas@gmail.com");
		Thread.sleep(3000);

		// Enter password
		WebElement p = d1.findElement(By.xpath("//input[@name='password']"));
		p.click();
		p.sendKeys("Tejas@123");
		Thread.sleep(3000);
		
		// Enter register as student
		//WebElement std= d1.findElement(By.xpath("//button[@class='btn btn-success']"));
		//std.click();
		//Thread.sleep(3000);
	
		// Login As Parent
		WebElement x1= d1.findElement(By.xpath("//a[@href='parentLoginPage']"));
		x1.click();
		Thread.sleep(3000);				
	}
}
