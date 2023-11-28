package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyAccountsPage extends ProjectSpecificMethods{

	public MyAccountsPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		
	}
	
}
