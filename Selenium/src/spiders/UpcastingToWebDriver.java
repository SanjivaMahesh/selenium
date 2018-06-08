package spiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingToWebDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentURL of the page is: " + currentUrl);
		driver.close();
	}

}
