package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubAutoLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		System.out.println("Title before login: "+driver.getTitle());
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("shivshankar.mathapati@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Shiv@8975");
		WebElement login=driver.findElement(By.name("commit"));
		System.out.println("Sign in button is enables: "+login.isEnabled());
		System.out.println("Element is displayed: "+login.isDisplayed());
		System.out.println("Tag Name: "+login.getTagName());
		login.click();
		System.out.println("Title after login: "+driver.getTitle());
	}
}
