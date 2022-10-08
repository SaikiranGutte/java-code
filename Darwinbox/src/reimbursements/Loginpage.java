package reimbursements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\My Important files\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://travel2.qa.darwinbox.io/user/login");
		driver.findElement(By.id("UserLogin_username")).sendKeys("N43");
		driver.findElement(By.id("UserLogin_password")).sendKeys("123456789");
		driver.findElement(By.id("login-submit")).sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pulse_form\"]/div/div/div/div[3]/button[1]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("#src"));
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#src")));
		 driver.findElement(By.tagName(<img>));
	}

}
