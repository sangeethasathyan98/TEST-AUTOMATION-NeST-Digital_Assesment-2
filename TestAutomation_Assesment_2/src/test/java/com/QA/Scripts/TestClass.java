package com.QA.Scripts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.QA.Constants.AutomationConstants;
import com.QA.Pages.AddEmployees;
import com.QA.Pages.AdminHome;
import com.QA.Pages.ClickAdd;
import com.QA.Pages.LoginPage;
import com.QA.Utilitiesz.ExcelUtility;
import com.QA.Base.Base;

public class TestClass extends Base {
		    LoginPage objLogin;
		    AdminHome adminHome;
	   ClickAdd clickadd;
	   AddEmployees addemployee;
	       
	       @Test(priority=1)
	        public void LoginPageVerification() throws Exception {
	            
	            objLogin= new LoginPage(driver);
	            String username= ExcelUtility.readDetails(0, 0);
	            String actUsername=objLogin.SetUsername(username);
	            Assert.assertEquals(AutomationConstants.expUsername,actUsername);
	            String password= AutomationConstants.expPassword;
	            objLogin.SetPassword(password);
	            Thread.sleep(1000);
		       // String actPassword=objLogin.SetPassword(password);
		        //Assert.assertEquals(AutomationConstants.expPassword,actPassword);
		        
		        
		            objLogin.ClickLogin();
		           
	        }
	       @Test(priority=2)
	        public void AdminHome() throws Exception
	        {
	    	 
	         Thread.sleep(1000);
	         adminHome=new com.QA.Pages.AdminHome(driver);
	         adminHome.ListEmployee();
	        }
	       @Test(priority=3)
	        public void ClickAdd() throws Exception
	        {
	    	 
	         Thread.sleep(1000);
	         clickadd=new ClickAdd(driver);
	         clickadd.ClickAddEmployee();
	        }
	       @Test(priority=4)
	        public void AddEmployee() throws Exception {
	            addemployee=new AddEmployees(driver);
	            String username= AutomationConstants.name;
	            addemployee.SetUsername(username);
	           String Employeeid=AutomationConstants.employeeid;
	           addemployee.SetEmployeeId(Employeeid);
	           String password=AutomationConstants.pwd;
	           addemployee.Setpwd(password);
	           String confpwd=AutomationConstants.cpassword;
	           addemployee.SetConfirmPassword(confpwd);
	           String Useremail=AutomationConstants.email;
	           addemployee.SetEmail(Useremail);
	           String userphone=AutomationConstants.phone;
	           addemployee.SetPhone(userphone);
	           String Useraddress=AutomationConstants.address;
	           addemployee.SetAddress(Useraddress);
	            
		     
		        
		            addemployee.ClickLogin();
		           
	        }

	        
}
