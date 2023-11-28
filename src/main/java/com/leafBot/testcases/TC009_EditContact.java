package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC009_EditContact extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC009_EditContact";
		testDescription="Edit existing Contact on LeafTaps";
		nodes = "Contacts";		
		dataSheetName="TC009";
		category="Smoke";
		authors="Hari";
	}
	
	@Test(dataProvider="fetchData")
	public void editContact(String userName, String password, String firstName, String description) {
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
		.clickEditContactLink()
		.enterDescription(description)
		.clickUpdateContactSubmit()
		.verifyDescription(description);
		
		
	}
}
