package com.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	WebDriver driver;
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
	public void Click()
	{
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/a/img")).click();
	}
	public void Screenshots() throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("screenshot\\TaskScreenshot.jpg"));
	}
}

	
