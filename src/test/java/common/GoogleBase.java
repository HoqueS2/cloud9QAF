package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	public WebDriver driver;

	String browser = "chrome";

	public void lauchBrowser() {
		if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();// Launching the driver in the memory
			driver = new ChromeDriver();
		} else if (browser == "firefox") {
			WebDriverManager.firefoxdriver().setup();// Launching the driver in the memory
			driver = new FirefoxDriver();
		} else if (browser == "safari") {
			WebDriverManager.operadriver().setup();// Launching the driver in the memory
			driver = new OperaDriver();
		} else {
			System.out.println("Wrong Browser");
		}

		// driver.get("http://www.google.com");
		driver.manage().window().maximize();// this will maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBrowser() {
		driver.quit();

	}

}
