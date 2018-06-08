package spiders;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do;jsessionid=3ge8fb3bxtsg");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\screenshot\\actitime.png");
		FileUtils.copyFile(src, des);

	}

}
