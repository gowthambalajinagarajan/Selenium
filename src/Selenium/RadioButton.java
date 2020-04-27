package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RadioButton123 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement el : radio){
		el.click();
		}
}
}
