package com.task;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class fboook {
	
	public WebDriver driver;
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
		  
	  {   System.out.println("Browser Opennott Successfully")
		  System.out.println("ssdfsfdsfdsfs");
		  System.out.println("In the open brwoser");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver();
		  System.out.println("Browser Open Successfully");
	  }
  }
  @Parameters({"url"})
  @Test(priority=1)
  public void enterurl(String urlname)
  {
	  driver.get(urlname);
	  System.out.println("Url entered successfully");
	  driver.manage().window().maximize();
  }
@Test
public void f()
{
	
}
}
