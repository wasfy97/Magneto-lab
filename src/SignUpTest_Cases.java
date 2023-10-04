import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest_Cases extends Parameters {
	
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void myBeforeTest() {
		driver.get(url);

	}
	
	@Test()
	public void mytest() {
		
		WebElement Create = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));
		Create.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		FirstName.sendKeys(randomFirstName);
		
		WebElement LastName = driver.findElement(By.xpath("//input[@id='lastname']"));
		LastName.sendKeys(randomLastName);
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email_address']"));
		Email.sendKeys(email_add);
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys(Pass);
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		ConfirmPassword.sendKeys(Pass);
		
		WebElement CreateButton = driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]"));
		CreateButton.click();
		
		
		Check.assertAll();

	}
	@AfterTest
	public void myAfterTest() {
		
	}

}
