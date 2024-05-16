package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.ShopPage;
import Utilities.BaseClass;
import Utilities.commonMethods;

public class HomePageTest {

	CommonPage commonPage = new CommonPage();
	ShopPage shopPage = new ShopPage();
	HomePage homePage = new HomePage();
	ProductPage productPage = new ProductPage();
	
	@Test
	public void homePageWithThreeSlidersOnly() {
//	1) Open the browser	
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on Shop Menu
		commonPage.selectMainNavOption("shop");
//	4) Now click on Home menu button
		commonMethods.click(shopPage.HomeButton);
//	5) Test whether the Home page has Three Sliders only
		Assert.assertTrue(homePage.threeSliders.size()==3);
//	6) The Home page must contains only three sliders
		
		
	}
	
	@Test
	public void homePageWithThreeArrivalsOnly() {
//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on Shop Menu
		commonPage.selectMainNavOption("shop");
//	4) Now click on Home menu button
		commonMethods.click(shopPage.HomeButton);
//	5) Test whether the Home page has Three Arrivals only
		Assert.assertEquals(homePage.threeArrivals.size(), 3);
//	6) The Home page must contains only three Arrivals
		
	}
	
	@Test
	public void homePageImagesInArrivalsShouldNavigate() {
//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on Shop Menu
		commonPage.selectMainNavOption("shop");
//	4) Now click on Home menu button
		commonMethods.click(shopPage.HomeButton);
//	5) Test whether the Home page has Three Arrivals only
		Assert.assertEquals(homePage.threeArrivals.size(), 3);
//	6) The Home page must contains only three Arrivals
//	7) Now click the image in the Arrivals
		commonMethods.click(homePage.threeArrivals.get(0));
//	8) Test whether it is navigating to next page where the user can add that book into his basket.
		Assert.assertTrue(productPage.addToBusketButton.isDisplayed());
//	9) Image should be clickable and should navigate to next page where user can add that book to his basket
		commonMethods.click(productPage.addToBusketButton);
		String commerceMessage = productPage.commerceMessage.getText();
		System.out.println("commerceMessage: "+commerceMessage);
		Assert.assertTrue(productPage.commerceMessage.isDisplayed());
		//
	}

	
	
	
}
