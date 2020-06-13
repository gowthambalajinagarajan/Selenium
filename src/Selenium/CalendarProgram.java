package Selenium;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Calendar;

import java.util.List;

public class CalendarProgram {
	
	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		Calendar obj=Calendar.getInstance(TimeZone.getDefault());
		int value=obj.get(java.util.Calendar.DAY_OF_MONTH);
		List<WebElement> dates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//a"));
		for(WebElement e:dates) {
			int date=Integer.parseInt(e.getText());
			if(date==value) {
				e.click();
				break;
			}
		}
	}
}
