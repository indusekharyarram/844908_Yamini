package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	WebDriver driver;
	By Administration=By.xpath("//img[@src='images/administration-button.gif']");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void Open() 
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}
	public void Enter()
	{
		driver.findElement(Administration).click();
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
	}
	public void Click()
	{
		driver.findElement(Login).click();
	}
}