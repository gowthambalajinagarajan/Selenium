package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String Colour=driver.findElement(By.xpath("//*[@class='nav-sprite nav-logo-tagline nav-prime-try']")).getCssValue("font-size");
		System.out.println(Colour);
	/*	WebElement ele=driver.findElement(By.id("nav-hamburger-menu"));
		Actions ac=new Actions(driver);
		ac.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		List<WebElement> URL=driver.findElements(By.tagName("a"));
		System.out.println(URL.size());
		for(WebElement b:URL) {
			System.out.println(b.getAttribute("href"));
		}*/
	}

}
