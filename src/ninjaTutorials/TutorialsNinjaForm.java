package ninjaTutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialsNinjaForm {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\OneDrive\\Desktop\\MySeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://tutorialsninja.com/demo/");
	
	
    WebElement myaccount=driver.findElement(By.xpath("//a[@title='My Account']"));
	myaccount.click();
	
	 WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
	 register.click();
    
     WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
     firstName.sendKeys("test1");
     
     WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
     lastName.sendKeys("test2"); 
	
     WebElement eMail=driver.findElement(By.xpath("//input[@name='email']"));
     eMail.sendKeys("test12@abc.com");
     
     WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
     phone.sendKeys("8787878787");
     
     WebElement password=driver.findElement(By.xpath(" //input[@name='password']"));
     password.sendKeys("123Test");
     
     WebElement confirmPass=driver.findElement(By.xpath(" //input[@name='confirm']"));
     confirmPass.sendKeys("123Test");
     
     WebElement radioButton=driver.findElement(By.xpath("//input[@value='0']"));
     radioButton.click();
     
     WebElement checkbox=driver.findElement(By.xpath(" //input[@name='agree']"));
     checkbox.click();
     
     WebElement submitButton=driver.findElement(By.xpath(" //input[@type='submit']"));
     submitButton.click();
     
     Thread.sleep(2000);
     
     driver.close();
   
	}

}
