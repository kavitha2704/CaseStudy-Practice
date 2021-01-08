package com.qa.seleniumcasestudy;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Droptextbutton 
	{
		public static void main(String[] args) throws InterruptedException
		{
			//System.setProperty("webdriver.gecko.driver", "D://Kavitha Selenium Automation//Selenium Automation//casestudyselenium//Drivers//geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "D://Kavitha Selenium Automation//Selenium Automation//casestudyselenium//Drivers//chromedriver.exe");
			//WebDriver driver=new FirefoxDriver();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("pinky");
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']")).sendKeys("tinky");
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']")).sendKeys("testabc2@gmail.com");
	        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @type='password']")).sendKeys("test@123");
	        WebElement ele=driver.findElement(By.id("day"));
	        Select sel=new Select(ele);
	        sel.selectByValue("6");
	        WebElement ele1=driver.findElement(By.id("month"));
	        Select sel1=new Select(ele1);
	        sel1.selectByVisibleText("Jun");
	        WebElement ele2=driver.findElement(By.id("year"));
	        Select sel2=new Select(ele2);
	        sel2.selectByValue("1992");
	        
	        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
	       
	       
	       
	       driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	       driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph- _5f0v']")).sendKeys("testabc2@gmail.com");
	       driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	       Thread.sleep(2000);
	       driver.close();
		
		} 
	}