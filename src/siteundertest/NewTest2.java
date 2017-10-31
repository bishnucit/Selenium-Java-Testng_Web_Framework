package siteundertest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class NewTest2 {
	public WebDriver driver = new FirefoxDriver();
	String appUrl = "https://www.google.com";
	String expectedTitle = "Google";
  @Test
  public void googlesearch() {
	  driver.get(appUrl);
	  driver.manage().window().maximize();
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
	  
	  
	  WebElement username = driver.findElement(By.id("lst-ib"));
	  username.clear();
	  username.sendKeys("Selenium");
	  WebElement SearchButton = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
	  SearchButton.click();
	  
	  Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");
	  
	  driver.quit();

  }
}
