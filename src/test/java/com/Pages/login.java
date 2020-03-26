package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class login {
	WebDriver driver;
	By Administration=By.xpath("//img[@src='images/administration-button.gif']");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	//To launch the browser
	public void Launch()
	{
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	//To open taskmanager website 
	public void Open() 
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}
	//To enter the username and password 
	public void Enter()
	{
      	driver.findElement(Administration).click();
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
	}
	//To click the click button 
	public void Click()
	{
		driver.findElement(Login).click();
		driver.close();
	}
}
