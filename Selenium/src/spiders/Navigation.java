package spiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.navigate().to(
				"https://www.google.com/search?source=hp&ei=PisVW6_UHcHLvgSxhpzoDg&q=facebook&oq=fac&gs_l=psy-ab.3.0.0i131k1l3j0l4j0i131k1l2j0.1810.2083.0.3472.3.3.0.0.0.0.135.135.0j1.1.0....0...1c.1.64.psy-ab..2.1.133....0.Upn_7oYoiec");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
