package com.QA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.QA.Utilitiesz.PageUtilities;

public class AdminHome {
	WebDriver driver;
	//@FindBy(xpath  = "//a[contains(.,'Employee')]")
	@FindBy(xpath  = "(//a[@href='ListEmployee.aspx'])[2]")
   private WebElement adminhome;	      
    
	public AdminHome(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
     public void ListEmployee() throws Exception {        
         Thread.sleep(1000);
         PageUtilities.ActionClick(driver, adminhome);
        adminhome.click();
        }
}

