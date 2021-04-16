package com.qa.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.acti.base.DriverScript;

/*
 * Title:LoginPage
 * Developer:Shantosh
 * Date Created:4/08/2021
 * Date Modified:
 * Verified By:Sharmistha
 */

public class LoginPage  extends DriverScript {
	
	@FindBy(id="username") WebElement usernameB;
	@FindBy(name="pwd") WebElement passwordTB;
	
			
}
	

