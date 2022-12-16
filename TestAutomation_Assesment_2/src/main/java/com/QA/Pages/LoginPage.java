package com.QA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="(//input[@id='txtUsername' and @name='txtUsername' ])")
	    private WebElement Username;
	    
	@FindBy(xpath="(//input[@id='txtPassword' and @name='txtPassword'])")
	private WebElement Password;
	@FindBy(xpath="(//input[@id='btnSubmit' and @name='btnSubmit'])")
	private WebElement Login;




	public LoginPage(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	}



	public String SetUsername(String name)
	{   
	    System.out.println("hi");
	    Username.sendKeys(name);
	    return Username.getAttribute("value");
	     
	}
	public String SetPassword(String password)
	{       Password.sendKeys(password);    
	return Password.getAttribute("value");
	}



	


	public void ClickLogin()
	{        Login.click();          }



	   
	    
	}


