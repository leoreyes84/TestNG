package com.automation.training.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.training.pages.ArticlePage;
import com.automation.training.pages.WikiHomePage;

public class WikiTest extends BaseTest {
	
	@Test
	@Parameters({"textoBuscado"})
	public void testWikiSearch(String textoBuscado) {
		WikiHomePage home = getWikiHomePage();
		ArticlePage articlePage = home.buscar(textoBuscado);
		Assert.assertEquals(textoBuscado, articlePage.getPageTitle());
	}

}
