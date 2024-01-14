package Homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Teacher_reg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.criver","C:\\Users\\shivs\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();
		d1.get("http://37.44.244.182:8081/Tutor-Inventor/");
		d1.manage().window().maximize();
		
		// About us
		//WebElement about = d1.findElement(By.xpath("//a[@href=\"About-us\"]"));
		//about.click();
		
		
		//click on register Now
		WebElement n = d1.findElement(By.xpath("//button[@class='btn search_course_btn']"));
		n.click();
		
		WebElement name = d1.findElement(By.xpath("//input[@placeholder='Enter Your First Name']"));
		name.click();
		name.sendKeys("Tejas");
		Thread.sleep(3000);
		
		WebElement lastname = d1.findElement(By.xpath("//input[@placeholder='Enter Your Last name']"));
		lastname.click();
		lastname.sendKeys("Kulkarni");
		Thread.sleep(3000);
		
		WebElement email = d1.findElement(By.xpath("//input[@placeholder='Enter Your Email Id']"));
	    email.click();
		email.sendKeys("tejask437@gmail.com");
		Thread.sleep(3000);
		
		WebElement psw = d1.findElement(By.xpath("//input[@placeholder='Enter Your Password']"));
		psw.click();
		psw.sendKeys("Tejas@123");
		Thread.sleep(3000);
		
		WebElement cont = d1.findElement(By.xpath("//input[@placeholder='Enter Your Contact Number']"));
        cont.click();       
        cont.sendKeys("9874567326");
        Thread.sleep(3000);
		
        //Select state
		WebElement state = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[3]/div[2]/div"));
		state.click();
		Thread.sleep(3000);
		
		//Select Maharashtra
		WebElement sn = d1.findElement(By.xpath("//li[@data-value='Maharashtra']"));
		sn.click();
		Thread.sleep(3000);
		
		//Select city
		WebElement city = d1.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]"));
		city.sendKeys("Bhusawal");
		city.click();
		Thread.sleep(3000);
		
		//Select address / area
		WebElement address = d1.findElement(By.xpath("//input[@placeholder=\"Enter Your Area\"]"));
		address.click();
		address.sendKeys("a-block 16 b bhusawal");
		Thread.sleep(3000);
		
		//select working condition
		WebElement cond = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[4]/div[2]/div"));
		cond.click();
		Thread.sleep(3000);
		
		//Are you currently working
		//WebElement are = d1.findElement(By.xpath("//li[@data-value=\'Are you Currently Working?\']"));
		//are.click();
		//Thread.sleep(3000);
		
		//Select yes
		WebElement yes = d1.findElement(By.xpath("//li[@data-value='Yes']"));
		yes.click();
		Thread.sleep(3000);	
		
		//Select no
		//WebElement no = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[4]/div[2]/div/ul/li[3]"));
		//no.click();
		//Thread.sleep(3000);	
		
		//Scroll the vehicle option
		WebElement veh = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[4]/div[3]/div"));
	    veh.click();
		Thread.sleep(3000);	
		
		//Do you have vehicle
		//WebElement ask = d1.findElement(By.xpath("//li[@data-value="Do you have Vehicle?"]"));
		//ask.click();
		//Thread.sleep(3000);	
		
		//Yes
		//WebElement yes1 = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[4]/div[3]/div/ul/li[2]"));
		//yes1.click();
		//Thread.sleep(3000);	
		
		//No
		WebElement no1 = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[4]/div[3]/div/ul/li[3]"));
		no1.click();
		Thread.sleep(3000);	
				
		// Select DOB
		WebElement dob = d1.findElement(By.xpath("//input[@placeholder=\"Date of Birth\"]"));
	    dob.click();
		Thread.sleep(3000);
		
		// Enter DOB
		WebElement date = d1.findElement(By.xpath("//input[@type=\"date\"]"));
	    date.click();
	    date.sendKeys("02/23/1998");
		Thread.sleep(3000);
		
		//Enter Education Details
		WebElement Education = d1.findElement(By.xpath("//input[@placeholder=\"Enter Your Education Details\"]"));
	    Education.click();
	    Education.sendKeys("B.Tech in Electronics And Telecommunication");
		Thread.sleep(3000);
		
		//Enter Favourite subjects
		WebElement Subject = d1.findElement(By.xpath("//input[@placeholder=\"Enter the Subjects you are interested to Teach\"]"));
	    Subject.click();
	    Subject.sendKeys("History, English, Maths"); 
		Thread.sleep(3000);	
		
		//Register As Teacher
		//WebElement R1 = d1.findElement(By.xpath("//button[@class='form-control btn btn-primary']"));
		//R1.click();
		//Thread.sleep(3000);	
		
		//Login Here
		WebElement l1 = d1.findElement(By.xpath("/html/body/section/div/div/div/form/div[8]/div[2]/a"));
		l1.click();
		Thread.sleep(3000);	


		
		
		
		
	}
}
