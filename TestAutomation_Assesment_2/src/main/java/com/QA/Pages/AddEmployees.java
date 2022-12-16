package com.QA.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployees {
	WebDriver driver;
	@FindBy(xpath="(//input[@id='ContentPlaceHolder1_txtName'])")
	    private WebElement Username;
	    
	@FindBy(xpath="(//input[@id='ContentPlaceHolder1_txtEmployeeId'])")
	private WebElement Employeeid;
	@FindBy(xpath="(//input[@id='ContentPlaceHolder1_txtPassword' and @name='ctl00$ContentPlaceHolder1$txtPassword' ])")
	private WebElement password;
	@FindBy(xpath="(//input[@id='ContentPlaceHolder1_txtConfirmPassword' and @name='ctl00$ContentPlaceHolder1$txtConfirmPassword' ])")
    private WebElement confpwd;
    
   @FindBy(xpath="(//input[@id='ContentPlaceHolder1_txtEmail'])")
   private WebElement Useremail;
   @FindBy(xpath="(//input[@id='ContentPlaceHolder1_txtMobileNumber'])")
   private WebElement userphone;
   @FindBy(xpath="(//textarea[@id='ContentPlaceHolder1_txtAddress'])")
   private WebElement Useraddress;
   @FindBy(xpath="(//select[@id='ContentPlaceHolder1_drpDesignation'])")
   private WebElement designation;
   @FindBy(xpath="(//select[@id='ContentPlaceHolder1_drpEmployeeType'])")
   private WebElement Employeetype;
   
   
   
   @FindBy(xpath="(//input[@id='ContentPlaceHolder1_btnSubmit'])")
   private WebElement btnclick;

	




	public AddEmployees(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	public String SetUsername(String name)
	{   
	    System.out.println("hi");
	    Username.sendKeys(name);
	    return Username.getAttribute("value");
	     
	}
	public String SetEmployeeId(String employeeid)
	{      Employeeid.sendKeys(employeeid);    
	return Employeeid.getAttribute("value");
	}
	public String Setpwd(String pwd)
	{   
	    System.out.println("hi");
	    password.sendKeys(pwd);
	    return password.getAttribute("value");
	     
	}
	public String SetConfirmPassword(String cpassword)
	{       confpwd.sendKeys(cpassword);    
	return confpwd.getAttribute("value");
	}
	public String SetEmail(String email)
	{       Useremail.sendKeys(email);    
	return Useremail.getAttribute("value");
	}public String SetPhone(String phone)
	{       userphone.sendKeys(phone);    
	return confpwd.getAttribute("value");
	}
	public String SetAddress(String address)
	{       Useraddress.sendKeys(address);    
	return Useraddress.getAttribute("value");
	}
	public String SetEmpType(String address)
	{       Useraddress.sendKeys(address);    
	return Useraddress.getAttribute("value");
	}
	public String SetEmployeeDesignation(String Designation)
	{       designation.sendKeys(Designation);    
	return designation.getAttribute("value");
	}
	
	
	public void ClickLogin()
	{        btnclick.click();          }


}
