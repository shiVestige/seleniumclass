package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver dv=new ChromeDriver();
		dv.get("https://www.gmail.com/");*/
		System.setProperty("webdriver.edge.driver", "./software/msedgedriver.exe");
		WebDriver dv1= new EdgeDriver();
		dv1.get("https://www.facebook.com/");
	}

}
