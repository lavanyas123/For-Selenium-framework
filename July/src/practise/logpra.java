package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.ssutility;

public class logpra {
	 static WebDriver driver=new FirefoxDriver();
@Test()
public void ss()
{
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("aa")).click();
}
@AfterMethod
public void Teardown(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		File tgt=new File(".\\screenshots\\fff.png");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, tgt);
	}
}



}
