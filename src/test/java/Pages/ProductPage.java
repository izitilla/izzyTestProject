package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ProductPage {

	public ProductPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Add to basket')]")
	public WebElement addToBusketButton;
	
	@FindBy(xpath="//div[@class='images']")
	public WebElement image;
	
	@FindBy(xpath="//*[text()=' “Selenium Ruby” has been added to your basket.']")
	public WebElement commerceMessage;
}
