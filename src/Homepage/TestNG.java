package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
  @Test
  public void f() {
	// To Open homepage and maximize it
			 System.setProperty("webdriver.chrome.criver", "C:\\Users\\SV IT SOLUTIONS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 WebDriver  d1= new ChromeDriver();
			 d1.get("http://37.44.244.182:8081/Tutor-Inventor/");
			 d1.manage().window().maximize();
  }
}
