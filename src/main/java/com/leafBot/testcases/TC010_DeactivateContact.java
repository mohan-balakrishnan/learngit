package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC010_DeactivateContact extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC010_DeactivateContact";
		testDescription="Deactivate the existing contact";
		nodes = "Contacts";		
		dataSheetName="TC010";
		category="Smoke";
		authors="Hari";
	}
	
	@Test(dataProvider="fetchData")
	public void deactivateContact(String userName, String password, String firstName) {
		new LoginPage(driver, node)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickContactsLink()
		.clickFindContacts()
		.enterFirstName(firstName)
		.clickFindContactsButton()
		.clickFirstResultingContact()
		.clickDeactivateContactLink()
		.acceptDeactivateContact();
		
	}
}
