package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNgclass {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium_Training_Iguru\\Selenium\\Software\\chromedriver.exe");
	  WebDriver d =new ChromeDriver();
	  d.get("http://newtours.demoaut.com/");
	  By userName=By.name("userName");
	  By userPassword=By.name("password");
	  By btnLogin=By.name("login");
	  d.findElement(userName).sendKeys("mercury");
		
		d.findElement(userPassword).sendKeys("mercury");
		d.findElement(btnLogin).click();
	  
  }
  
   
}
