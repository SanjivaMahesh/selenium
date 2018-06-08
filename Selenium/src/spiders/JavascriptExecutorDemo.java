package spiders;

import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutorDemo extends BaseClass {
	public static void main(String[] args) {
		driver.get("http://localhost/login.do;jsessionid=3orsfj8a4lggb");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementByName('username')[0].value='admin'");
		jse.executeScript("document.getElementByName('pwd')[0].value='manager'");
		jse.executeScript("document.getElementById('loginButton').click()");
	}

}
