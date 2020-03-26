package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {
	WebDriver driver;
	By Administration=By.xpath("//img[@src='images/administration-button.gif']");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	//To launch the browser 
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	//To open the taskmanager website 
	public void Open()
	{
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}
	//To enter the details and click the login
	public void Click()
	{
     	driver.findElement(Administration).click();
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
	//click on logout 
	public void Logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
	
