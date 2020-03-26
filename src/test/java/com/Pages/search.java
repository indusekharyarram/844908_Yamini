package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
	WebDriver driver;
	By Administration=By.xpath("//img[@src='images/administration-button.gif']");
	By Username=By.name("login");
	By Password=By.name("password");
	By Login=By.name("DoLogin");
	By TaskList=By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a/img");
	//To do login and open taskmanager website 
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
		driver.findElement(Administration).click();
		driver.findElement(Username).sendKeys("admin");
		driver.findElement(Password).sendKeys("admin");
		driver.findElement(Login).click();
	}
	//click the task list
	public void Click()
	{
		driver.findElement(TaskList).click();
	}
	//To do assign to alex kniel 
	public void Assign()
	{
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[4]")).click();
	}
	//To do search 
	public void Search()
	{
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input")).click();
	driver.close();
	}
}
