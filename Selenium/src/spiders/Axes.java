package spiders;

import org.openqa.selenium.By;

public class Axes extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td/a[text()='Download']")).click();
	}

}
