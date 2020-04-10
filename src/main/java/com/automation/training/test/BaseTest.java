package com.automation.training.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.training.MyDriver;
import com.automation.training.pages.WikiHomePage;

public class BaseTest {

	MyDriver myDriver;

	private WikiHomePage wikiHome;

	@BeforeSuite(alwaysRun = true)
	@Parameters({ "browser" })
	public void beforeSuit(String browser) {
		myDriver = new MyDriver(browser);
		wikiHome = new WikiHomePage(myDriver.getDriver());
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		wikiHome.dispose();
	}
	
	public WikiHomePage getWikiHomePage() {
		return wikiHome;
	}

}
