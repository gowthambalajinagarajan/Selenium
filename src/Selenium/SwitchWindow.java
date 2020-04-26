package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement ele=driver.findElement(By.xpath("(//*[@target='_blank'])[1]"));
		ele.click();
		Actions ac=new Actions(driver);
		ac.doubleClick(ele).build().perform();
		
		Set<String> aw=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(aw);
		driver.switchTo().window(list.get(2));
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.quit();
		}

}
