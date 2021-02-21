package webTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downoads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Testfirstname");
		
		WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("testlastName");
		
		WebElement rb_gender=driver.findElement(By.id("sex-0"));
		rb_gender.click();
		
		WebElement rb_experienc=driver.findElement(By.id("exp-0"));
		rb_experienc.click();
		
		WebElement date= driver.findElement(By.id("datepicker"));
		date.sendKeys("21/2/2021");
		
		WebElement ckb1_profession= driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		ckb1_profession.click();
		
		WebElement ckb2_profession= driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		ckb2_profession.click();
		
		WebElement ckb_tools= driver.findElement(By.id("tool-2"));
		ckb_tools.click();
		
		WebElement dp_Continents=driver.findElement(By.id("continents"));
		Select select = new Select(dp_Continents);
		select.selectByVisibleText("Asia");
		
		
		WebElement seleniumCommands=driver.findElement(By.id("selenium_commands"));
		Select select1 = new Select(seleniumCommands);
		select1.selectByVisibleText("WebElement Commands");
		
//		WebElement photo=driver.findElement(By.id("photo")).sendKeys("D:\\aditya\\IMG_20170612_184508019");
//		photo.click();
//		driver.findElement(By.id("photo")).sendKeys("D:\\aditya\\IMG_20170612_184508019");
		
		driver.findElement(By.id("submit")).click();
		
		
	}

}
