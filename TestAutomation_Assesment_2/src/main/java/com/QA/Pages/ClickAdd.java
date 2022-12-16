package com.QA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Utilitiesz.PageUtilities;

public class ClickAdd {
	WebDriver driver;
	//@FindBy(xpath  = "//a[contains(.,'Employee')]")
	@FindBy(xpath  = "(//a[@id='addButton'])")
   private WebElement clickadd;	      
    
	public ClickAdd(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
     public void ClickAddEmployee() throws Exception {        
         Thread.sleep(1000);
         PageUtilities.ActionClick(driver, clickadd);
        clickadd.click();
        }

}
