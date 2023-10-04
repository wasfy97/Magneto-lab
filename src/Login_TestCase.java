import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_TestCase extends Parameters {
	WebDriver driver = new ChromeDriver();
   
	
	@BeforeTest
	public void myBeforeTest() {
     
		driver.get(url);
		WebElement login = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		login.click();
		
	}
	@Test()
	public void mytest() {
		
		
   WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));

		
		Email.sendKeys(email_add);
		
		
		WebElement Password = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']"));

		Password.sendKeys(Pass);
		
	
		
		
		WebElement CreateButton = driver.findElement(By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']	"));
		CreateButton.click();
		
		}
		
		
	@AfterTest
	public void myAfterTest() {}
		
	}
	


