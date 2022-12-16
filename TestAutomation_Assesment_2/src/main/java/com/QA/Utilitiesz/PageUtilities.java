package com.QA.Utilitiesz;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	 public static void sendInput(WebElement ele,String input) {
    	 ele.clear();
    	 ele.sendKeys(input);
	 
 }
	 
	 
    
     public static void scrollTillEle(WebDriver driver, WebElement ele) {
    	 ((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);",ele);
     }
     public static String getText(WebElement ele) {
    	  return ele.getText();
    	 
     }
     public static boolean isDisplayed(WebElement ele) {
    	 ele.isDisplayed();
    	 return false;
    	 
     }
     public static void selectCheckBox(WebElement ele) {
    	 if(!ele.isSelected()) {
    		ele.click(); 
    	 }
    
    	 
     }
     public static void Screenshot(WebDriver driver) throws IOException {
		  
 		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);    
         FileUtils.copyFile(screenshot, new File ("D:\\Selenium_WorkPlaces\\Bootcamp-Dec-7\\Screenshot\\test3.png"));  
     
 	}
     public static void clickBtn(WebDriver driver,WebElement element)
     {
         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(element));
         element.click();
     }
     public static void ActionClick(WebDriver driver,WebElement ele) {
    	 Actions action= new Actions(driver);
    	 action.moveToElement(ele).click().build().perform();
    	 
     }//double click
     
     public void DoubleClick(WebDriver driver,WebElement ele) {
    	 Actions action= new Actions(driver);
    	 action.moveToElement(ele).doubleClick().build().perform();
    	 
     }//Right click
     public void contextClick(WebDriver driver,WebElement ele) {
    	 Actions action= new Actions(driver);
    	 action.moveToElement(ele).contextClick().build().perform();;
    	 
     }
     //hover
     public void Hover(WebDriver driver,WebElement ele) {
    	 Actions action= new Actions(driver);
    	 action.moveToElement(ele).build().perform();
    	 
     }//ENTER key press 
     public void EnterKey(WebDriver driver,WebElement ele) {
    	 Actions action= new Actions(driver);
    	 action.sendKeys(Keys.ENTER);
    	 
     }//Multiple key presss-keydown(hold).keyup(realase)
     public void MutlipleKeyPress(WebDriver driver,WebElement ele) {
    	 Actions action= new Actions(driver);
    	 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    	 
     }
     




}
