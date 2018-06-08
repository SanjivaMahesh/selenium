package spiders;

import org.openqa.selenium.By;

public class Path extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do;jsessionid=1qxalcm9adjm9");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
