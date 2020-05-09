package Selenium;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Calendar {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
//		Calendar obj= Calendar.getInstance(TimeZone.getDefault());
//		int value=obj.get(Calendar.DAY_OF_MONTH);
		List<WebElement> dates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//a"));
		for(WebElement e:dates) {
			int date=Integer.parseInt(e.getText());
			if(date==10) {
				e.click();
				break;
			}
		}
	}

	

	
	
}
