package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		/*
		 * WebElement email=driver.findElement(By.id("email"));
		 * email.sendKeys("shivshankar.mathapati"); WebElement
		 * password=driver.findElement(By.id("pass")); password.sendKeys("Twpjagwt p");
		 * WebElement login=driver.findElement(By.name("login"));
		 * System.out.println("Login button is enabled: "+login.isEnabled());
		 * System.out.println("Element is displayed: "+login.isDisplayed());
		 * System.out.println("Tag name: "+login.getTagName()); login.click();
		 * driver.navigate().to(
		 * "https://www.facebook.com/shivshankar.mathapati/profile/"); driver.quit();
		 */
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}
}
